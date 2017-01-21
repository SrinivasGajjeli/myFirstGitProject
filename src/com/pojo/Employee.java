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
@Table(name="employee")
public class Employee {

	@GeneratedValue
	@Id
	@Column(name="id")
	private Integer id;
	
	
	@Column(name="empname")
	private String empname;
	
	@Column(name="empdesignation")
	private String empdesignation;
	
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="company")
	private String company;

	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passportid")
	private Passport passport;
	
	
	
	
	
	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdesignation() {
		return empdesignation;
	}

	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
	
}
