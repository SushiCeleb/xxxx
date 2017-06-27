package sample.hello.form;

import java.util.List;

//@Data
public class Form {

	/**
	 * ユニットの種類<br>
	 * アーム	リア	レッグ	サブ
	 */
	private String ut;
	/**
	 * ユニットの種類のリスト（検索画面表示用）
	 */
	private List<String> checkUnitsyu;

	/**
	 * セットタイプの種別（insert用）
	 * ※リスト実装後に廃止予定<br>
	 * 2部位	3部位	（1(2)部位+武器	4部位）
	 */
	private String setTypes;
	/**
	 * セットタイプの種別(検索表示用)<br>
	 * 武器が絡むのは今はやめときたい（面倒）
	 */
	private List<String> checkSetTypes;

	/**
	 * ユニット名
	 */
	private String utName;

	/**
	 * セットタイプ<br>
	 * ユニットにセット効果がある場合、紐付けるために使う
	 */
	private String utSetType;

	/**
	 * 打撃力
	 */
	private Integer dAtk;
	/**
	 * 射撃力
	 */
	private Integer sAtk;
	/**
	 * 法撃力
	 */
	private Integer hAtk;
	/**
	 * 技量
	 */
	private Integer ability;
	/**
	 * 打撃防御
	 */
	private Integer dDif;
	/**
	 * 射撃防御
	 */
	private Integer sDif;
	/**
	 * 法撃防御
	 */
	private Integer hDif;
	/**
	 * 炎耐性
	 */
	private Integer fRst;
	/**
	 * 氷耐性
	 */
	private Integer iRst;
	/**
	 * 雷耐性
	 */
	private Integer tRst;
	/**
	 * 風耐性
	 */
	private Integer wRst;
	/**
	 * 光耐性
	 */
	private Integer lRst;
	/**
	 * 闇耐性
	 */
	private Integer dRst;
	/**
	 * HP
	 */
	private Integer hp;
	/**
	 * PP
	 */
	private Integer pp;

	/**
	 * id(サブ)<br>
	 * リスト実装後消す
	 */
	private Integer utSubId;
	/**
	 * ※6/15-実装中
	 * id(サブ)<br>
	 * 複数チェック対応版、こっちを使いたい
	 */
	private List<Integer> utSubIds;

	/**
	 * id(アーム)
	 */
	private Integer utArmId;
	/**
	 * id(リア)
	 */
	private Integer utRearId;
	/**
	 * id(レッグ)
	 */
	private Integer utLegId;



	/**
	 * @return ut
	 */
	public String getUt() {
		return ut;
	}
	/**
	 * @param ut セットする ut
	 */
	public void setUt(String ut) {
		this.ut = ut;
	}
	/**
	 * @return setTypes
	 */
	public String getSetTypes() {
		return setTypes;
	}
	/**
	 * @param setTypes セットする setTypes
	 */
	public void setSetTypes(String setTypes) {
		this.setTypes = setTypes;
	}
	/**
	 * @return utName
	 */
	public String getUtName() {
		return utName;
	}
	/**
	 * @param utName セットする utName
	 */
	public void setUtName(String utName) {
		this.utName = utName;
	}
	/**
	 * @return utSetType
	 */
	public String getUtSetType() {
		return utSetType;
	}
	/**
	 * @param utSetType セットする utSetType
	 */
	public void setUtSetType(String utSetType) {
		this.utSetType = utSetType;
	}
	/**
	 * @return dAtk
	 */
	public Integer getDAtk() {
		if(dAtk == null){
			dAtk =0;
		}
		return dAtk;
	}
	/**
	 * @param dAtk セットする dAtk
	 */
	public void setDAtk(Integer dAtk) {
		this.dAtk = dAtk;
	}
	/**
	 * @return sAtk
	 */
	public Integer getSAtk() {
		if(sAtk == null){
			sAtk =0;
		}
		return sAtk;
	}
	/**
	 * @param sAtk セットする sAtk
	 */
	public void setSAtk(Integer sAtk) {
		this.sAtk = sAtk;
	}
	/**
	 * @return hAtk
	 */
	public Integer getHAtk() {
		if(hAtk == null){
			hAtk =0;
		}
		return hAtk;
	}
	/**
	 * @param hAtk セットする hAtk
	 */
	public void setHAtk(Integer hAtk) {
		this.hAtk = hAtk;
	}
	/**
	 * @return ability
	 */
	public Integer getAbility() {
		if(ability == null){
			ability =0;
		}
		return ability;
	}
	/**
	 * @param ability セットする ability
	 */
	public void setAbility(Integer ability) {
		this.ability = ability;
	}
	/**
	 * @return dDif
	 */
	public Integer getDDif() {
		if(dDif == null){
			dDif =0;
		}
		return dDif;
	}
	/**
	 * @param dDif セットする dDif
	 */
	public void setDDif(Integer dDif) {
		this.dDif = dDif;
	}
	/**
	 * @return sDif
	 */
	public Integer getSDif() {
		if(sDif == null){
			sDif =0;
		}
		return sDif;
	}
	/**
	 * @param sDif セットする sDif
	 */
	public void setSDif(Integer sDif) {
		this.sDif = sDif;
	}
	/**
	 * @return hDif
	 */
	public Integer getHDif() {
		if(hDif == null){
			hDif =0;
		}
		return hDif;
	}
	/**
	 * @param hDif セットする hDif
	 */
	public void setHDif(Integer hDif) {
		this.hDif = hDif;
	}
	/**
	 * @return fRst
	 */
	public Integer getFRst() {
		if(fRst == null){
			fRst =0;
		}
		return fRst;
	}
	/**
	 * @param fRst セットする fRst
	 */
	public void setFRst(Integer fRst) {
		this.fRst = fRst;
	}
	/**
	 * @return iRst
	 */
	public Integer getIRst() {
		if(iRst == null){
			iRst =0;
		}
		return iRst;
	}
	/**
	 * @param iRst セットする iRst
	 */
	public void setIRst(Integer iRst) {
		this.iRst = iRst;
	}
	/**
	 * @return tRst
	 */
	public Integer getTRst() {
		if(tRst == null){
			tRst =0;
		}
		return tRst;
	}
	/**
	 * @param tRst セットする tRst
	 */
	public void setTRst(Integer tRst) {
		this.tRst = tRst;
	}
	/**
	 * @return wRst
	 */
	public Integer getWRst() {
		if(wRst == null){
			wRst =0;
		}
		return wRst;
	}
	/**
	 * @param wRst セットする wRst
	 */
	public void setWRst(Integer wRst) {
		this.wRst = wRst;
	}
	/**
	 * @return lRst
	 */
	public Integer getLRst() {
		if(lRst == null){
			lRst =0;
		}
		return lRst;
	}
	/**
	 * @param lRst セットする lRst
	 */
	public void setLRst(Integer lRst) {
		this.lRst = lRst;
	}
	/**
	 * @return dRst
	 */
	public Integer getDRst() {
		if(dRst == null){
			dRst =0;
		}
		return dRst;
	}
	/**
	 * @param dRst セットする dRst
	 */
	public void setDRst(Integer dRst) {
		this.dRst = dRst;
	}
	/**
	 * @return hp
	 */
	public Integer getHp() {
		if(hp == null){
			hp =0;
		}
		return hp;
	}
	/**
	 * @param hp セットする hp
	 */
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	/**
	 * @return pp
	 */
	public Integer getPp() {
		if(pp == null){
			pp =0;
		}
		return pp;
	}
	/**
	 * @param pp セットする pp
	 */
	public void setPp(Integer pp) {
		this.pp = pp;
	}
	/**
	 * @return checkUnit
	 */
	public List<String> getCheckUnitsyu() {
		return checkUnitsyu;
	}
	/**
	 * @param checkUnit セットする checkUnit
	 */
	public void setCheckUnitsyu(List<String> checkUnitsyu) {
		this.checkUnitsyu = checkUnitsyu;
	}
	/**
	 * @return checkSetTypes
	 */
	public List<String> getCheckSetTypes() {
		return checkSetTypes;
	}
	/**
	 * @param checkSetTypes セットする checkSetTypes
	 */
	public void setCheckSetTypes(List<String> checkSetTypes) {
		this.checkSetTypes = checkSetTypes;
	}
	/**
	 * @return utSubId
	 */
	public Integer getUtSubId() {
		return utSubId;
	}
	/**
	 * @param utSubId セットする utSubId
	 */
	public void setUtSubId(Integer utSubId) {
		this.utSubId = utSubId;
	}
	/**
	 * @return utArmId
	 */
	public Integer getUtArmId() {
		return utArmId;
	}
	/**
	 * @param utArmId セットする utArmId
	 */
	public void setUtArmId(Integer utArmId) {
		this.utArmId = utArmId;
	}
	/**
	 * @return utRearId
	 */
	public Integer getUtRearId() {
		return utRearId;
	}
	/**
	 * @param utRearId セットする utRearId
	 */
	public void setUtRearId(Integer utRearId) {
		this.utRearId = utRearId;
	}
	/**
	 * @return utLegId
	 */
	public Integer getUtLegId() {
		return utLegId;
	}
	/**
	 * @param utLegId セットする utLegId
	 */
	public void setUtLegId(Integer utLegId) {
		this.utLegId = utLegId;
	}
	/**
	 * @return utSubIds
	 */
	public List<Integer> getUtSubIds() {
		return utSubIds;
	}
	/**
	 * @param utSubIds セットする utSubIds
	 */
	public void setUtSubIds(List<Integer> utSubIds) {
		this.utSubIds = utSubIds;
	}






}