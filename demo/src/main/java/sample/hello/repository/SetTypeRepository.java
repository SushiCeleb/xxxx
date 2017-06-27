package sample.hello.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sample.hello.entity.SetType;
@Repository			//Spring MVCでデータ層のクラス（DAO等のDBアクセスを行うクラス）に付与する。
public interface SetTypeRepository extends JpaRepository<SetType, Integer> , JpaSpecificationExecutor<SetType>{
	/**
	 * (insert)セットタイプ表示用
	 * @return セットタイプ
	 */
	@Query("select st.utSetType from SetType st")
	List<String> selectSetType();

	/**
	 * serch<br>
	 * 検索結果に表示されたセットタイプの検索
	 * @param utSetType
	 * @return
	 */
	@Query("select st from SetType st where st.utSetType = :setsResult")
	List<SetType> SerchSetType(@Param("setsResult") String setsResult);

}