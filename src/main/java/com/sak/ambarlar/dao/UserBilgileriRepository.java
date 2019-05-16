package com.sak.ambarlar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sak.ambarlar.model.UserBilgileri;


public interface UserBilgileriRepository extends JpaRepository<UserBilgileri, Long>{
	@Query("FROM UserBilgileri WHERE user=:user_id") 
	UserBilgileri  userBilgCekByUserId(@Param("user_id") Long user_id);

	@Query("SELECT u.user FROM UserBilgileri u WHERE u.id=:id")
	Long userBilgilerindenUserIdCek(@Param("id") Long id);
	
}
