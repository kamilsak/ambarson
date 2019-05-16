package com.sak.ambarlar.services;

import java.security.Principal;

import javax.validation.Valid;

import com.sak.ambarlar.model.Adres;

public interface AdresServices {
	
	String adresOlusturJson(@Valid Adres adres, Principal principal, String neyi);
	

}
