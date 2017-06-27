package sample.hello.form;

import java.util.List;

import sample.hello.entity.UnitArm;
import sample.hello.entity.UnitLeg;
import sample.hello.entity.UnitRear;
import sample.hello.entity.UnitSub;

public class CalcForm {

	/**
	 * 選択したアームを保持する(Serch画面、セレクト用)
	 */
	private List<UnitArm> sUtArm;
	/**
	 * 選択したリアを保持する(Serch画面、セレクト用)
	 */
	private List<UnitRear> sUtRear;
	/**
	 * 選択したレッグを保持する(Serch画面、セレクト用)
	 */
	private List<UnitLeg> sUtLeg;
	/**
	 * 選択したサブを保持する(Serch画面、セレクト用)
	 */
	private List<UnitSub> sUtSub;
	/**
	 * @return sUtArm
	 */
	public List<UnitArm> getsUtArm() {
		return sUtArm;
	}

	/**
	 * @param sUtArm セットする sUtArm
	 */
	public void setsUtArm(List<UnitArm> sUtArm) {
		this.sUtArm = sUtArm;
	}

	/**
	 * @return sUtRear
	 */
	public List<UnitRear> getsUtRear() {
		return sUtRear;
	}

	/**
	 * @param sUtRear セットする sUtRear
	 */
	public void setsUtRear(List<UnitRear> sUtRear) {
		this.sUtRear = sUtRear;
	}

	/**
	 * @return sUtLeg
	 */
	public List<UnitLeg> getsUtLeg() {
		return sUtLeg;
	}

	/**
	 * @param sUtLeg セットする sUtLeg
	 */
	public void setsUtLeg(List<UnitLeg> sUtLeg) {
		this.sUtLeg = sUtLeg;
	}

	/**
	 * @return sUtSub
	 */
	public List<UnitSub> getsUtSub() {
		return sUtSub;
	}

	/**
	 * @param sUtSub セットする sUtSub
	 */
	public void setsUtSub(List<UnitSub> sUtSub) {
		this.sUtSub = sUtSub;
	}





}
