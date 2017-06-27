package sample.hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.hello.entity.UnitArm;
import sample.hello.entity.UnitLeg;
import sample.hello.entity.UnitRear;
import sample.hello.entity.UnitResult;
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
import sample.hello.utility.UnitCalc;

//コントローラ宣言
@Controller
@RequestMapping
public class CalcController {
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


	@PostMapping(path = "/oldSelect",params ="Select")
	public String unitSelect(@ModelAttribute Form form, Model model) {
//		ラジオボタン(空ならチェックボックス)を押したユニットの能力を出す
//			if(form.getUtSubId()!=null){
//			//6/15 チェックをつけた数だけ表示したい(未実装)
//			form.getUtSubIds().forEach(si->{
//				int c = 1;
//				model.addAttribute("subUnit"+String.valueOf(c),sRepository.findOne(si));
//				c++;
//			}
//			);

		if(form.getUtSubId()!=null){
			model.addAttribute("subUnit",sRepository.findOne(form.getUtSubId()));
			//ヘッダの表示
			model.addAttribute("selSub","選択値：サブ");
		}
		if(form.getUtArmId()!=null){
			model.addAttribute("armUnit",aRepository.findOne(form.getUtArmId()));
			//ヘッダの表示
			model.addAttribute("selArm","選択値：アーム");
		}
		if(form.getUtRearId()!=null){
			model.addAttribute("rearUnit",rRepository.findOne(form.getUtRearId()));
			//ヘッダの表示
			model.addAttribute("selRear","選択値：リア");
		}
		if(form.getUtLegId()!=null){
			model.addAttribute("legUnit",lRepository.findOne(form.getUtLegId()));
			//ヘッダの表示
			model.addAttribute("selLeg","選択値：レッグ");
		}

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

				return "serchAndCalc";
	}

	@GetMapping(path = "/oldCalc",params ="Calczzzzzzzzzzzzzzzzz")
	public String unitCalc(@ModelAttribute Form form, Model model) {
		UnitArm ua = new UnitArm();
		UnitRear ur = new UnitRear();
		UnitLeg ul = new UnitLeg();
		UnitSub us = new UnitSub();
		UnitResult urst = new UnitResult();

		List<String> selUnit = new ArrayList<>();
		//ユニット選択をしてたら表示する
				if(form.getUtSubId()!=null){
					us = sRepository.findOne(form.getUtSubId());
					model.addAttribute("subUnit", us);
					selUnit.add("sub");
					//ヘッダの表示
					model.addAttribute("selSub","選択値：サブ");
				}
				if(form.getUtArmId()!=null){
					ua = aRepository.findOne(form.getUtArmId());
					model.addAttribute("armUnit",ua);
					selUnit.add("arm");
					//ヘッダの表示
					model.addAttribute("selArm","選択値：アーム");
				}
				if(form.getUtRearId()!=null){
					ur = rRepository.findOne(form.getUtRearId());
					model.addAttribute("rearUnit", ur);
					selUnit.add("rear");
					//ヘッダの表示
					model.addAttribute("selRear","選択値：リア");
				}
				if(form.getUtLegId()!=null){
					ul =lRepository.findOne(form.getUtLegId());
					model.addAttribute("legUnit",ul);
					selUnit.add("leg");
					//ヘッダの表示
					model.addAttribute("selLeg","選択値：レッグ");
				}
				UnitCalc.calcUnit(ua, ur, ul, us, urst, selUnit);

				model.addAttribute("calcUnit",urst);

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
		return "serchAndCalc";
	}
}
