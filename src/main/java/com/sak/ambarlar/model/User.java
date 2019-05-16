package com.sak.ambarlar.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.sak.ambarlar.util.UniqueUsername;


@Entity
@Table(name="`user`")
public class User extends AbstractPersistable<Long>{
	
	private transient Long id;
	
	@Column(name="status_no")
	private StatuCode status;
	
	@NotNull(message="Kullanıcı Adınız Boş olamaz.")
	@Size(min=3 ,max = 20 , message= "min, max karakter hatası.!!")
	@Column(name="username")
	@UniqueUsername(message="Bu kullanıcı adı daha önce alınmıştır. lütfen başka bir kullanıcı adı seçiniz. ")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role rol;
	
	@ManyToOne
	@JoinColumn(name = "personelin_ambari")
	private Ambar personelinAmbari;

	@Email(message="Email adresini yanlış girdiniz.")
	@Column(name="email")
	private String email;
	
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRol() {
		return rol;
	}

	public void setRol(Role rol) {
		this.rol = rol;
	}

	public Ambar getPersonelinAmbari() {
		return personelinAmbari;
	}

	public void setPersonelinAmbari(Ambar personelinAmbari) {
		this.personelinAmbari = personelinAmbari;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [status=" + status + ", userName=" + userName + "]";
	}

	
}
