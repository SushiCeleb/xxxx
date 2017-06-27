package sample.hello.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import sample.hello.entity.SetType;

public class SetTypeSpecifications {

    /**
     * セットタイプ
     * 不要
     * @param setType
     * @return
     */
    public static Specification<SetType> eqSetType(String utSetType) {
        return StringUtils.isEmpty(utSetType) ? null : new Specification<SetType>() {
            @Override
            public Predicate toPredicate(Root<SetType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.equal(root.get("utSetType"), utSetType );
            }
        };
    }
    /**
     * セットタイプ名
     * @param utName
     * @return
     */
        public static Specification<SetType> nameContains(String utName) {
            return StringUtils.isEmpty(utName) ? null : new Specification<SetType>() {
                @Override
                public Predicate toPredicate(Root<SetType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                    return cb.like(root.get("utName"), "%" + utName + "%");
                }
            };
        }
    /**
     * 打撃力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<SetType> overDAtk(Integer dAtk) {
        return StringUtils.isEmpty(dAtk) ? null : new Specification<SetType>() {
            @Override
            public Predicate toPredicate(Root<SetType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("dAtk"), dAtk );
            }
        };
    }
    /**
     * 射撃力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<SetType> overSAtk(Integer sAtk) {
        return StringUtils.isEmpty(sAtk) ? null : new Specification<SetType>() {
            @Override
            public Predicate toPredicate(Root<SetType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("sAtk"), sAtk );
            }
        };
    }
    /**
     * 法撃力(以上)
     * @param dAtk
     * @return
     */
    public static Specification<SetType> overHAtk(Integer hAtk) {
        return StringUtils.isEmpty(hAtk) ? null : new Specification<SetType>() {
            @Override
            public Predicate toPredicate(Root<SetType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("hAtk"), hAtk );
            }
        };
    }
    /**
     * 技量(以上)
     * @param dAtk
     * @return
     */
    public static Specification<SetType> overAbility(Integer ability) {
        return StringUtils.isEmpty(ability) ? null : new Specification<SetType>() {
            @Override
            public Predicate toPredicate(Root<SetType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("ability"), ability );
            }
        };
    }
    /**
     * hp(以上)
     * @param dAtk
     * @return
     */
    public static Specification<SetType> overHP(Integer hp) {
        return StringUtils.isEmpty(hp) ? null : new Specification<SetType>() {
            @Override
            public Predicate toPredicate(Root<SetType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("hp"), hp );
            }
        };
    }

    /**
     * pp(以上)
     * @param dAtk
     * @return
     */
    public static Specification<SetType> overPP(Integer pp) {
        return StringUtils.isEmpty(pp) ? null : new Specification<SetType>() {
            @Override
            public Predicate toPredicate(Root<SetType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.greaterThanOrEqualTo(root.get("pp"), pp );
            }
        };
    }
}
