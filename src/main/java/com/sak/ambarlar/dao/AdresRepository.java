package com.sak.ambarlar.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import com.sak.ambarlar.model.Adres;


public interface AdresRepository extends PagingAndSortingRepository<Adres, Long>{
	
	@Query("SELECT a FROM Adres a WHERE a.userBilgileri=:user_bilgileri") 
	List<Adres> adresCekByUserBilgileri(@Param("user_bilgileri") Long user_bilgileri);
	
	@Query("SELECT a FROM Adres a WHERE a.ambar=:ambar_id") 
	List<Adres> adresCekByAmbar(@Param("ambar_id") Long ambar_id);
	
	@Query("SELECT a FROM Adres a WHERE a.ambar=:ambar_id") 
	Page<Adres> adresListByAmbar(@Param("ambar_id") Long ambar_id, Pageable pageable );
	
	@Query("SELECT a FROM Adres a WHERE  a.userBilgileri=:user_bilgileri") 
	Page<Adres> adresListByUserBilgileri(@Param("user_bilgileri") Long user_bilgileri, Pageable pageable );
	
	@Query("FROM Adres")
	List<Adres> adresList();
	
	@Query("SELECT a FROM Adres a WHERE a.id=:id") 
	Adres getirById(@Param("id") Long id);
	
	
}
