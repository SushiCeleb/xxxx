package sample.hello.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.hello.entity.UnitArm;
import sample.hello.entity.UnitLeg;
import sample.hello.entity.UnitRear;
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

@RestController
@EnableAutoConfiguration
@RequestMapping
public class SerchRestController {
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

	@PostMapping(path = "/serchStatus", produces = "application/json; charset=UTF-8")
	public Object[] unitSerch(@RequestBody SerchItems response) {
		//格納値：アーム、リア、レッグ、サブ、セットタイプ
		Object[] result = new Object[5];
		List<String> bui = Arrays.asList(response.getcheckBui());
		//セットタイプ取得用
		List<String> sets = new ArrayList<>();
		List<String> setsResult = new ArrayList<>();

		if(bui.contains("アーム")){
			List<UnitArm> list;
			list = serviceArm.findArms(
					response.getUtName(), response.getSetType(),
					response.getdAtk(), response.getsAtk(),response.gethAtk(), response.getAbility(),
					response.getdDif(), response.getsDif(), response.gethDif(), response.getfRst(),
					response.getiRst(), response.gettRst(), response.getwRst(), response.getiRst(), response.getdRst(),
					response.getHp(),response.getPp());
			result[0] = list;
					//セットタイプ抜き出し
					sets.addAll(serviceArm.selectSetType());
					setsResult = SerchUnit.setTypeExtractArm(list, sets, setsResult);
		}
		if(bui.contains("リア")){
			List<UnitRear> list;
			list = serviceRear.findRears(
					response.getUtName(), response.getSetType(),
					response.getdAtk(), response.getsAtk(),response.gethAtk(), response.getAbility(),
					response.getdDif(), response.getsDif(), response.gethDif(), response.getfRst(),
					response.getiRst(), response.gettRst(), response.getwRst(), response.getiRst(), response.getdRst(),
					response.getHp(),response.getPp());
			result[1] = list;
			//セットタイプ抜き出し
			sets.addAll(serviceRear.selectSetType());
			setsResult = SerchUnit.setTypeExtractRear(list, sets, setsResult);
		}
		if(bui.contains("レッグ")){
			List<UnitLeg> list;
			list = serviceLeg.findLegs(
					response.getUtName(), response.getSetType(),
					response.getdAtk(), response.getsAtk(),response.gethAtk(), response.getAbility(),
					response.getdDif(), response.getsDif(), response.gethDif(), response.getfRst(),
					response.getiRst(), response.gettRst(), response.getwRst(), response.getiRst(), response.getdRst(),
					response.getHp(),response.getPp());
			result[2] = list;
			//セットタイプ抜き出し
			sets.addAll(serviceLeg.selectSetType());
			setsResult = SerchUnit.setTypeExtractLeg(list, sets, setsResult);
		}
		if(bui.contains("サブ")){
			result[3] = serviceSub.findSubs(
					response.getUtName(), response.getSetType(),
					response.getdAtk(), response.getsAtk(),response.gethAtk(), response.getAbility(),
					response.getdDif(), response.getsDif(), response.gethDif(), response.getfRst(),
					response.getiRst(), response.gettRst(), response.getwRst(), response.getiRst(), response.getdRst(),
					response.getHp(),response.getPp());
		}

		//≪セットタイプ部分≫
		if(!(setsResult.isEmpty())){
//		n部位の重複要素取り除き
		setsResult = setsResult.stream().distinct().collect(Collectors.toList());
		//関連セットタイプステータス検索
		result[4] = serviceSetType.SerchSetType(setsResult);
		}

		return result;
	}

}
