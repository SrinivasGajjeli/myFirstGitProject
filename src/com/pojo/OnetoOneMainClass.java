package com.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class OnetoOneMainClass {

	
	public static void main(String[] args) {
		
		 
		Employee emp=new Employee();
		emp.setEmpname("Srinivas");
		emp.setEmpdesignation("Associate");
		emp.setCompany("CTS");
		emp.setSalary("50k");

		Passport passport=new Passport();
		
		passport.setPassportno("K1854534");
		passport.setExpiry("12March2022");
		passport.setPlaceofissue("Hyderabad");
		
		emp.setPassport(passport);
		
		
		Configuration configure = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		
		 SessionFactory sessionFactory = configure.buildSessionFactory();
		 
		 
		 Session session = sessionFactory.openSession();
		 
		 Transaction transcation = session.beginTransaction();
		 
		 session.save(emp);
		 transcation.commit();
		 
	}
}
