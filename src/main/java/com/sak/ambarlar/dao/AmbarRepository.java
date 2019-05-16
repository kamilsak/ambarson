package com.sak.ambarlar.dao;


import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import com.sak.ambarlar.model.*;

public interface AmbarRepository extends JpaRepository<Ambar, Long>{
	
	
	  @Query("FROM Ambar WHERE patron=:patron_id") 
	  Ambar  patronAmbari(@Param("patron_id") User patron_id);
	  
	  @Query("SELECT a.ad,a.patron FROM Ambar a inner join User u  WHERE a.id=?1") 
	  Ambar  deenen(@Param("id") Long id);
	  
	  @Query("FROM Ambar  WHERE id=?1") 
	  Ambar  patrondene(@Param("patron_id") Long patron_id);
	 
}
