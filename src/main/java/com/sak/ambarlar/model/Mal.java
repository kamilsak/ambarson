package com.sak.ambarlar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="`mal`")
public class Mal extends AbstractPersistable<Long>{
	
	private transient Long id ;
	
	@Column(name="icerik")
	private String icerik;
	
	@Column(name="agirlik")
	private Long agirlik;
	
	@Column(name="hacim")
	private Long hacim;
	
	@Column(name="islem_id")
	private Long islem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public Long getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(Long agirlik) {
		this.agirlik = agirlik;
	}

	public Long getHacim() {
		return hacim;
	}

	public void setHacim(Long hacim) {
		this.hacim = hacim;
	}

	public Long getIslem() {
		return islem;
	}

	public void setIslem(Long islem) {
		this.islem = islem;
	}

	@Override
	public String toString() {
		return "Mal [icerik=" + icerik + ", agirlik=" + agirlik + ", hacim=" + hacim + "]";
	}
	
	
}
