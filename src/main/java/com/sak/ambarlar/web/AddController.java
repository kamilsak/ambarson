package com.sak.ambarlar.web;

import java.security.Principal;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.sak.ambarlar.model.*;
import com.sak.ambarlar.services.*;
import com.sak.ambarlar.util.ErrorUtils;

@Controller
@RequestMapping("/add")
public class AddController {
	
	@Autowired
	private AddServices addServices;
	@Autowired
	private Services services;
	
	@PostMapping(value="/userBilgileri",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String userBilgileriAdd(@Valid @RequestBody UserBilgileri userBilgileri,
			BindingResult result,@RequestParam(value="neyi") String neyi,Principal principal) {
		if(result.hasErrors()) {
			return ErrorUtils.customErrors(result.getAllErrors());
		} else {
			return addServices.userBilgileriYeniKayitJson(userBilgileri,neyi,principal);
		}
	}
	@PostMapping(value="/ambar",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String userAdd(@Valid @RequestBody Ambar ambar,
			BindingResult result, Principal principal,Model theModel) {
		if(result.hasErrors()) {
			return ErrorUtils.customErrors(result.getAllErrors());
		} else {
			return addServices.ambarKayitJson(ambar,principal);
		}
	}
	@PostMapping(value="/personel",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String personelAdd(@Valid @ModelAttribute("personel") User user,
			BindingResult result, Principal principal,Model theModel) {
		if(result.hasErrors()) {
			return ErrorUtils.customErrors(result.getAllErrors());
		} else 
			return addServices.personelKaydetJson(user, principal);
	}
	@PostMapping(value="/user",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String userAdd(@Valid @RequestBody User user,
			BindingResult result, Principal principal,Model theModel) {
		if(result.hasErrors()) {
			return ErrorUtils.customErrors(result.getAllErrors());
		} else {
			return addServices.userYeniKayitJson(user,principal);
		}
	}
	@PostMapping(value="/sozlesme",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String sozlesmeAdd(@Valid @RequestBody Sozlesme sozlesme,
			BindingResult result) {
		if(result.hasErrors()) {
			return ErrorUtils.customErrors(result.getAllErrors());
		} else 
			return addServices.sozlesmeKaydetJson(sozlesme);
	}
	@PostMapping(value="/mal",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String malAdd(@Valid @RequestBody Mal mal,
			BindingResult result, Principal principal,Model theModel,@RequestParam(value="neyi") String neyi) {
		if(result.hasErrors()) {
			return ErrorUtils.customErrors(result.getAllErrors());
		} else {
			return addServices.malKayitJson(mal,principal,neyi);
		}
	}
	@GetMapping(value="/islemGonAlAdd",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String islemGonAlAdd(@RequestParam(value="page") Long page ,@RequestParam(value="neyi") String neyi,Principal principal) {
		Islem islem = services.islemListByOlusturan(principal.getName(), IslemDurum.OLUSMADI);
		Adres adres = services.adresCek(page);
		if(neyi.equals("islemGonderici")) {
			islem.setGonderici(adres.getUserBilgileri());
			islem.setAdresGon(adres.getId());
		}else {
			islem.setAlici(adres.getUserBilgileri());
			islem.setAdresAl(adres.getId());
		}
		return addServices.islemOlusturJson(islem, principal, neyi);
	}
	@PostMapping(value="/tip" ,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String islemAdd(@Valid @RequestBody Islem islem,BindingResult result,Principal principal,@RequestParam(value="neyi") String neyi) {
		islem.setDurum(IslemDurum.OLUSMADI);
		islem.setOlusturmaTarihi(new Date());
		islem.setIslemiOlusturan(principal.getName());
		if(result.hasErrors()) {
			return ErrorUtils.customErrors(result.getAllErrors());
		} else {
			return addServices.islemOlusturJson(islem,principal,neyi);
		}
	}

}
