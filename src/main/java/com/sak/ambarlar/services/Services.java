package com.sak.ambarlar.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sak.ambarlar.model.Adres;
import com.sak.ambarlar.model.Ambar;
import com.sak.ambarlar.model.Ilceler;
import com.sak.ambarlar.model.Iller;
import com.sak.ambarlar.model.Islem;
import com.sak.ambarlar.model.IslemDurum;
import com.sak.ambarlar.model.Mal;
import com.sak.ambarlar.model.Role;
import com.sak.ambarlar.model.Sozlesme;
import com.sak.ambarlar.model.User;
import com.sak.ambarlar.model.UserBilgileri;


public interface Services {
	
	User sistemdekiUser(String userName);
	User userOlustur(User user);
	User userCek(Long id);
	void userSil(Long id);
	User userGunceller(User user);
	List<User> ambarinPersList(Ambar ambar);
	
	List<String> userRolList();
	List<Role> roleList();
	void roleOlustur(Role role);
	Role roleCek(Long id);
	
	List<Ambar> ambarList();
	void ambarOlustur(Ambar ambar);
	Ambar ambarCek(Long id);
	void ambarSil(Long id);
	Ambar ambarGunceller(Ambar siparis);
	Ambar ambarCekByUser(User user);
	
	List<Adres> adresList();
	Adres adresOlustur(Adres adres);
	Adres adresCek(Long id);
	void adresSil(Long id);
	Adres adresGunceller(Adres adres);
	List<Adres> adresCekByUserBilgileri(Long user_bilgileri_id);
	List<Adres> adresCekByAmbar(Long ambar_id);
	Page<Adres> adresListByAmbar(Long ambarId,Pageable pageable);
	Page<Adres> adresListByUserBilgileri(Long userBilId,Pageable pageable);
	
	List<Sozlesme> sozlesmeListByAmbar(Long ambarId);
	Sozlesme sozlesmeOlustur(Sozlesme sozlesme);
	Sozlesme sozlesmeCek(Long id);
	void sozlesmeSil(Long id);
	
	Islem islemListByOlusturan(String olusturan,IslemDurum durum);
	Iterable<Islem> islemList();
	Islem islemOlustur(Islem islem);
	Islem islemCek(Long id);
	void islemSil(Long id);
	Islem islemGunceller(Islem islem);
	
	List<Mal> malListByOlusturan(String olusturan);
	Iterable<Mal> malList();
	Mal malOlustur(Mal mal);
	Mal malCek(Long id);
	void malSil(Long id);
	Mal malGunceller(Mal mal);
	List<Mal> malCekByIslemId(Long id);
	void malSilByIslemId(List<Mal> mallar);
	
	List<UserBilgileri> userBilgileriListByOlusturan(String olusturan);
	Iterable<UserBilgileri> userBilgileriList();
	UserBilgileri userBilgileriOlustur(UserBilgileri userBilgileri);
	UserBilgileri userBilgileriCek(Long id);
	void userBilgileriSil(Long id);
	UserBilgileri userBilgileriGunceller(UserBilgileri userBilgileri);
	UserBilgileri  userBilgCekByUserId(Long userId);
	
	List<Iller> ilList();
	List<Ilceler> ilcelerListByIlId(Long ilId);
	Iller ilCekByAd(String ad);
	List<Islem> islemCekByGonderen(Long gonderici);
	List<Islem> islemCekByAlan(Long alici);
	Long userBilgilerindenUserIdCek(Long id);
	
	
}
