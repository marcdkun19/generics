package org.sgn.generics.repository;

import java.util.List;

import org.sgn.generics.model.Census;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICensusRepository extends JpaRepository<Census, Long> {

	@Query(value = "select count(1) from census", nativeQuery = true)
	public int getCount();
	
	@Query("select c from Census c where c.area = :area and c.grp = :group")
	public List<Census> findByAreaGroup(@Param("area") String area, @Param("group") String grp);
}