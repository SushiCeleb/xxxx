package sample.hello.service;

import static sample.hello.specification.UnitSubSpecifications.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.hello.entity.UnitSub;
import sample.hello.repository.UnitSubRepository;

@Service	//サービスに設定
@Transactional//トランザクション設定。
public class UnitSubService {
	@Autowired // リポジトリを紐づけます
	UnitSubRepository repository;

	/**
	 * 全検索する<br>
	 * null,空白は除外
	 * @param utName
	 * @param setType
	 * @param dAtk
	 * @param sAtk
	 * @param hAtk
	 * @param ability
	 * @param dDif
	 * @param sDif
	 * @param hDif
	 * @param fRst
	 * @param iRst
	 * @param tRst
	 * @param wRst
	 * @param lRst
	 * @param dRst
	 * @param hp
	 * @param pp
	 * @return
	 */
	public List<UnitSub> findSubs(String utName, String utSetType , Integer dAtk , Integer sAtk , Integer hAtk , Integer ability ,
			Integer dDif , Integer sDif , Integer hDif , Integer fRst , Integer iRst, Integer tRst, Integer wRst, Integer lRst, Integer dRst,Integer hp,Integer pp) {
	    return
	    		repository.findAll(Specifications
	        .where(nameContains(utName))
	        .and(eqSetType(utSetType))
	        .and(overDAtk(dAtk))
	        .and(overSAtk(sAtk))
	        .and(overHAtk(hAtk))
	        .and(overAbility(ability))
	        .and(overDDif(dDif))
	        .and(overSDif(sDif))
	        .and(overhDif(hDif))
	        .and(overFRst(fRst))
	        .and(overIRst(iRst))
	        .and(overTRst(tRst))
	        .and(overWRst(wRst))
	        .and(overLRst(lRst))
	        .and(overDRst(dRst))
	        .and(overHP(hp))
	        .and(overPP(pp))
	    );
	}

}