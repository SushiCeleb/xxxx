package sample.hello.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import sample.hello.entity.UnitSub;
@Repository			//Spring MVCでデータ層のクラス（DAO等のDBアクセスを行うクラス）に付与する。
public interface UnitSubRepository extends JpaRepository<UnitSub, Integer>, JpaSpecificationExecutor<UnitSub>{

}