package com.sak.ambarlar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sak.ambarlar.model.Mal;

public interface MalRepository extends JpaRepository<Mal, Long>{
	@Query("FROM Mal WHERE islem=:islem_id")
	List<Mal> malCekByIslemId(@Param("islem_id") Long islem_id);
}
