package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Person person=new Person();
	person.setName("bindu");
	person.setEmail("bindu@mmail.com");
	person.setPhone("990004444");
	
	Pan pan=new Pan();
	pan.setAddress("Mysore");
	pan.setPan_num("SSJS7731P");
	person.setPan(pan);
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(pan);
	entityTransaction.commit();
}
}
