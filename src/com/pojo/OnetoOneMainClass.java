package com.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class OnetoOneMainClass {

	
	public static void main(String[] args) {
		
		 
		//ravi changes are below
		
		System.out.println("My name is ravi, i'm going to change the vaidation logic for the ticket234");
		
		System.out.println("My first git test");
	/*	Employee emp=new Employee();
		emp.setEmpname("Srikanth");
		emp.setEmpdesignation("SSE");
		emp.setCompany("JDA");
		emp.setSalary("50k");

		Passport passport=new Passport();
		
		passport.setPassportno("K1854534");
		passport.setExpiry("12March2021");
		passport.setPlaceofissue("Sircilla");
		
		emp.setPassport(passport);
		passport.setEmp(emp);
*/		
		System.out.println("Feroz code");
		Configuration configure = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		
		 SessionFactory sessionFactory = configure.buildSessionFactory();
		 
		 
		 Session session = sessionFactory.openSession();
		 Passport passportObj = (Passport)session.get(Passport.class, 8);
		 
		 System.out.println("passport num is: "+passportObj.getPassportno());
		 System.out.println("employee name is:"+passportObj.getEmp().getEmpname());
		 
		/* Transaction transcation = session.beginTransaction();
		 
		 session.save(emp);
		 transcation.commit();*/
		 
	}
}
