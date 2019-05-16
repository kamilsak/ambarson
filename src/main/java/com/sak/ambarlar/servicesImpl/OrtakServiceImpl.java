package com.sak.ambarlar.servicesImpl;


import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sak.ambarlar.exceptions.HandlerException;
import com.sak.ambarlar.model.Islem;
import com.sak.ambarlar.model.Mal;
import com.sak.ambarlar.model.UserBilgileri;
import com.sak.ambarlar.services.OrtakServices;
import com.sak.ambarlar.services.Services;
import com.sak.ambarlar.util.ErrorUtils;

@Service
public class OrtakServiceImpl implements OrtakServices {
	
	@Autowired
	private Services services;

	@Override
	public String silJson(Long id, String neyiSil) {
		JSONObject jsonObject = new JSONObject();
		try {
			if(neyiSil.equals("adres")) {
				services.adresSil(id);
				jsonObject.put("message", "Adres Başarıyla Silindi.");
			}else if(neyiSil.equals("personel")) {
				services.userSil(id);
				jsonObject.put("message", "Personel Başarıyla Silindi.");
			}else if(neyiSil.equals("islem")) {
				Islem islem = services.islemCek(id);
				if(islem.getGonderici() != null) {
					List<Islem> islemGon = services.islemCekByGonderen(islem.getGonderici());
					List<Islem> islemAl = services.islemCekByAlan(islem.getGonderici());
					UserBilgileri userGon = services.userBilgileriCek(islem.getGonderici());
					if(islemGon.size() + islemAl.size() <= 1 && userGon.getUser() == null) {
						services.userBilgileriSil(islem.getGonderici());
						try {
							services.adresSil(islem.getAdresGon());
						} catch (Exception e) {
							System.out.println(e.getStackTrace()+"=======================");
							jsonObject.put("message", e);
							
							
						}
						
					}
				}
				if(islem.getAlici() != null) {
					UserBilgileri userAl = services.userBilgileriCek(islem.getAlici());
					List<Islem> islemGon1 = services.islemCekByGonderen(islem.getAlici());
					List<Islem> islemAl1 = services.islemCekByAlan(islem.getAlici());
					if(islemGon1.size() + islemAl1.size() <= 1 && userAl.getUser() == null) {
						services.userBilgileriSil(islem.getAlici());
						if(islem.getAdresAl() != null) {services.adresSil(islem.getAdresAl());}
					}
				}
				List<Mal> mallar = services.malCekByIslemId(id);
				services.malSilByIslemId(mallar);
				services.islemSil(id);
				jsonObject.put("message", "İşlem Başarıyla Silindi.");
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}
	public boolean islemdenGondericiSil(Long islemId) {
		Islem islem = services.islemCek(islemId);
		if(islem.getGonderici() != null) {
			List<Islem> islemGon = services.islemCekByGonderen(islem.getGonderici());
			List<Islem> islemAl = services.islemCekByAlan(islem.getGonderici());
			UserBilgileri userGon = services.userBilgileriCek(islem.getGonderici());
			if(islemGon.size() + islemAl.size() <= 1 && userGon.getUser() == null) {
				services.userBilgileriSil(islem.getGonderici());
				if(islem.getAdresGon() != null) {services.adresSil(islem.getAdresGon());}
			}
			return true;
		}else {
			return false;
		}
		
	}
}
