package sample.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.hello.entity.SetType;
import sample.hello.form.Form;
import sample.hello.repository.SetTypeRepository;
import sample.hello.service.SetTypeService;
import sample.hello.utility.SetUnit;

//コントローラ宣言
@Controller
// @RestControllerでは View に遷移せず、メソッドの戻り値がそのままレスポンスのコンテンツになります。
@EnableAutoConfiguration // 諸々の自動設定をしてくれる
@RequestMapping
public class InsertSetTypeController {
	@Autowired
	SetTypeService service;
	@Autowired
	SetTypeRepository repository;

	@GetMapping("/insertSetType")
	public String inserthome(@ModelAttribute Form form, Model model) {
		model.addAttribute("dbform", new Form());

		return "insertSetType";
	}

	@PostMapping("/insertSetType")
	public String insert(@ModelAttribute Form form, Model model) {
		// form
		model.addAttribute("dbform", new Form());

			SetType setType = new SetType();
			SetUnit.setSetType(form , setType);
			repository.save(setType);

		return "insertSetType";
	}
}
