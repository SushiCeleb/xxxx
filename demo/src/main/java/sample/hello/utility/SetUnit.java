package sample.hello.utility;

import org.springframework.stereotype.Component;

import sample.hello.entity.SetType;
import sample.hello.entity.UnitArm;
import sample.hello.entity.UnitLeg;
import sample.hello.entity.UnitRear;
import sample.hello.entity.UnitSub;
import sample.hello.form.Form;

@Component
public class SetUnit {


	/**
	 * フォームの値をSETTYPEに入れる
	 *
	 * @param form
	 * @param type
	 */
	public static void setSetType(Form form, SetType type) {
		// //仮
		// if(type.getUtSTId() == null){
		// type.setUtSTId(1);
		// }
		type.setUtName(form.getUtSetType());
		type.setUtSetType(form.getUtSetType());
		type.setSetTypes(form.getSetTypes());
		type.setDAtk(form.getDAtk());
		type.setSAtk(form.getSAtk());
		type.setHAtk(form.getHAtk());
		type.setAbility(form.getAbility());
		type.setHp(form.getHp());
		type.setPp(form.getPp());
	}

	/**
	 * フォームの値をUNITARMに入れる
	 *
	 * @param form
	 * @param uLeg
	 */

	public static void setArm(Form form, UnitArm uArm) {
		uArm.setUtName(form.getUtName());
		uArm.setUtSetType(form.getUtSetType());
		uArm.setDAtk(form.getDAtk());
		uArm.setSAtk(form.getSAtk());
		uArm.setHAtk(form.getHAtk());
		uArm.setAbility(form.getAbility());
		uArm.setDDif(form.getDDif());
		uArm.setSDif(form.getSDif());
		uArm.setHDif(form.getHDif());
		uArm.setFRst(form.getFRst());
		uArm.setIRst(form.getIRst());
		uArm.setTRst(form.getTRst());
		uArm.setWRst(form.getWRst());
		uArm.setLRst(form.getLRst());
		uArm.setDRst(form.getDRst());
		uArm.setHp(form.getHp());
		uArm.setPp(form.getPp());
	}

	/**
	 * フォームの値をUNITLEGに入れる
	 *
	 * @param form
	 * @param uLeg
	 */
	public static void setLeg(Form form, UnitLeg uLeg) {
		uLeg.setUtName(form.getUtName());
		uLeg.setUtSetType(form.getUtSetType());
		uLeg.setDAtk(form.getDAtk());
		uLeg.setSAtk(form.getSAtk());
		uLeg.setHAtk(form.getHAtk());
		uLeg.setAbility(form.getAbility());
		uLeg.setDDif(form.getDDif());
		uLeg.setSDif(form.getSDif());
		uLeg.setHDif(form.getHDif());
		uLeg.setFRst(form.getFRst());
		uLeg.setIRst(form.getIRst());
		uLeg.setTRst(form.getTRst());
		uLeg.setWRst(form.getWRst());
		uLeg.setLRst(form.getLRst());
		uLeg.setDRst(form.getDRst());
		uLeg.setHp(form.getHp());
		uLeg.setPp(form.getPp());

	}

	/**
	 * フォームの値をUNITREARに入れる
	 *
	 * @param form
	 * @param uSub
	 */
	public static void setRear(Form form, UnitRear uRear) {
		uRear.setUtName(form.getUtName());
		uRear.setUtSetType(form.getUtSetType());
		uRear.setDAtk(form.getDAtk());
		uRear.setSAtk(form.getSAtk());
		uRear.setHAtk(form.getHAtk());
		uRear.setAbility(form.getAbility());
		uRear.setDDif(form.getDDif());
		uRear.setSDif(form.getSDif());
		uRear.setHDif(form.getHDif());
		uRear.setFRst(form.getFRst());
		uRear.setIRst(form.getIRst());
		uRear.setTRst(form.getTRst());
		uRear.setWRst(form.getWRst());
		uRear.setLRst(form.getLRst());
		uRear.setDRst(form.getDRst());
		uRear.setHp(form.getHp());
		uRear.setPp(form.getPp());
	}

	/**
	 * フォームの値をUNITSUBに入れる
	 *
	 * @param form
	 * @param uSub
	 */
	public static void setSub(Form form, UnitSub uSub) {
		uSub.setUtName(form.getUtName());
		uSub.setUtSetType(form.getUtSetType());
		uSub.setDAtk(form.getDAtk());
		uSub.setSAtk(form.getSAtk());
		uSub.setHAtk(form.getHAtk());
		uSub.setAbility(form.getAbility());
		uSub.setDDif(form.getDDif());
		uSub.setSDif(form.getSDif());
		uSub.setHDif(form.getHDif());
		uSub.setFRst(form.getFRst());
		uSub.setIRst(form.getIRst());
		uSub.setTRst(form.getTRst());
		uSub.setWRst(form.getWRst());
		uSub.setLRst(form.getLRst());
		uSub.setDRst(form.getDRst());
		uSub.setHp(form.getHp());
		uSub.setPp(form.getPp());

	}

}
