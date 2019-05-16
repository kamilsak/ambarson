package com.sak.ambarlar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.sak.ambarlar.model.Ambar;
import com.sak.ambarlar.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long>{
	
	@Query("FROM User WHERE userName=:username")
	User findByUsername(@Param("username") String username);
	
	@Query("FROM User WHERE personelinAmbari=:personelin_ambari")
	List<User> personelList(@Param("personelin_ambari") Ambar ambar);
	
	@Query("FROM User WHERE id=:id")
	User findByID(@Param("id") Long id);
	
	@Query("FROM User")
	List<User> userList();

}
