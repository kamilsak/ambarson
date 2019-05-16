package com.sak.ambarlar.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sak.ambarlar.model.*;
import com.sak.ambarlar.services.*;

@Controller
@RequestMapping("ortak")
public class OrtakController {
	
	@Autowired
	private Services services;
	@Autowired
	private OrtakServices ortakServices;

	@GetMapping(value = "/delete/{id}/", produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String userDelete(@RequestParam(value="neyisil") String neyisil,@PathVariable Long id) {
			return ortakServices.silJson(id,neyisil);
	}
	@RequestMapping(value = "/ilceler", method = RequestMethod.GET)
	public @ResponseBody  List<Ilceler> getAllSubcategories(@RequestParam(value="ad") String ad) {
		Iller il = services.ilCekByAd(ad);
	    List<Ilceler> ilceler = new ArrayList<>();
	    Ilceler ilce = new Ilceler();
	    ilce.setAd("Tüm ilçeler");
	    ilce.setId(0L);
	    ilceler.add(ilce);
	    ilceler.addAll(1, services.ilcelerListByIlId(il.getPlaka()));
	     return ilceler;
	}


}
