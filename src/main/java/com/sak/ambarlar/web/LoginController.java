package com.sak.ambarlar.web;

import java.security.Principal;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sak.ambarlar.model.Ambar;
import com.sak.ambarlar.services.Services;
import com.sak.ambarlar.util.MethodUtils;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	final String TAG = getClass().getSimpleName()+" ";
	
	@Autowired
	private Services services;
	
	@RequestMapping("/login")
	public String login(Model model, String error, String logout, String kayit,HttpServletRequest request) {
		System.out.println(TAG+request.getSession().getAttribute("username"));
		model.addAttribute("giris", "Kullanıcı bilgilerinizi giriniz.");
		if (error != null) {
			model.addAttribute("error", "Kullanıcı bilgileriniz doğrulanmadı.");
		}
		if (logout != null) {
			model.addAttribute("message", "Sistemden çıkış yaptınız.");
		}
		if(kayit != null ) {
			model.addAttribute("ahmet", "Kayıtınız başarıyla gerçekleşti.");
			model.addAttribute("mesaj", "Güvenlik amaçlı Lütfen Sisteme Tekrar giriş yapınız.");
		}
		return "login";
	}
	@GetMapping("/")
	public String anaSayfa(Model model, Principal principal, HttpServletRequest request) {
		List<String> roles = services.userRolList();
		if (roles.contains("ROLE_MUSTERI")) {
			return "musteri/anasayfa";
		} else if (roles.contains("ROLE_PATRON")) {
			Ambar ambar = services.ambarCek(MethodUtils.bavul().getPatronunAmbariId());
			model.addAttribute("ambar", ambar);
			return "patron/anasayfa";
		} else if (roles.contains("ROLE_PERSONEL")) {
			return "personel/anasayfa";
		}
		return "anasayfa";
	}
	
	

}
