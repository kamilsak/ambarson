package com.sak.ambarlar.dao;
import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import com.sak.ambarlar.model.Sozlesme;

public interface SozlesmeRepository extends JpaRepository<Sozlesme, Long>{

	@Query("FROM Sozlesme s WHERE s.ambar=:ambar_id")
	List<Sozlesme> sozlesmeListByAmbar(@Param("ambar_id") Long ambar_id);
}
