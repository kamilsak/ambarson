package com.sak.ambarlar.web;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.sak.ambarlar.model.Adres;
import com.sak.ambarlar.services.AdresServices;
import com.sak.ambarlar.services.AddServices;
import com.sak.ambarlar.services.Services;
import com.sak.ambarlar.util.ErrorUtils;
import com.sak.ambarlar.util.MethodUtils;

@Controller
@RequestMapping("adres")
public class AdresController {
	
	@Autowired
	private Services services;
	@Autowired
	private AddServices addServices;
	@Autowired
	private AdresServices adresServices;

	@PostMapping(value="/add",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String adresAdd(@Valid @ModelAttribute("adres")  Adres adres,
			BindingResult result,@RequestParam(value="neyi") String neyi, Principal principal,Model theModel) {
		if(result.hasErrors()) {
			return ErrorUtils.customErrors(result.getAllErrors());
		} else 
			return adresServices.adresOlusturJson(adres,principal,neyi);
	}
	@RequestMapping(value="/listPage")
	public String ambarinAdresList( Model model, Pageable pageable,@RequestParam(value="neyi") String neyi) {
		Page<Adres> pages = null ;
		if (neyi.equals("hesabim")) {
			 pages = services.adresListByUserBilgileri
					(MethodUtils.bavul().getUserBilgileriId(), pageable);
			 model.addAttribute("userAmbar", "hesabim");
		}else if (neyi.equals("ambarim")) {
			Long id = addServices.ambariBul();
			 pages = services.adresListByAmbar(id, pageable);
			 model.addAttribute("ambar","" );
			 model.addAttribute("userAmbar", "ambarim");
		}
		model.addAttribute("adresler", pages.getContent());
		MethodUtils.pageModel(model, pages);
		return "form/adresList";
	}

}
