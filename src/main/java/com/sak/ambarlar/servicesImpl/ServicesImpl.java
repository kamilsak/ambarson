package com.sak.ambarlar.servicesImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.sak.ambarlar.dao.AdresRepository;
import com.sak.ambarlar.dao.AmbarRepository;
import com.sak.ambarlar.dao.IlcelerRepository;
import com.sak.ambarlar.dao.IllerRepository;
import com.sak.ambarlar.dao.IslemRepository;
import com.sak.ambarlar.dao.MalRepository;
import com.sak.ambarlar.dao.RoleRepository;
import com.sak.ambarlar.dao.SozlesmeRepository;
import com.sak.ambarlar.dao.UserBilgileriRepository;
import com.sak.ambarlar.dao.UserRepository;
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
import com.sak.ambarlar.services.Services;
@Service
public class ServicesImpl implements Services {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private AmbarRepository ambarRepository;
	@Autowired
	private AdresRepository adresRepository;
	@Autowired
	private IslemRepository islemRepository;
	@Autowired
	private MalRepository malRepository;
	@Autowired
	private SozlesmeRepository sozlesmeRepository;
	@Autowired
	private UserBilgileriRepository userBilgileriRepository;
	@Autowired
	private IllerRepository illerRepository;
	@Autowired
	private IlcelerRepository ilcelerRepository;
	
	/* USER  
	   ============================================================
	*/
	@Override
	public User sistemdekiUser(String userName) {
		return userRepository.findByUsername(userName);		
	}
	@Override
	public User userOlustur(User user) {
		return userRepository.save(user);
	}
	@Override
	public User userCek(Long id) {
		return userRepository.findByID(id);
	}
	@Override
	public void userSil(Long id) {
		userRepository.deleteById(id);
	}
	@Override
	public User userGunceller(User user) {
		User user2 = userCek(user.getId());
		user2 = user ;
		return userRepository.save(user2);
	}
	@Override
	public List<User> ambarinPersList(Ambar ambar) {
		return userRepository.personelList(ambar);
	}

	/* ROLE   
	   ============================================================
	*/
	@Override
	public List<String> userRolList() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
		List<String> roles = new ArrayList<String>();
		for (GrantedAuthority a : authorities) {
			roles.add(a.getAuthority());
		}
		return roles;
	}

	@Override
	public List<Role> roleList() {
		return roleRepository.findAll();
	}

	@Override
	public void roleOlustur(Role role) {
		roleRepository.save(role);
	}

	@Override
	public Role roleCek(Long id) {
		return roleRepository.getOne(id);
	}
	
	/* AMBAR   
	   ============================================================
	*/
	@Override
	public List<Ambar> ambarList() {
		return ambarRepository.findAll();
	}
	@Override
	public void ambarOlustur(Ambar ambar) {
		ambarRepository.save(ambar);
	}
	@Override
	public Ambar ambarCek(Long id) {
		return ambarRepository.getOne(id);
	}
	@Override
	public void ambarSil(Long id) {
		ambarRepository.deleteById(id);
	}
	@Override
	public Ambar ambarGunceller(Ambar ambar) {
		return ambarRepository.saveAndFlush(ambar);
	}
	@Override
	public Ambar ambarCekByUser(User user) {
		return ambarRepository.patronAmbari(user);
	}
	
	/* ADRES   
	   ============================================================
	*/
	
	@Override
	public List<Adres> adresList() {
		return adresRepository.adresList();
	}
	@Override
	public List<Adres> adresCekByUserBilgileri(Long user_bilgileri_id) {
		return adresRepository.adresCekByUserBilgileri(user_bilgileri_id);
	}
	@Override
	public List<Adres> adresCekByAmbar(Long ambar_id) {
		return adresRepository.adresCekByAmbar(ambar_id);
	}

	@Override
	public Adres adresOlustur(Adres adres) {
		return adresRepository.save(adres);
	}

	@Override
	public Adres adresCek(Long id) {
		return adresRepository.getirById(id);
	}

	@Override
	public void adresSil(Long id) {
		adresRepository.deleteById(id);
	}

	@Override
	public Adres adresGunceller(Adres adres) {
		return adresRepository.save(adres);
	}
	@SuppressWarnings("deprecation")
	@Override
	public Page<Adres> adresListByAmbar(Long ambarId,Pageable pageable) {
		return adresRepository.adresListByAmbar(ambarId, new PageRequest(pageable.getPageNumber() - 1, 5, Sort.Direction.ASC, "baslik"));
	}
	@SuppressWarnings("deprecation")
	@Override
	public Page<Adres> adresListByUserBilgileri(Long userBilId, Pageable pageable) {
		return adresRepository.adresListByUserBilgileri(userBilId, new PageRequest(pageable.getPageNumber() - 1, 5, Sort.Direction.ASC, "baslik"));
	}
	/* SÖZLEŞME  
	   ============================================================
	*/
	@Override
	public List<Sozlesme> sozlesmeListByAmbar(Long ambarId) {
		return sozlesmeRepository.sozlesmeListByAmbar(ambarId);
	}

	@Override
	public Sozlesme sozlesmeOlustur(Sozlesme sozlesme) {
		return sozlesmeRepository.saveAndFlush(sozlesme);
	}

	@Override
	public Sozlesme sozlesmeCek(Long id) {
		return sozlesmeRepository.getOne(id);
	}

	@Override
	public void sozlesmeSil(Long id) {
		sozlesmeRepository.deleteById(id);
	}
	/* ISLEM  
	   ============================================================
	*/
	@Override
	public Islem islemListByOlusturan(String olusturan,IslemDurum durum) {
		return islemRepository.findByOlusturan(olusturan,durum);
	}
	@Override
	public Iterable<Islem> islemList() {
		return islemRepository.findAll();
	}
	@Override
	public Islem islemOlustur(Islem islem) {
		return islemRepository.save(islem);
	}
	@Override
	public Islem islemCek(Long id) {
		return islemRepository.findByID(id);
	}
	@Override
	public void islemSil(Long id) {
		islemRepository.deleteById(id);
	}
	@Override
	public Islem islemGunceller(Islem islem) {
		Islem islem2 = islemCek(islem.getId());
		if(islem2 != null) {
			islem2 = islem;
			return islemRepository.save(islem2);
		}
		return islemRepository.save(islem);
	}
	@Override
	public List<Islem> islemCekByGonderen(Long gonderici) {
		return islemRepository.islemCekByGonderen(gonderici);
	}
	@Override
	public List<Islem> islemCekByAlan(Long alici) {
		return islemRepository.islemCekByAlici(alici);
	}
	/* MAL 
	   ============================================================
	*/
	@Override
	public List<Mal> malListByOlusturan(String olusturan) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterable<Mal> malList() {
		return malRepository.findAll();
	}
	@Override
	public Mal malOlustur(Mal mal) {
		return malRepository.save(mal);
	}
	@Override
	public Mal malCek(Long id) {
		return malRepository.getOne(id);
	}
	@Override
	public void malSil(Long id) {
		malRepository.deleteById(id);
	}
	@Override
	public Mal malGunceller(Mal mal) {
		return malRepository.saveAndFlush(mal);
	}
	@Override
	public List<Mal> malCekByIslemId(Long id) {
		return malRepository.malCekByIslemId(id);
	}
	@Override
	public void malSilByIslemId(List<Mal> mallar) {
		malRepository.deleteInBatch(mallar);
	}
	
	/* MAL 
	   ============================================================
	*/
	@Override
	public List<UserBilgileri> userBilgileriListByOlusturan(String olusturan) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterable<UserBilgileri> userBilgileriList() {
		return userBilgileriRepository.findAll();
	}
	@Override
	public UserBilgileri userBilgileriOlustur(UserBilgileri userBilgileri) {
		return userBilgileriRepository.saveAndFlush(userBilgileri);
	}
	@Override
	public UserBilgileri userBilgileriCek(Long id) {
		return userBilgileriRepository.getOne(id);
	}
	@Override
	public void userBilgileriSil(Long id) {
		userBilgileriRepository.deleteById(id);
	}
	@Override
	public UserBilgileri userBilgileriGunceller(UserBilgileri userBilgileri) {
		return userBilgileriRepository.saveAndFlush(userBilgileri);
	}
	@Override
	public UserBilgileri userBilgCekByUserId(Long userId) {
		return userBilgileriRepository.userBilgCekByUserId(userId);
	}
	@Override
	public Long userBilgilerindenUserIdCek(Long id) {
		return userBilgileriRepository.userBilgilerindenUserIdCek(id);
	}
	
	@Override
	public List<Iller> ilList() {
		return illerRepository.findAll();
	}
	@Override
	public List<Ilceler> ilcelerListByIlId(Long ilId) {
		return ilcelerRepository.findIlcelerByIlId(ilId);
	}
	@Override
	public Iller ilCekByAd(String ad) {
		return illerRepository.ilCekByAd(ad);
	}
	
	
}
