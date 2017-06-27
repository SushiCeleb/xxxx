package sample.hello.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "SETTYPE")
public class SetType {

	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Integer utSTId;

	/**
	 *セットタイプ名
	 */
	@Column(name = "SETNAME")
	private String utName;

	/**
	 * セットタイプ<br>
	 * ユニットにセット効果がある場合、紐付けるために使う
	 */
	@Column(name = "UTSETTYPE")
	private String utSetType;

	/**
	 * セットタイプ条件
	 * 2部位<br>
	 * 3部位<br>
	 * 1部位+武器<br>
	 */
	@Column(name = "SETTYPES")
	private String setTypes;

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