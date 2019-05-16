package com.sak.ambarlar.web;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.sak.ambarlar.model.*;
import com.sak.ambarlar.services.*;
import com.sak.ambarlar.util.MethodUtils;
@Service
@RequestMapping("form")
public class FormController {
	@Autowired
	private Services services;
	@Autowired
	private AddServices addServices;
	
	@GetMapping(value="/adres")
	public String adresForm(@RequestParam(value="neyi") String neyi,Model theModel) {
		Adres adres = new Adres();
		List<Iller> iller = services.ilList();
		theModel.addAttribute("neyi", neyi);
		theModel.addAttribute("adres", adres);
		theModel.addAttribute("iller", iller);
		return "form/adres";
	}
	@GetMapping("/userBilgileri")
	public String userBilgileriForm(Model theModel,Pageable pageable,@RequestParam(value="neyi") String neyi,
			Principal principal) {
		UserBilgileri userBilg = new UserBilgileri();
		 Islem islem = services.islemListByOlusturan(principal.getName(), IslemDurum.OLUSMADI);
			if(MethodUtils.bavul().getUserBilgileriId() != null && neyi.equals("user")) {
				userBilg = services.userBilgileriCek(MethodUtils.bavul().getUserBilgileriId());
			}else if(neyi.equals("islemGonderici") && islem.getGonderici() != null) {
				UserBilgileri ub = services.userBilgileriCek(islem.getGonderici());
				Long userId = services.userBilgilerindenUserIdCek(ub.getId());
				if(userId == null) {userBilg = ub;}
			}else if( neyi.equals("islemAlici") && islem.getAlici() != null ){
				UserBilgileri ub = services.userBilgileriCek(islem.getAlici());
				Long userId = services.userBilgilerindenUserIdCek(ub.getId());
				if(userId == null) {userBilg = ub;}
			}	
			theModel.addAttribute("theUserBilgileri", userBilg);
			theModel.addAttribute("neyi", neyi);
			theModel.addAttribute("islem", islem);
			return "form/userBilgileri";
	}
	@GetMapping("/ambar")
	public String ambarForm(Model theModel) {
			Ambar ambar= new Ambar();
			Long amb = addServices.ambariBul();
			if(amb != null) {
				ambar = services.ambarCek(amb);
			}
			theModel.addAttribute("ambar", ambar);
			theModel.addAttribute("isNew", true);
			return "form/ambar";
	}
	@GetMapping("/user")
	public String userForm(Model theModel,Principal principal)throws Exception {
		User theUser = new User();
		if(principal != null) {
			theUser = services.sistemdekiUser(principal.getName());
		}
		theModel.addAttribute("user", theUser);
		theModel.addAttribute("isNew", true);
		return "form/user";
	}
	@GetMapping("/personel")
	public String personelForm(Model model) {
		User personel = new User();
		model.addAttribute("personel", personel);
		model.addAttribute("isNew", true);
		return "form/personel";
	}
	@GetMapping("/tarife")
	public String tarifeForm(Model model) {
		List<Iller> iller = services.ilList();
		Sozlesme sozlesme = new Sozlesme();
		model.addAttribute("sozlesme", sozlesme);
		model.addAttribute("iller", iller);
		model.addAttribute("isNew", true);
		return "form/tarife";
	}
	@GetMapping("/ambarSec")
	public String ambarSec(Model theModel,Pageable pageable,@RequestParam(value="neyi") String neyi,
			Principal principal) {
		List<Ambar> ambarlar = services.ambarList();
		 
		Islem islem = services.islemListByOlusturan(principal.getName(), IslemDurum.OLUSMADI);
		theModel.addAttribute("ambarlar", ambarlar);
		theModel.addAttribute("neyi", neyi);
		theModel.addAttribute("islem", islem);
		return "form/ambarSec";
	}
	@GetMapping("/mal")
	public String mal(Model theModel,Pageable pageable,@RequestParam(value="neyi") String neyi,
			Principal principal) {
		Mal mal = new Mal();
		theModel.addAttribute("mal", mal);
		theModel.addAttribute("neyi", neyi);
		return "form/mal";
	}
	@GetMapping("/userBveAdresSec")
	public String userBveAdresSec(@RequestParam(value="page") Long page ,@RequestParam(value="neyi") String neyi,Model theModel) {
		if(page != 1) {
			UserBilgileri userr = services.userBilgileriCek(page);
			theModel.addAttribute("userr", userr);
		}
		List<Adres> adresler = services.adresCekByUserBilgileri(page);
		Iterable<UserBilgileri> musteriList =  services.userBilgileriList();
		theModel.addAttribute("benim", MethodUtils.bavul().getUserBilgileriId());
		theModel.addAttribute("adresler", adresler);
		theModel.addAttribute("abc", "form/userBilgileri");
		theModel.addAttribute("neyi", neyi);
		theModel.addAttribute("musteriList", musteriList);
		return "form/userBveAdresSec";
	}
}
