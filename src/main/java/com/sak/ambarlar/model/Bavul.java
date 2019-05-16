package com.sak.ambarlar.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class Bavul extends org.springframework.security.core.userdetails.User{
	private static final long serialVersionUID = 8468776882273355070L;
	private Long userBilgileriId;
	private Long patronunAmbariId;
	private Long userId;
	private Long personelinAmbari;
	public Bavul(String username, String password, Collection<? extends GrantedAuthority> authorities,
			Long userBilgileriId,Long patronunAmbariId,Long userId,Long personelinAmbari) {
		super(username, password, authorities);
		this.userBilgileriId = userBilgileriId;
		this.patronunAmbariId = patronunAmbariId;
		this.userId = userId ;
		this.personelinAmbari = personelinAmbari;
	}

	public Long getUserBilgileriId() {
		return userBilgileriId;
	}

	public void setUserBilgileriId(Long userBilgileriId) {
		this.userBilgileriId = userBilgileriId;
	}

	public Long getPatronunAmbariId() {
		return patronunAmbariId;
	}

	public void setPatronunAmbariId(Long patronunAmbariId) {
		this.patronunAmbariId = patronunAmbariId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPersonelinAmbari() {
		return personelinAmbari;
	}

	public void setPersonelinAmbari(Long personelinAmbari) {
		this.personelinAmbari = personelinAmbari;
	}
	
}