package com.sak.ambarlar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="iller")
public class Iller{
	
	@Id
	private Long plaka;
	private String ad;
	
	
	public Iller() {
		// TODO Auto-generated constructor stub
	}
	public Iller(Long plaka, String ad) {
		this.plaka = plaka;
		this.ad = ad;
	}
	public Long getPlaka() {
		return plaka;
	}
	public void setPlaka(Long plaka) {
		this.plaka = plaka;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Iller [plaka=" + plaka + ", ad=" + ad + "]";
	}
	
	
	
}
