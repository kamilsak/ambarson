package com.sak.ambarlar.web;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sak.ambarlar.model.Adres;
import com.sak.ambarlar.model.Ambar;
import com.sak.ambarlar.model.Islem;
import com.sak.ambarlar.model.IslemDurum;
import com.sak.ambarlar.model.IslemTipi;
import com.sak.ambarlar.model.Mal;
import com.sak.ambarlar.model.UserBilgileri;
import com.sak.ambarlar.services.Services;

@Controller
@RequestMapping("islem")
public class IslemController {
	
	@Autowired
	private  Services services;
	
	@GetMapping("/index")
	public String islemControl(Model theModel,Principal principal) {
		Islem islem= new Islem();
		Islem islem2 = services.islemListByOlusturan(principal.getName(), IslemDurum.OLUSMADI);
		if(islem2 != null) {
			islem = islem2;
			if(islem.getIslemTipi().equals(IslemTipi.ALIM)) {
				if(islem.getAlici() != null) {
					UserBilgileri userBilgileriAl= services.userBilgileriCek(islem.getAlici());
					theModel.addAttribute("userBilgileriAl", userBilgileriAl);
					Adres adreslerAl = services.adresCek(islem.getAdresAl());
					if(adreslerAl != null) {
						theModel.addAttribute("adreslerAl", adreslerAl);
					}else {
						theModel.addAttribute("abc", "form/adres");
						theModel.addAttribute("neyi", "islemAl");
						theModel.addAttribute("islem", islem);
						return "form/islemIndex";
					}
				}else {
					theModel.addAttribute("abc", "form/userBveAdresSec");
					theModel.addAttribute("neyi", "islemAlici");
					theModel.addAttribute("islem", islem);
					return "form/islemIndex";
				}
			}
			if(islem.getGonderici() != null) {
				UserBilgileri userBilgileriGon= services.userBilgileriCek(islem.getGonderici());
				theModel.addAttribute("userBilgileriGon", userBilgileriGon);
				Adres adreslerGon = services.adresCek(islem.getAdresGon());
				if(adreslerGon != null) {
					theModel.addAttribute("adreslerGon", adreslerGon);
					if(islem.getIslemTipi().equals(IslemTipi.GONDERI)) {
						if(islem.getAlici() != null) {
							UserBilgileri userBilgileriAl= services.userBilgileriCek(islem.getAlici());
							theModel.addAttribute("userBilgileriAl", userBilgileriAl);
							Adres adreslerAl = services.adresCek(islem.getAdresAl());
							if(adreslerAl != null) {
								theModel.addAttribute("adreslerAl", adreslerAl);
							}else {
								theModel.addAttribute("abc", "form/adres");
								theModel.addAttribute("neyi", "islemAl");
								theModel.addAttribute("islem", islem);
								return "form/islemIndex";
							}
						}else {
							theModel.addAttribute("abc", "form/userBveAdresSec");
							theModel.addAttribute("neyi", "islemAlici");
							theModel.addAttribute("islem", islem);
							return "form/islemIndex";
						}
					}
				}else {
					theModel.addAttribute("abc", "form/adres");
					theModel.addAttribute("neyi", "islemGon");
					theModel.addAttribute("islem", islem);
					return "form/islemIndex";
				}
			}else {
				theModel.addAttribute("abc", "form/userBveAdresSec");
				theModel.addAttribute("neyi", "islemGonderici");
				theModel.addAttribute("islem", islem);
				return "form/islemIndex";
			}
			List<Mal> mallar = services.malCekByIslemId(islem.getId());
			if(mallar.size() > 0) {
				theModel.addAttribute("mallar", mallar);
				if(islem.getAmbar() != null) {
					Ambar ambar = services.ambarCek(islem.getAmbar());
					theModel.addAttribute("abc", "");
					theModel.addAttribute("ambar", ambar);
					theModel.addAttribute("islem", islem);
					return "form/islemIndex";
				}else {
					theModel.addAttribute("abc", "form/ambarSec");
					theModel.addAttribute("neyi", "islemAmbar");
					theModel.addAttribute("islem", islem);
					return "form/islemIndex";
				}
			}else {
				theModel.addAttribute("abc", "form/mal");
				theModel.addAttribute("neyi", "islemMal");
				theModel.addAttribute("islem", islem);
				return "form/islemIndex";
			}
		}
		theModel.addAttribute("islem", islem);
		return "form/islemIndex";
	}
	
	@GetMapping("/index2")
	public String islemControl2(Model theModel,Principal principal) {
		Islem islem= new Islem();
		Islem islem2 = services.islemListByOlusturan(principal.getName(), IslemDurum.OLUSMADI);
		if(islem2 != null) {
			islem = islem2;
			if(islem.getGonderici() != null) {
				UserBilgileri userBilgileriGon= services.userBilgileriCek(islem.getGonderici());
				theModel.addAttribute("userBilgileriGon", userBilgileriGon);
				List<Adres> adreslerGon = services.adresCekByUserBilgileri(islem.getGonderici());
				if(adreslerGon.size() > 0) {
					theModel.addAttribute("adreslerGon", adreslerGon);
					if(islem.getAlici() != null) {
						UserBilgileri userBilgileriAl= services.userBilgileriCek(islem.getAlici());
						theModel.addAttribute("userBilgileriAl", userBilgileriAl);
						List<Adres> adreslerAl = services.adresCekByUserBilgileri(islem.getAlici());
						if(adreslerAl.size() > 0) {
							theModel.addAttribute("adreslerAl", adreslerAl);
							List<Mal> mallar = services.malCekByIslemId(islem.getId());
							if(mallar.size() > 0) {
								theModel.addAttribute("mallar", mallar);
								if(islem.getAmbar() != null) {
									Ambar ambar = services.ambarCek(islem.getAmbar());
									theModel.addAttribute("abc", "");
									theModel.addAttribute("ambar", ambar);
									theModel.addAttribute("islem", islem);
									return "form/islemIndex";
								}else {
									theModel.addAttribute("abc", "form/ambarSec");
									theModel.addAttribute("neyi", "islemAmbar");
									theModel.addAttribute("islem", islem);
									return "form/islemIndex";
								}
							}else {
								theModel.addAttribute("abc", "form/mal");
								theModel.addAttribute("neyi", "islemMal");
								theModel.addAttribute("islem", islem);
								return "form/islemIndex";
							}
						}else {
							theModel.addAttribute("abc", "form/adres");
							theModel.addAttribute("neyi", "islemAl");
							theModel.addAttribute("islem", islem);
							return "form/islemIndex";
						}
					}else {
						theModel.addAttribute("abc", "form/userBilgileri");
						theModel.addAttribute("neyi", "islemAlici");
						theModel.addAttribute("islem", islem);
						return "form/islemIndex";
					}
				}else {
					theModel.addAttribute("abc", "form/adres");
					theModel.addAttribute("neyi", "islemGon");
					theModel.addAttribute("islem", islem);
					return "form/islemIndex";
				}
			}else {
				theModel.addAttribute("abc", "form/userBilgileri");
				theModel.addAttribute("neyi", "islemGonderici");
				theModel.addAttribute("islem", islem);
				return "form/islemIndex";
			}
		}
		theModel.addAttribute("islem", islem);
		return "form/islemIndex";
	}


}

