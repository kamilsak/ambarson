package com.sak.ambarlar.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.data.jpa.domain.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement
@Entity
@Table(name = "`ambar`")
public class Ambar extends AbstractPersistable<Long> {

	private transient Long id;

	@Column(name = "status_no")
	private StatuCode status;

	@NotNull(message = "boş  bırakılamaz")
	@Size(min = 4, max = 20, message = "enaz 4 ençok 20  karakter olmalı")
	private String ad;

	@Temporal(TemporalType.DATE)
	private Date olusturmaTarihi;

	@OneToOne
	@JoinColumn(name = "patron_id")
	private User patron;
	
	@XmlTransient
	@JsonIgnore
	@OneToMany(targetEntity = User.class, mappedBy="personelinAmbari", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<User> personel;
	
	public Ambar() {
	}
	public Ambar(
			@NotNull(message = "boş  bırakılamaz") @Size(min = 4, max = 20, message = "enaz 4 ençok 20  karakter olmalı") String ad) {
		this.ad = ad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public StatuCode getStatus() {
		return status;
	}

	public void setStatus(StatuCode status) {
		this.status = status;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Date getOlusturmaTarihi() {
		return olusturmaTarihi;
	}

	public void setOlusturmaTarihi(Date olusturmaTarihi) {
		this.olusturmaTarihi = olusturmaTarihi;
	}

	public User getPatron() {
		return patron;
	}

	public void setPatron(User patron) {
		this.patron = patron;
	}
	@Override
	public String toString() {
		return "Ambar [status=" + status + ", ad=" + ad + ", olusturmaTarihi=" + olusturmaTarihi + "]";
	}

}
