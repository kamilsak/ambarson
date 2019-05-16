package com.sak.ambarlar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="`user_bilgileri`")
public class UserBilgileri extends AbstractPersistable<Long>{
	
	private transient Long id;
	
	@Column(name="unvan")
	private String unvan;
	
	@Column(name="ad")
	private String ad;
	
	@Column(name="soyad")
	private String soyad;
	
	@Column(name="user_id")
	private Long user;
	
	public UserBilgileri() {
	}
	public UserBilgileri(Long id, String unvan, String ad, String soyad) {
		this.id = id;
		this.unvan = unvan;
		this.ad = ad;
		this.soyad = soyad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

}
