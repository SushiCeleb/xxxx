package sample.hello.repository;

//仮
//最終的に作りたいものは、既存のユニットを選択→合計値を取得
//できれば、数値を入力→既存のユニットの中から条件をクリアする組み合わせを提示

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sample.hello.entity.UnitRear;
@Repository			//Spring MVCでデータ層のクラス（DAO等のDBアクセスを行うクラス）に付与する。
public interface UnitRearRepository extends JpaRepository<UnitRear, Integer> , JpaSpecificationExecutor<UnitRear>{
	/**
	 * セットタイプ表示用
	 * @return セットタイプ(重複なし)
	 */
	@Query("select distinct ur.utSetType from UnitRear ur where not ur.utSetType is null ")
	List<String> selectSetType();
}