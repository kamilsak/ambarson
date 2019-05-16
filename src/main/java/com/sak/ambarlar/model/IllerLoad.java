package com.sak.ambarlar.model;

import java.util.List;

public class IllerLoad{
	
	private Long plaka;
	private String il;
	private List<String> ilceleri;
	public Long getPlaka() {
		return plaka;
	}
	public void setPlaka(Long plaka) {
		this.plaka = plaka;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public List<String> getIlceleri() {
		return ilceleri;
	}
	public void setIlceleri(List<String> ilceleri) {
		this.ilceleri = ilceleri;
	}
	@Override
	public String toString() {
		return "IllerLoad [plaka=" + plaka + ", il=" + il + ", ilceleri=" + ilceleri + "]";
	}
	
	
	
}
