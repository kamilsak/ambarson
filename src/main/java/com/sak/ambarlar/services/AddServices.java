package com.sak.ambarlar.services;

import java.security.Principal;

import javax.validation.Valid;

import com.sak.ambarlar.model.Ambar;
import com.sak.ambarlar.model.Islem;
import com.sak.ambarlar.model.Mal;
import com.sak.ambarlar.model.Sozlesme;
import com.sak.ambarlar.model.User;
import com.sak.ambarlar.model.UserBilgileri;

public interface AddServices {
	
	//String sozlesmeGuncellerJson(@Valid Sozlesme sozlesme, Principal principal);
	String personelKaydetJson(User user ,Principal principal);
	Long ambariBul();
	String userBilgileriYeniKayitJson(@Valid UserBilgileri userBilgileri,String neyi,Principal principal);
	String ambarKayitJson(@Valid Ambar ambar, Principal principal);
	String userYeniKayitJson(User user,Principal principal);
	String sozlesmeKaydetJson(@Valid Sozlesme sozlesme);
	String islemOlusturJson(Islem islem,Principal principal,String neyi);
	String malKayitJson(@Valid Mal mal, Principal principal, String neyi);
	

}
