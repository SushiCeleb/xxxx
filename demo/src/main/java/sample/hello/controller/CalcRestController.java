package sample.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.hello.repository.UnitArmRepository;
import sample.hello.repository.UnitLegRepository;
import sample.hello.repository.UnitRearRepository;
import sample.hello.repository.UnitSubRepository;

@RestController
@EnableAutoConfiguration
@RequestMapping
public class CalcRestController {
	@Autowired
	UnitArmRepository aRepository;
	@Autowired
	UnitRearRepository rRepository;
	@Autowired
	UnitLegRepository lRepository;
	@Autowired
	UnitSubRepository sRepository;

	@PostMapping(path = "/takeStatus", produces = "application/json; charset=UTF-8")
	public Object[] takeStatus(@RequestBody UnitsId response){
		Object[] result = new Object[4];
		int id;
		if(response.getArm() != null){
			id = response.getArm();
			result[0] = aRepository.findOne(id);
		}
		if(response.getRear() != null){
			id = response.getRear();
			result[1] = rRepository.findOne(id);
		}
		if(response.getLeg() != null){
			id = response.getLeg();
			result[2] = lRepository.findOne(id);
		}
		if(response.getSub() != null){
			id = response.getSub();
			result[3] = sRepository.findOne(id);
		}
		System.out.println(response);
		return result;
	}


}
