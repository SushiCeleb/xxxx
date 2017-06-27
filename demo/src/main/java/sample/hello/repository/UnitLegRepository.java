package sample.hello.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sample.hello.entity.UnitLeg;
@Repository			//Spring MVCでデータ層のクラス（DAO等のDBアクセスを行うクラス）に付与する。
public interface UnitLegRepository extends JpaRepository<UnitLeg, Integer>, JpaSpecificationExecutor<UnitLeg>{
	/**
	 * セットタイプ表示用
	 * @return セットタイプ(重複なし)
	 */
	@Query("select distinct ul.utSetType from UnitLeg ul where not ul.utSetType is null ")
	List<String> selectSetType();

}