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
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sanjip");
	  
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
  public void saveAndUpdateUser(User user)
  {  
	  
	  entityTransaction.begin();
	  entityManager.merge(user);
	  entityTransaction.commit();
  }
  
  public User fetchUserById(int id) 
  {
     
	  return entityManager.find(User.class, id); 
  }
  
  public User fetchUserByEmailAndPassword(String email,String password) {
	  String q = "select s from User s where email=?1 and password = ?2";
	  Query query = entityManager.createQuery(q);
	  query.setParameter(1, email);
	  query.setParameter(2, password);
	  
	  List<User> list = query.getResultList();
	  if(list.isEmpty())
		  return null;
	  
	  return list.get(0);
//	  int id=0;
//	  for(User u : list) {
//		  id=u.getId();
//	  }
//	  User user = entityManager.find(User.class, id);
//	  return user;
  }
  
  public List<User> fetchAllUsers()
  {
     
	  Query query = entityManager.createQuery("select s from User s");
	  List<User> list = query.getResultList();
	   return list;
  }
}
