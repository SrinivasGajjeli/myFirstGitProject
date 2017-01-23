package com.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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


	@OneToOne(mappedBy="passport", cascade=CascadeType.ALL)
	@JoinColumn(name="passportid")
	private Employee emp;
	
	
	
	
	
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

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
