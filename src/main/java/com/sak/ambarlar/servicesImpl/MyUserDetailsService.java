package com.sak.ambarlar.servicesImpl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sak.ambarlar.dao.AmbarRepository;
import com.sak.ambarlar.dao.UserBilgileriRepository;
import com.sak.ambarlar.dao.UserRepository;
import com.sak.ambarlar.model.Ambar;
import com.sak.ambarlar.model.Bavul;
import com.sak.ambarlar.model.User;
import com.sak.ambarlar.model.UserBilgileri;


@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserBilgileriRepository userBilgileriRepository;
	@Autowired
	private AmbarRepository ambarRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user ;
		user = userRepository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("User name "+username+" not found");
		}
		UserBilgileri userBilgileri = userBilgileriRepository.userBilgCekByUserId(user.getId());
		if(userBilgileri == null) {
			userBilgileri = new UserBilgileri();
		}
		Ambar patronunAmbari = ambarRepository.patronAmbari(user);
		if(patronunAmbari == null) {
			patronunAmbari = new Ambar();
		}
		if(user.getPersonelinAmbari() == null) {
			user.setPersonelinAmbari(new Ambar("personel değil"));
		}
		return new Bavul(user.getUserName(), user.getPassword(),
				getGrantedAuthorities(user),userBilgileri.getId(),patronunAmbari.getId(),user.getId(),
				user.getPersonelinAmbari().getId());
	}
	private Collection<GrantedAuthority> getGrantedAuthorities(User user) {
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		if(user.getRol().getRolAdi().equals("musteri")) {
			grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_MUSTERI"));
		}else if(user.getRol().getRolAdi().equals("patron")) {
			grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_PATRON"));
		}else if(user.getRol().getRolAdi().equals("personel")) {
			grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_PERSONEL"));
		}
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return grantedAuthorities;
	}
}
