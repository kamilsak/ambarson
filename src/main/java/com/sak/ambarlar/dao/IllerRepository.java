package com.sak.ambarlar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sak.ambarlar.model.Iller;
public interface IllerRepository extends JpaRepository<Iller, Long>{

	@Query("FROM Iller WHERE ad=:ad")
	Iller ilCekByAd(@Param("ad") String ad);

}
