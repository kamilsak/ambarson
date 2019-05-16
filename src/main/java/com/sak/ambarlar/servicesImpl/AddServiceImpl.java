package com.sak.ambarlar.servicesImpl;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sak.ambarlar.model.*;
import com.sak.ambarlar.services.*;
import com.sak.ambarlar.util.MethodUtils;
@Service
public class AddServiceImpl implements AddServices {
	
	@Autowired
	private Services services;
	
	@Override
	public Long ambariBul() throws NullPointerException{
			if(MethodUtils.bavul().getPersonelinAmbari() != null) {
				return MethodUtils.bavul().getPersonelinAmbari();
			}else if(MethodUtils.bavul().getPatronunAmbariId() != null) {
				return MethodUtils.bavul().getPatronunAmbariId();
			}else
				return null;
	} 
	@Override
	public String userBilgileriYeniKayitJson(@Valid UserBilgileri userBilgileri,String neyi,
			Principal principal) {
		String message = null;
		JSONObject jsonObject = new JSONObject();
		try {
			if(userBilgileri.getId() == null) {
				message = "Kayıt";
			}else {
				message = "Güncelleme";
			}
			if(neyi.equals("islemGonderici") || neyi.equals("islemAlici")) {
				Islem islem = services.islemListByOlusturan(principal.getName(), IslemDurum.OLUSMADI);
				if(userBilgileri.getId() == null) {
					UserBilgileri userB = services.userBilgileriOlustur(userBilgileri);
					if(neyi.equals("islemAlici")) {
						islem.setAlici(userB.getId());
						return islemOlusturJson(islem, principal,neyi);
					}else {
						islem.setGonderici(userB.getId());
						return islemOlusturJson(islem, principal,neyi);
					}
				}else {
					jsonObject.put("urlgit", "islem/index");
				}
			}
			if(neyi.equals("user")) {
				userBilgileri.setUser(MethodUtils.bavul().getUserId());
				jsonObject.put("urlgit", "hesap/hesabim?page=1");
			}
			UserBilgileri ub = services.userBilgileriGunceller(userBilgileri);
			if(neyi.equals("user")) {
			MethodUtils.bavul().setUserBilgileriId(ub.getId());
			}
			jsonObject.put("status", "basarili");
			jsonObject.put("title", message + " Başarılı");
			jsonObject.put("message", ub.getAd()+ " " + ub.getSoyad()+ "<br> " + message + " gerçekleşti.");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}
	@Override
	public String ambarKayitJson(@Valid Ambar ambar, Principal principal) {
		User user = services.sistemdekiUser(principal.getName());
		String message = null;
		JSONObject jsonObject = new JSONObject();
		try {
			if (ambar.getId() == null) {
				message = "Kayıt ";
				user.setRol(services.roleCek(2L));
				services.userGunceller(user);
				ambar.setPatron(user);
				ambar.setOlusturmaTarihi(new Date());
				ambar.setStatus(StatuCode.SORUNSUZ);
			} else {
				message = "Güncelleme";
			}
			
			Ambar ambar2 = services.ambarGunceller(ambar);
			jsonObject.put("status", "basarili");
			jsonObject.put("title", message + " alındı");
			jsonObject.put("message", ambar2.getAd() + " " + message + " başarılı.");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}
	@Transactional
	@Override
	public String userYeniKayitJson(@Valid User user, Principal principal) {
		String pas = user.getPassword();
		String message = null;
		JSONObject jsonObject = new JSONObject();
		try {
			if (principal == null) {
				message = "Kayıt";
				user.setRol(services.roleCek(1L));
				user.setStatus(StatuCode.SORUNSUZ);
			} else {
				message = "Güncelleme";
				user = services.sistemdekiUser(principal.getName());
				if(pas != null) {
					user.setPassword(pas);
				}
			}
			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
			User user2 = services.userOlustur(user);
			jsonObject.put("status", "basarili");
			jsonObject.put("title", message + " Başarılı");
			jsonObject.put("message", user2.getUserName()+ " " + user2.getEmail()+ "<br> " + message + " gerçekleşti.");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}
	@Override
	public String personelKaydetJson(User user, Principal principal) {
		user.setRol(services.roleCek(3L));
		user.setStatus(StatuCode.SORUNSUZ);
		Long ambar = ambariBul();
		user.setPersonelinAmbari(services.ambarCek(ambar));
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		String message = null;
		JSONObject jsonObject = new JSONObject();
		try {
			if (user.getId() == null) {
				message = "Kayıt";
				services.userOlustur(user);
			} else {
				message = "Güncelleme";
			}
			jsonObject.put("urlgit", "hesap/ambarim?page=1");
			jsonObject.put("status", "basarili");
			jsonObject.put("title", message + " Başarılı");
			jsonObject.put("message", user.getUserName()+ " " + user.getEmail()+ "<br> " + message + " gerçekleşti.");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}
	
	@PersistenceContext
	private EntityManager em;

	public List<Adres> gonListBySoyad(String soyad) {
		return em.createQuery("from Gonderen where soyad = :soyad_gon", Adres.class).setParameter("soyad_gon", soyad)
				.getResultList();

	}
	@Override
	public String sozlesmeKaydetJson(@Valid Sozlesme sozlesme) {
		String message = null;
		JSONObject jsonObject = new JSONObject();
		try {
			if (sozlesme.getId() == null) {
				message = "Kayıt ";
			} else {
				message = "Güncelleme";
			}
			jsonObject.put("urlgit", "hesap/tarifeler");
			jsonObject.put("status", "basarili");
			jsonObject.put("title", message + " alındı");
			sozlesme.setTip(SozlesmeTipi.GENEL);
			sozlesme.setAmbar(MethodUtils.bavul().getPatronunAmbariId());
			Sozlesme sozlesme2 = services.sozlesmeOlustur(sozlesme);
			jsonObject.put("message",
					"<b>" + "Birim fiyat: " + sozlesme2.getBirimFiyat() + "TL" + "</b>" + "  " + "<b>"
							 + sozlesme2.getNeredenIl() + "  " +sozlesme2.getNereyeIl()+"</b>" + " " +sozlesme2.getNereyeIlce()+"</b>" + " " + message + " başarılı.");

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}
	@Override
	public String islemOlusturJson(Islem islem,Principal principal,String neyi) {
		String message = null;
		JSONObject jsonObject = new JSONObject();
		try {
			if (islem.getDurum().equals(IslemDurum.OLUSMADI)) {
				message = "devam ";
				jsonObject.put("urlgit", "islem/index");
			} else {
				message = "sonuclandı";
				jsonObject.put("urlgit", "hesap/hesabim?page=1");
			}
			jsonObject.put("status", "basarili");
			jsonObject.put("title", message + " alındı");
			jsonObject.put("message",
					"<b>" + "işlem : " + services.islemGunceller(islem)+"</b>" + " " +"</b>" + " " + message + " başarılı.");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}
	@Override
	public String malKayitJson(@Valid Mal mal, Principal principal, String neyi) {
		Islem islem = services.islemListByOlusturan(principal.getName(), IslemDurum.OLUSMADI);
		mal.setIslem(islem.getId());
		String message = null;
		JSONObject jsonObject = new JSONObject();
		try {
			if (mal.getId() == null) {
				message = "Kayıt ";
				
			} else {
				message = "Güncelleme";
			}
			jsonObject.put("urlgit", "islem/index");
			jsonObject.put("status", "basarili");
			jsonObject.put("title", message + " alındı");
			jsonObject.put("message",
					"<b>" + "işlem : " + services.malGunceller(mal)+"</b>" + " " +"</b>" + " " + message + " başarılı.");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}

	
}
