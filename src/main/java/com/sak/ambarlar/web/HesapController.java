package com.sak.ambarlar.web;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sak.ambarlar.model.*;
import com.sak.ambarlar.services.AddServices;
import com.sak.ambarlar.services.Services;
import com.sak.ambarlar.util.MethodUtils;

@Controller
@RequestMapping("/hesap")
public class HesapController {
	
	@Autowired
	private Services services;
	@Autowired
	private AddServices addServices;
	
	@GetMapping("/hesabim")
	public String hesapShow(Model model,Pageable pageable) {
		User user = services.userCek(MethodUtils.bavul().getUserId());
		UserBilgileri theUserBilgileri;
		if(MethodUtils.bavul().getUserBilgileriId() != null) {
			 Page<Adres> pages = services.adresListByUserBilgileri(MethodUtils.bavul().getUserBilgileriId(), pageable);
			 theUserBilgileri = services.userBilgileriCek(MethodUtils.bavul().getUserBilgileriId());
		MethodUtils.pageModel(model, pages);
		model.addAttribute("adresler",pages.getContent());
		}else {
			theUserBilgileri = new UserBilgileri();
		}
		model.addAttribute("user",user );
		model.addAttribute("theUserBilgileri",theUserBilgileri);
		model.addAttribute("isNew",true);
		return "/hesap/hesabim";
	}
	
	@RequestMapping("/ambarim")
	public String ambarShow(Model model, Principal principal,Pageable pageable) {
		Long id = addServices.ambariBul();
		Ambar ambar = services.ambarCek(id);
		Page<Adres> pages = services.adresListByAmbar(ambar.getId(), pageable);
		List<User> personeller = services.ambarinPersList(ambar);
			model.addAttribute("ambar",ambar );
			model.addAttribute("adresler", pages.getContent());
			MethodUtils.pageModel(model, pages);
			model.addAttribute("personeller", personeller);
			return "hesap/ambarim";
	}
	@RequestMapping("/tarifeler")
	public String tarifelerShow(Model model) {
		List<Sozlesme> sozlesmeler = new ArrayList<>();
		Ambar ambar = services.ambarCek(MethodUtils.bavul().getPatronunAmbariId());
		sozlesmeler = services.sozlesmeListByAmbar(MethodUtils.bavul().getPatronunAmbariId());
		model.addAttribute("sozlesmeler",sozlesmeler );
		model.addAttribute("ambar",ambar );
			return "hesap/tarifeler";
	}

}
