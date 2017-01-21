package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="passportno")
	private String passportno;
	
	@Column(name="expirydate")
	private String expiry;
	
	@Column(name="placeofissue")
	private String placeofissue;


	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassportno() {
		return passportno;
	}

	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getPlaceofissue() {
		return placeofissue;
	}

	public void setPlaceofissue(String placeofissue) {
		this.placeofissue = placeofissue;
	}
	
	
	
	
}
