package com.sak.ambarlar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.sak.ambarlar.model.Islem;
import com.sak.ambarlar.model.IslemDurum;

public interface IslemRepository extends PagingAndSortingRepository<Islem, Long>{
	
	@Query("FROM Islem WHERE islemiOlusturan=:olusturan AND durum=:durum")
	Islem findByOlusturan(@Param("olusturan") String olusturan,@Param("durum") IslemDurum durum);
	
	@Query("FROM Islem WHERE id=:id")
	Islem findByID(@Param("id") Long id);
	
	@Query("FROM Islem WHERE gonderici=:gonderici_id")
	List<Islem> islemCekByGonderen(@Param("gonderici_id") Long gonderici_id);
	
	@Query("FROM Islem WHERE alici=:alici_id")
	List<Islem> islemCekByAlici(@Param("alici_id") Long alici_id);
	
	

}
