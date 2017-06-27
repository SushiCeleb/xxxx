package sample.hello.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sample.hello.entity.UnitArm;

@Repository			//Spring MVCでデータ層のクラス（DAO等のDBアクセスを行うクラス）に付与する。
public interface UnitArmRepository extends JpaRepository<UnitArm, Integer>, JpaSpecificationExecutor<UnitArm>{
	/**
	 * セットタイプ表示用
	 * @return セットタイプ(重複なし)<br>
	 * 関連セットタイプ検索用
	 */
	@Query("select distinct ua.utSetType from UnitArm ua where not ua.utSetType is null ")
	List<String> selectSetType();

}
