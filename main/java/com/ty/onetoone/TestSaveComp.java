package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveComp {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Company company=new Company();
	company.setName("TYSS");
	company.setPhone("4646464");
	company.setWeb("tyss.com");
	
	Gst gst=new Gst();
	gst.setGstno("JSKKSN7795L");
	gst.setState("Karnataka");	
	gst.setCountry("India");
	gst.setCompany(company);
	
	entityTransaction.begin();
	entityManager.persist(company);
	entityManager.persist(gst);
	entityTransaction.commit();
	System.out.println("-------------------------------");
}
}
