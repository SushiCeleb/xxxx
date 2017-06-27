package sample.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
import sample.hello.utility.SetUnit;

//コントローラ宣言
@Controller
// @RestControllerでは View に遷移せず、メソッドの戻り値がそのままレスポンスのコンテンツになります。
@EnableAutoConfiguration // 諸々の自動設定をしてくれる
@RequestMapping
public class InsertUnitController {
	@Autowired
	UnitArmRepository repositoryArm;
	//※@Autowired	の下に二行続けて書いたら下のほうが反映されてなくてエラーになってた
	@Autowired
	SetTypeService serviceSetType;
	@Autowired
	UnitLegRepository repositoryLeg;
	@Autowired
	UnitRearRepository repositoryRear;
	@Autowired
	UnitSubRepository repositorySub;




	@GetMapping("/insert")
	public String inserthome(@ModelAttribute Form form, Model model) {

		model.addAttribute("dbform", new Form());

		List<String> settype = serviceSetType.selectSetType();
//		List<String> settype = serviceArm.selectSetType();
		model.addAttribute("settype", settype);

		return "insert";
	}

	@PostMapping("/insert")
	public String insert(@ModelAttribute Form form, Model model) {
		// form
		model.addAttribute("dbform", new Form());
		model.addAttribute("settype", serviceSetType.selectSetType());
		// 入力値の格納
		model.addAttribute("nform", form);


		// （仮）選択したユニットによって呼び出すクラスを変える
		switch (form.getUt()) {
		case "アーム":
			UnitArm uArm = new UnitArm();
			SetUnit.setArm(form, uArm);
			repositoryArm.save(uArm);
			break;
		case "リア":
			UnitRear uRear = new UnitRear();
			SetUnit.setRear(form, uRear);
			repositoryRear.save(uRear);
			break;
		case "レッグ":
			UnitLeg uLeg = new UnitLeg();
			SetUnit.setLeg(form, uLeg);
			repositoryLeg.save(uLeg);
			break;
		case "サブ":
			UnitSub uSub = new UnitSub();
			SetUnit.setSub(form, uSub);
			repositorySub.save(uSub);
			break;
//		case "セットタイプ":
//			SetType setType = new SetType();
//			SetUnit.setSetType(form, setType);
////			service.insert(setType);
		}

		return "insert";
	}


}
