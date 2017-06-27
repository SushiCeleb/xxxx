package sample.hello.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.hello.entity.UnitArm;
import sample.hello.entity.UnitLeg;
import sample.hello.entity.UnitRear;
import sample.hello.form.Form;
import sample.hello.repository.UnitArmRepository;
import sample.hello.service.UnitArmService;
import sample.hello.service.UnitLegService;
import sample.hello.service.UnitRearService;
import sample.hello.service.UnitSubService;

@Service
public class SerchUnit {
	@Autowired
	static
	UnitArmService serviceArm;
	//仮
	@Autowired
	UnitArmRepository repository;
	@Autowired
	static
	UnitRearService serviceRear;
	@Autowired
	static
	UnitLegService serviceLeg;
	@Autowired
	static
	UnitSubService serviceSub;

	/**
	 * (検索画面)チェックボックスのセットをする（アーム、リア・・・・）
	 * @param form
	 */
	public static void checkboxUnitbui(Form form) {
		List<String> units =new ArrayList<>();
		units.add("アーム");
		units.add("リア");
		units.add("レッグ");
		units.add("サブ");
		//units.add("セットタイプ");
		form.setCheckUnitsyu(units);
	}
	/**
	 * (検索画面)セットタイプ条件のセットをする（2部位3部位・・・・）
	 * @param form
	 */
	public static void checkSetTypes(Form form) {
		List<String> units =new ArrayList<>();
		units.add("2部位");
		units.add("3部位");
		//保留
//		units.add("1部位+武器");
//		units.add("2部位+武器");
//		units.add("3部位+武器");
		form.setCheckSetTypes(units);
	}
	/**
	 * 検索結果のセットタイプのみ表示させる(アーム)
	 */
	public static List<String> setTypeExtractArm(List<UnitArm> list , List<String> sets, List<String> setsResult){
		for (int i = 0; i < list.size(); i++) {
			String li = list.get(i).getUtSetType();//↑検索結果のiこめの行のセットタイプ
			if (sets.contains(li)){
				setsResult.add(li);
			}
		}
		return setsResult;
	}
	/**
	 * 検索結果のセットタイプのみ表示させる(リア)
	 */
	public static List<String> setTypeExtractRear(List<UnitRear> list , List<String> sets, List<String> setsResult){
		for (int i = 0; i < list.size(); i++) {
			String li = list.get(i).getUtSetType();//↑検索結果のiこめの行のセットタイプ
			if (sets.contains(li)){
				setsResult.add(li);
			}
		}
		return setsResult;
	}
	/**
	 * 検索結果のセットタイプのみ表示させる(レッグ)
	 */
	public static List<String> setTypeExtractLeg(List<UnitLeg> list , List<String> sets, List<String> setsResult){
		for (int i = 0; i < list.size(); i++) {
			String li = list.get(i).getUtSetType();//↑検索結果のiこめの行のセットタイプ
			if (sets.contains(li)){
				setsResult.add(li);
			}
		}
		return setsResult;
	}
}
