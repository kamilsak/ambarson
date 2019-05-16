package com.sak.ambarlar.model;

import javax.persistence.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="`sozlesme`")
public class Sozlesme extends AbstractPersistable<Long>{

	private transient Long id ;
	
	private SozlesmeTipi tip;
	
	private String teslimatSüresi;
	
	@JoinColumn(name="birim_fiyat")
	private Long birimFiyat;
	
	@JoinColumn(name="pesin")
	private boolean pesin = true;
	
	private String neredenIl;
	private String neredenIlce;
	private String nereyeIl;
	private String nereyeIlce;
	
	@Column(name="user_id")
	private Long user;
	
	@Column(name = "ambar_id")
	private Long ambar;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBirimFiyat() {
		return birimFiyat;
	}

	public void setBirimFiyat(Long birimFiyat) {
		this.birimFiyat = birimFiyat;
	}

	public boolean isPesin() {
		return pesin;
	}

	public void setPesin(boolean pesin) {
		this.pesin = pesin;
	}

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public Long getAmbar() {
		return ambar;
	}

	public void setAmbar(Long ambar) {
		this.ambar = ambar;
	}
	
	public SozlesmeTipi getTip() {
		return tip;
	}

	public void setTip(SozlesmeTipi tip) {
		this.tip = tip;
	}

	public String getNeredenIl() {
		return neredenIl;
	}

	public void setNeredenIl(String neredenIl) {
		this.neredenIl = neredenIl;
	}

	public String getNeredenIlce() {
		return neredenIlce;
	}

	public void setNeredenIlce(String neredenIlce) {
		this.neredenIlce = neredenIlce;
	}

	public String getNereyeIl() {
		return nereyeIl;
	}

	public void setNereyeIl(String nereyeIl) {
		this.nereyeIl = nereyeIl;
	}

	public String getNereyeIlce() {
		return nereyeIlce;
	}

	public void setNereyeIlce(String nereyeIlce) {
		this.nereyeIlce = nereyeIlce;
	}

	public String getTeslimatSüresi() {
		return teslimatSüresi;
	}

	public void setTeslimatSüresi(String teslimatSüresi) {
		this.teslimatSüresi = teslimatSüresi;
	}
	
}
 