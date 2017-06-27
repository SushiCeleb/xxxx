package sample.hello.service;

import static sample.hello.specification.SetTypeSpecifications.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.hello.entity.SetType;
import sample.hello.repository.SetTypeRepository;


@Service // サービスに設定
@Transactional // トランザクション設定。
public class SetTypeService {
	@Autowired // リポジトリを紐づけます
	SetTypeRepository repository;

	/**
	 * セットタイプを表示する
	 *
	 * @return SetType from SetType
	 */
	public List<String> selectSetType() {
		return repository.selectSetType();
	}

	/**
	 * ユニット検索結果に関連するセットタイプのステータスを表示する
	 */
	public List<SetType> SerchSetType(List<String> setsResult) {
		List<SetType> st = new ArrayList<>();

		setsResult.forEach(ust->{
			st.addAll(repository.SerchSetType(ust));
		}
		);
		return st;
	}
	/**
	 * セットタイプの検索<br>
	 *
	 * @param setName
	 * @param dAtk
	 * @param sAtk
	 * @param hAtk
	 * @param ability
	 * @param hp
	 * @param pp
	 * @return
	 */
	public List<SetType> findSetTypes(String setName , Integer dAtk , Integer sAtk , Integer hAtk , Integer ability ,Integer hp,Integer pp) {
	    return
	    		repository.findAll(Specifications
	        .where(nameContains(setName))
	        .and(overDAtk(dAtk))
	        .and(overSAtk(sAtk))
	        .and(overHAtk(hAtk))
	        .and(overAbility(ability))
	        .and(overHP(hp))
	        .and(overPP(pp))
	    );
	}




}