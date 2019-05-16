package com.sak.ambarlar.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@Table(name = "`role`")
public class Role extends AbstractPersistable<Long> {

	private transient Long id;
	@Column(name = "rol_ismi")
	@Size(min = 4, message = "çok kısa oldu. en az 4 karakter olmalı.")
	private String rolAdi;
	
	@OneToMany(targetEntity = User.class, mappedBy = "rol", fetch = FetchType.LAZY ,cascade=CascadeType.ALL)
	private Set<User> users;

	public String getRolAdi() {
		return rolAdi;
	}

	public void setRolAdi(String rolAdi) {
		this.rolAdi = rolAdi;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", rolAdi=" + rolAdi + "]";
	}

	
}
