package sample.hello.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import sample.hello.entity.UnitRear;

public class UnitRearSpecifications {


/**
 * ユニット名
 * @param utName
 * @return
 */
    public static Specification<UnitRear> nameContains(String utName) {
        return StringUtils.isEmpty(utName) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like(root.get("utName"), "%" + utName + "%");
            }
        };
    }
    /**
     * セットタイプ(完全一致)
     * @param setType
     * @return
     */
    public static Specification<UnitRear> eqSetType(String utSetType) {
        return StringUtils.isEmpty(utSetType) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.equal(root.get("utSetType"), utSetType );
            }
        };
    }
    /**
     * 打撃力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overDAtk(Integer dAtk) {
        return StringUtils.isEmpty(dAtk) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("dAtk"), dAtk );
            }
        };
    }
    /**
     * 射撃力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overSAtk(Integer sAtk) {
        return StringUtils.isEmpty(sAtk) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("sAtk"), sAtk );
            }
        };
    }
    /**
     * 法撃力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overHAtk(Integer hAtk) {
        return StringUtils.isEmpty(hAtk) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("hAtk"), hAtk );
            }
        };
    }
    /**
     * 技量(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overAbility(Integer ability) {
        return StringUtils.isEmpty(ability) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("ability"), ability );
            }
        };
    }
    /**
     * 打撃防御力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overDDif(Integer dDif) {
        return StringUtils.isEmpty(dDif) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("dDif"), dDif );
            }
        };
    }
    /**
     * 射撃防御力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overSDif(Integer sDif) {
        return StringUtils.isEmpty(sDif) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("sDif"), sDif );
            }
        };
    }
    /**
     * 法撃防御力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overhDif(Integer hDif) {
        return StringUtils.isEmpty(hDif) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("hDif"), hDif );
            }
        };
    }
    /**
     * 炎耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overFRst(Integer fRst) {
        return StringUtils.isEmpty(fRst) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("fRst"), fRst );
            }
        };
    }
    /**
     * 氷耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overIRst(Integer iRst) {
        return StringUtils.isEmpty(iRst) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("iRst"), iRst );
            }
        };
    }
    /**
     * 雷耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overTRst(Integer tRst) {
        return StringUtils.isEmpty(tRst) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("tRst"), tRst );
            }
        };
    }
    /**
     * 風耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overWRst(Integer wRst) {
        return StringUtils.isEmpty(wRst) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("wRst"), wRst );
            }
        };
    }
    /**
     * 光耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overLRst(Integer lRst) {
        return StringUtils.isEmpty(lRst) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("lRst"), lRst );
            }
        };
    }
    /**
     * 闇耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overDRst(Integer dRst) {
        return StringUtils.isEmpty(dRst) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("dRst"), dRst );
            }
        };
    }
    /**
     * hp(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overHP(Integer hp) {
        return StringUtils.isEmpty(hp) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("hp"), hp );
            }
        };
    }

    /**
     * hp(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitRear> overPP(Integer pp) {
        return StringUtils.isEmpty(pp) ? null : new Specification<UnitRear>() {
            @Override
            public Predicate toPredicate(Root<UnitRear> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("pp"), pp );
            }
        };
    }
}
