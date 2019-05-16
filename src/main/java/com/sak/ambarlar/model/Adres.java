package com.sak.ambarlar.model;


import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.data.jpa.domain.AbstractPersistable;


@XmlRootElement
@Entity
@Table(name="`adres`")
public class Adres extends AbstractPersistable<Long> {
	
	private transient Long id;
	
	@Column(name="baslik")
	private String baslik;
	
	@Column(name="user_bilgileri")
	private Long  userBilgileri ;
	
	@Column(name="ambar_id")
	private Long  ambar ;
	
	private String  il;
	
	private String ilce;
	
	@Column(name="mahalle")
	private String mahalle;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name = "telefon_no", joinColumns = @JoinColumn(name = "adres_id"))
	@MapKeyColumn(name = "tel_tipi")
	@Column(name = "tel_no")
	@MapKeyEnumerated(EnumType.STRING)
	private Map<TelefonTipi, String> telefonNo = new HashMap<>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public Long getUserBilgileri() {
		return userBilgileri;
	}
	
	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public void setUserBilgileri(Long userBilgileri) {
		this.userBilgileri = userBilgileri;
	}

	public Long getAmbar() {
		return ambar;
	}

	public void setAmbar(Long ambar) {
		this.ambar = ambar;
	}
	

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	public Map<TelefonTipi, String> getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(Map<TelefonTipi, String> telefonNo) {
		this.telefonNo = telefonNo;
	}

	@Override
	public String toString() {
		return "Adres [baslik=" + baslik + ", il=" + il + ", ilce=" + ilce + ", mahalle=" + mahalle + "]";
	}
	
}
