package com.sak.ambarlar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ilceler")
public class Ilceler {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long ilId;
	private String ilce;
	
	public Ilceler() {
		// TODO Auto-generated constructor stub
	}
	public Ilceler(Long ilId, String ad) {
		this.ilId = ilId;
		this.ilce = ad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIlId() {
		return ilId;
	}
	public void setIlId(Long ilId) {
		this.ilId = ilId;
	}
	public String getAd() {
		return ilce;
	}
	public void setAd(String ad) {
		this.ilce = ad;
	}
	@Override
	public String toString() {
		return "Ilceler [id=" + id + ", ilId=" + ilId + ", ad=" + ilce + "]";
	}
	
	
}
	
