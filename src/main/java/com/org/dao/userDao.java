package com.org.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.org.dto.User;

public class userDao 
{
  public void saveAndUpdateUser(User user)
  {
	  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sanjip");
	  
	  EntityManager entityManager = entityManagerFactory.createEntityManager();
	  
	  EntityTransaction entityTransaction = entityManager.getTransaction();
	  
	  entityTransaction.begin();
	  entityManager.merge(user);
	  entityTransaction.commit();
  }
  
  public User fetchUserById(int id) 
  {
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sanjip");
	  
	  EntityManager entityManager = entityManagerFactory.createEntityManager();
	  User user = entityManager.find(User.class, id);
	  
	  user.getId();
	  user.getName();
	  user.getAge();
	  user.getMobile();
	  user.getEmail();
	  user.getPassword();
	  
	  return user;  
  }
  
  public List<User> fetchAllUsers()
  {
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sanjip");
	  
	  EntityManager entityManager = entityManagerFactory.createEntityManager();
	  Query query = entityManager.createQuery("select s from User s");
	  List<User> list = query.getResultList();
	   return list;
  }
}
