package sample.hello.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import sample.hello.entity.UnitArm;

public class UnitArmSpecifications {

/**
 * ユニット名
 * @param utName
 * @return
 */
    public static Specification<UnitArm> nameContains(String utName) {
        return StringUtils.isEmpty(utName) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like(root.get("utName"), "%" + utName + "%");
            }
        };
    }
    /**
     * セットタイプ(完全一致)
     * @param setType
     * @return
     */
    public static Specification<UnitArm> eqSetType(String utSetType) {
        return StringUtils.isEmpty(utSetType) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.equal(root.get("utSetType"), utSetType );
            }
        };
    }
    /**
     * 打撃力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overDAtk(Integer dAtk) {
        return StringUtils.isEmpty(dAtk) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("dAtk"), dAtk );
            }
        };
    }
    /**
     * 射撃力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overSAtk(Integer sAtk) {
        return StringUtils.isEmpty(sAtk) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("sAtk"), sAtk );
            }
        };
    }
    /**
     * 法撃力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overHAtk(Integer hAtk) {
        return StringUtils.isEmpty(hAtk) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("hAtk"), hAtk );
            }
        };
    }
    /**
     * 技量(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overAbility(Integer ability) {
        return StringUtils.isEmpty(ability) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("ability"), ability );
            }
        };
    }
    /**
     * 打撃防御力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overDDif(Integer dDif) {
        return StringUtils.isEmpty(dDif) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("dDif"), dDif );
            }
        };
    }
    /**
     * 射撃防御力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overSDif(Integer sDif) {
        return StringUtils.isEmpty(sDif) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("sDif"), sDif );
            }
        };
    }
    /**
     * 法撃防御力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overhDif(Integer hDif) {
        return StringUtils.isEmpty(hDif) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("hDif"), hDif );
            }
        };
    }
    /**
     * 炎耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overFRst(Integer fRst) {
        return StringUtils.isEmpty(fRst) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("fRst"), fRst );
            }
        };
    }
    /**
     * 氷耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overIRst(Integer iRst) {
        return StringUtils.isEmpty(iRst) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("iRst"), iRst );
            }
        };
    }
    /**
     * 雷耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overTRst(Integer tRst) {
        return StringUtils.isEmpty(tRst) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("tRst"), tRst );
            }
        };
    }
    /**
     * 風耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overWRst(Integer wRst) {
        return StringUtils.isEmpty(wRst) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("wRst"), wRst );
            }
        };
    }
    /**
     * 光耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overLRst(Integer lRst) {
        return StringUtils.isEmpty(lRst) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("lRst"), lRst );
            }
        };
    }
    /**
     * 闇耐性(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overDRst(Integer dRst) {
        return StringUtils.isEmpty(dRst) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("dRst"), dRst );
            }
        };
    }
    /**
     * hp(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overHP(Integer hp) {
        return StringUtils.isEmpty(hp) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("hp"), hp );
            }
        };
    }

    /**
     * hp(以上)
     * @param dAtk
     * @return
     */
    public static Specification<UnitArm> overPP(Integer pp) {
        return StringUtils.isEmpty(pp) ? null : new Specification<UnitArm>() {
            @Override
            public Predicate toPredicate(Root<UnitArm> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("pp"), pp );
            }
        };
    }
}
