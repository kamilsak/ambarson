package com.sak.ambarlar.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="`islem`")
public class Islem extends AbstractPersistable<Long>{
	
	private transient Long id ;
	
	@Column(name="durum")
	private IslemDurum durum;
	
	@Column(name="olusturan")
	private String islemiOlusturan;
	
	@Column(name="islem_tipi")
	private IslemTipi islemTipi;
	
	@Column(name="alici_id")
	private Long alici;
	
	@Column(name="gonderici_id")
	private Long gonderici;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tarih")
	private Date olusturmaTarihi;
	
	@Column(name="ambar_id")
	private Long ambar;
	
	@Column(name="adres_gon_id")
	private Long adresGon;
	
	@Column(name="adres_al_id")
	private Long adresAl;
	
	public Long getAdresGon() {
		return adresGon;
	}

	public void setAdresGon(Long adresGon) {
		this.adresGon = adresGon;
	}

	public Long getAdresAl() {
		return adresAl;
	}

	public void setAdresAl(Long adresAl) {
		this.adresAl = adresAl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public IslemDurum getDurum() {
		return durum;
	}

	public void setDurum(IslemDurum durum) {
		this.durum = durum;
	}

	public Long getAlici() {
		return alici;
	}

	public void setAlici(Long alici) {
		this.alici = alici;
	}

	public Long getGonderici() {
		return gonderici;
	}

	public void setGonderici(Long gonderici) {
		this.gonderici = gonderici;
	}

	public Date getOlusturmaTarihi() {
		return olusturmaTarihi;
	}

	public void setOlusturmaTarihi(Date olusturmaTarihi) {
		this.olusturmaTarihi = olusturmaTarihi;
	}

	public Long getAmbar() {
		return ambar;
	}

	public void setAmbar(Long ambar) {
		this.ambar = ambar;
	}

	public String getIslemiOlusturan() {
		return islemiOlusturan;
	}

	public void setIslemiOlusturan(String islemiOlusturan) {
		this.islemiOlusturan = islemiOlusturan;
	}

	
	public IslemTipi getIslemTipi() {
		return islemTipi;
	}

	public void setIslemTipi(IslemTipi islemTipi) {
		this.islemTipi = islemTipi;
	}

	@Override
	public String toString() {
		return "Islem [durum=" + durum + ", islemiOlusturan=" + islemiOlusturan + ", islemTipi=" + islemTipi
				+ ", alici=" + alici + ", gonderici=" + gonderici + ", olusturmaTarihi=" + olusturmaTarihi + ", ambar="
				+ ambar + ", adresGon=" + adresGon + ", adresAl=" + adresAl + "]";
	}

}
