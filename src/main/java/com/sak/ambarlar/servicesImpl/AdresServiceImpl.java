package com.sak.ambarlar.servicesImpl;

import java.security.Principal;

import javax.validation.Valid;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sak.ambarlar.model.Adres;
import com.sak.ambarlar.model.Islem;
import com.sak.ambarlar.model.IslemDurum;
import com.sak.ambarlar.services.AddServices;
import com.sak.ambarlar.services.AdresServices;
import com.sak.ambarlar.services.Services;
import com.sak.ambarlar.util.MethodUtils;
@Service
public class AdresServiceImpl implements AdresServices {
	
	@Autowired
	private Services services;
	@Autowired
	private AddServices addServices;
	
	@Override
	public String adresOlusturJson(@Valid Adres adres, Principal principal, String neyi) {
		Islem islem = new Islem();
		String message = null;
		if(adres.getId() == null) {
			message = "Kayıt";
		} else {
			message = "Güncelleme";
		}
		JSONObject jsonObject = new JSONObject();
		try {
			if(neyi.equals("user")) {
				adres.setUserBilgileri(MethodUtils.bavul().getUserBilgileriId());
				jsonObject.put("urlgit", "/hesap/hesabim?page=1");
			}else if(neyi.equals("ambar")) {
				adres.setAmbar(MethodUtils.bavul().getPatronunAmbariId());
				jsonObject.put("urlgit", "/hesap/ambarim?page=1");
			}else if(neyi.equals("islemGon")) {
				islem = services.islemListByOlusturan(principal.getName(), IslemDurum.OLUSMADI);
				adres.setUserBilgileri(islem.getGonderici());
			}else if ( neyi.equals("islemAl")) {
				islem = services.islemListByOlusturan(principal.getName(), IslemDurum.OLUSMADI);
				adres.setUserBilgileri(islem.getAlici());
			}
			Adres adres2 = services.adresOlustur(adres);
			if(neyi.equals("islemGon") || neyi.equals("islemAl")) {
				jsonObject.put("urlgit", "islem/index");
					if(neyi.equals("islemGon")) {
						islem.setAdresGon(adres2.getId());
					}else {
						islem.setAdresAl(adres2.getId());
					}
				return addServices.islemOlusturJson(islem, principal, neyi);
			}
			jsonObject.put("status", "basarili");
			jsonObject.put("title", message + " Başarılı");
			jsonObject.put("message", adres2.toString()+ " " + "<br> " + message + " gerçekleşti.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}
	

}
