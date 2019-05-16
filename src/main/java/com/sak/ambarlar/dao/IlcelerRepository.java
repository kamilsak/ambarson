package com.sak.ambarlar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sak.ambarlar.model.Ilceler;

public interface IlcelerRepository extends JpaRepository<Ilceler, Long>{
	
	@Query("FROM Ilceler WHERE ilId=:il_id")
	List<Ilceler> findIlcelerByIlId(@Param("il_id") Long ilId);

}
