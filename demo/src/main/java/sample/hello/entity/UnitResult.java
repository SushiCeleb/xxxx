package sample.hello.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UnitResult {

	@Id
	protected Integer utResultId;

	/**
	 * 保存名<br>
	 * 今後、合計値の比較をする時に使う予定
	 */
	@Column(name = "UTNAME")
	private String utName;

	/**
	 * セットタイプ<br>
	 * ユニットにセット効果がある場合、紐付けるために使う
	 */
	@Column(name = "UTSETTYPE")
	private String utSetType;
	/**
	 *打撃力
	 */
	@Column(name = "DATK")
	private Integer dAtk;
	/**
	 * 射撃力
	 */
	@Column(name = "SATK")
	private Integer sAtk;
	/**
	 * 法撃力
	 */
	@Column(name = "HATK")
	private Integer hAtk;
	/**
	 * 技量
	 */
	@Column(name = "ABILITY")
	private Integer ability;
	/**
	 * 打撃防御
	 */
	@Column(name = "DDIF")
	private Integer dDif;
	/**
	 * 射撃防御
	 */
	@Column(name = "SDIF")
	private Integer sDif;
	/**
	 * 法撃防御
	 */
	@Column(name = "HDIF")
	private Integer hDif;
	/**
	 * 炎耐性
	 */
	@Column(name = "FRST")
	private Integer fRst;
	/**
	 * 氷耐性
	 */
	@Column(name = "IRST")
	private Integer iRst;
	/**
	 * 雷耐性
	 */
	@Column(name = "TRST")
	private Integer tRst;
	/**
	 * 風耐性
	 */
	@Column(name = "WRST")
	private Integer wRst;
	/**
	 * 光耐性
	 */
	@Column(name = "LRST")
	private Integer lRst;
	/**
	 * 闇耐性
	 */
	@Column(name = "DRST")
	private Integer dRst;
	/**
	 * HP
	 */
	@Column(name = "HP")
	private Integer hp;
	/**
	 * PP
	 */
	@Column(name = "PP")
	private Integer pp;

}