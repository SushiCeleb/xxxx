package sample.hello.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.hello.entity.SetType;
import sample.hello.entity.UnitArm;
import sample.hello.entity.UnitLeg;
import sample.hello.entity.UnitRear;
import sample.hello.entity.UnitSub;
import sample.hello.form.Form;
import sample.hello.repository.UnitArmRepository;
import sample.hello.repository.UnitLegRepository;
import sample.hello.repository.UnitRearRepository;
import sample.hello.repository.UnitSubRepository;
import sample.hello.service.SetTypeService;
import sample.hello.service.UnitArmService;
import sample.hello.service.UnitLegService;
import sample.hello.service.UnitRearService;
import sample.hello.service.UnitSubService;
import sample.hello.utility.SerchUnit;

//コントローラ宣言
@Controller
@EnableAutoConfiguration // 諸々の自動設定をしてくれる
@RequestMapping
public class SerchController {
	@Autowired
	UnitArmService serviceArm;
	@Autowired
	UnitRearService serviceRear;
	@Autowired
	UnitLegService serviceLeg;
	@Autowired
	UnitSubService serviceSub;
	@Autowired
	SetTypeService serviceSetType;
	@Autowired
	UnitArmRepository aRepository;
	@Autowired
	UnitRearRepository rRepository;
	@Autowired
	UnitLegRepository lRepository;
	@Autowired
	UnitSubRepository sRepository;
	/**
	 * トップページ(仮)
	 *
	 * @return
	 */
	@GetMapping("")
	public String home() {
		return "top";
	}
	@GetMapping("/jsrenderTest")
	public String jsRenderTest() {
		return "jsrenderTest";
	}
	/**
	 * 検索画面
	 *
	 * @param model
	 * @return
	 */
	// 合成アノテーションGetMapping 元：RequestMapping(val,method = RequestMethod.GET)
	@GetMapping("/serch")
	public String all(Model model, Form form) {
		// form
		model.addAttribute("dbform", new Form());

		// チェックボックスの値の格納、表示(部位)
		SerchUnit.checkboxUnitbui(form);
		model.addAttribute("bui", form.getCheckUnitsyu());

		//セットタイプ条件の格納表示（セットタイプ）
		SerchUnit.checkSetTypes(form);
		model.addAttribute("setTypes", form.getCheckSetTypes());

		// セットタイプ選択用
		List<String> settype = serviceSetType.selectSetType();
		model.addAttribute("settype", settype);

		System.out.println("getmapping");

		// serch.htmlを指定してる（RequestMethod.GET）
		return "serchAndCalc";
	}
	/**
	 * 検索ボタン押下<br>
	 * テキスト ：部分一致<br>
	 * プルダウン系 ：完全一致<br>
	 * 数値 ：以上(>=)
	 *
	 * @param form
	 * @param model
	 * @return
	 */
	@PostMapping(path = "/oldSerch",params ="oldSerch")
	public String unitSerch(@ModelAttribute Form form, Model model) {

		//チェックしたやつの取り出し
		List<String> units = form.getCheckUnitsyu();
		//セットタイプの取得用
		List<String> sets = new ArrayList<>();
		List<String> setsResult = new ArrayList<>();

		//（落ちないほう）
		if(units.contains("アーム")){
			List<UnitArm> list;
					list = serviceArm.findArms(
							form.getUtName(), form.getUtSetType(),
							form.getDAtk(), form.getSAtk(),form.getHAtk(), form.getAbility(),
							form.getDDif(), form.getSDif(), form.getHDif(), form.getFRst(),
							form.getIRst(), form.getTRst(), form.getWRst(), form.getIRst(), form.getDRst(),
							form.getHp(),form.getPp());
					model.addAttribute("arms", list);
					//ﾃｽﾄ6/15
					model.addAttribute("armsSerch", "検索結果：アーム");

					//数が増えるとすごく重くなりそうだけど全体のセットタイプが少ないのでとりあえず。（セットタイプ取得）
					sets.addAll(serviceArm.selectSetType());
					setsResult = SerchUnit.setTypeExtractArm(list, sets, setsResult);
		}

		if(units.contains("リア")){
			List<UnitRear> list;
					list = serviceRear.findRears(
							form.getUtName(), form.getUtSetType(),
							form.getDAtk(), form.getSAtk(),form.getHAtk(), form.getAbility(),
							form.getDDif(), form.getSDif(), form.getHDif(), form.getFRst(),
							form.getIRst(), form.getTRst(), form.getWRst(), form.getIRst(), form.getDRst(),
							form.getHp(),form.getPp());
					model.addAttribute("rears", list);

					model.addAttribute("rearsSerch", "検索結果：リア");

					//セットタイプ取得
					sets.addAll(serviceRear.selectSetType());
					setsResult = SerchUnit.setTypeExtractRear(list, sets, setsResult);
				}

		if(units.contains("レッグ")){
			List<UnitLeg> list;
					list = serviceLeg.findLegs(
							form.getUtName(), form.getUtSetType(),
							form.getDAtk(), form.getSAtk(),form.getHAtk(), form.getAbility(),
							form.getDDif(), form.getSDif(), form.getHDif(), form.getFRst(),
							form.getIRst(), form.getTRst(), form.getWRst(), form.getIRst(), form.getDRst(),
							form.getHp(),form.getPp());
					model.addAttribute("legs", list);
					model.addAttribute("legsSerch", "検索結果：レッグ");

					//セットタイプ取得
					sets.addAll(serviceLeg.selectSetType());
					setsResult = SerchUnit.setTypeExtractLeg(list, sets, setsResult);
				}

		if(units.contains("サブ")){
			List<UnitSub> list;
					list = serviceSub.findSubs(
							form.getUtName(), form.getUtSetType(),
							form.getDAtk(), form.getSAtk(),form.getHAtk(), form.getAbility(),
							form.getDDif(), form.getSDif(), form.getHDif(), form.getFRst(),
							form.getIRst(), form.getTRst(), form.getWRst(), form.getIRst(), form.getDRst(),
							form.getHp(),form.getPp());
					model.addAttribute("subs", list);
					model.addAttribute("subsSerch", "検索結果：サブ");

				}
		if(units.contains("セットタイプ")){
			List<SetType> list;
			list = serviceSetType.findSetTypes(
					form.getUtName(),
					form.getDAtk(), form.getSAtk(),form.getHAtk(), form.getAbility(),
					form.getHp(),form.getPp());
			model.addAttribute("utSetTypes", list);

		}

		//≪セットタイプ部分≫
		if(!(setsResult.isEmpty())){
		List<SetType> list;
//		n部位の重複要素取り除き
		setsResult = setsResult.stream().distinct().collect(Collectors.toList());
		//関連セットタイプステータス検索
		list = serviceSetType.SerchSetType(setsResult);
		model.addAttribute("setTypeSt", list);
		//※セットタイプは他がまとまったら実装
		//名称の格納(合計値用)
//		list.forEach(l-> sTNames.add(l.getUtName()));
		}

		//チェックボックス、セットタイプ条件の値を入れなおす前に検索結果に反映させたい
		model.addAttribute("checked", form.getCheckUnitsyu());
		// チェックボックスの値の格納、表示(部位)
		SerchUnit.checkboxUnitbui(form);
		//※実装中：セットタイプ条件の格納（2種3種・・・・）
		SerchUnit.checkSetTypes(form);
		// 入力値の格納
		model.addAttribute("nform", form);
		// form(空のものを入れてあげないとエラーになる)
		model.addAttribute("dbform", new Form());
		model.addAttribute("bui", form.getCheckUnitsyu());
		model.addAttribute("setTypes", form.getCheckSetTypes());
		// セットタイプの選択候補用
		List<String> settype = serviceSetType.selectSetType();
		model.addAttribute("settype", settype);
		//ユニット選択をしてたら表示する
		if(form.getUtSubId()!=null){
			model.addAttribute("subUnit",sRepository.findOne(form.getUtSubId()));
			model.addAttribute("selSub","選択値：サブ");
		}
		if(form.getUtArmId()!=null){
			model.addAttribute("armUnit",aRepository.findOne(form.getUtArmId()));
			model.addAttribute("selArm","選択値：アーム");
		}
		if(form.getUtRearId()!=null){
			model.addAttribute("rearUnit",rRepository.findOne(form.getUtRearId()));
			model.addAttribute("selRear","選択値：リア");
		}
		if(form.getUtLegId()!=null){
			model.addAttribute("legUnit",lRepository.findOne(form.getUtLegId()));
			model.addAttribute("selLeg","選択値：レッグ");
		}


		System.out.println("postmapping_serch");

		return "serchAndCalc";
	}





}
