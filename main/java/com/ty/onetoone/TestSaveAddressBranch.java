package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAddressBranch {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Address address=new Address();
	address.setState("Andra");
	address.setCountry("India");
	Branch branch=new Branch();
	branch.setName("TestYantra");
	branch.setPhone("999878744");
	branch.setAddress(address);
	
	entityTransaction.begin();
	entityManager.persist(address);
	entityManager.persist(branch);
	entityTransaction.commit();
	System.out.println("----------------------");
}
}
