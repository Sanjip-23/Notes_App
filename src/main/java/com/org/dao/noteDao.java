package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.org.dto.Note;
import com.org.dto.User;

public class noteDao 
{
  public Note fetchNoteById(int id)
  {
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sanjip");
	  
	  EntityManager entityManager = entityManagerFactory.createEntityManager();
	  Note note = entityManager.find(Note.class, id);
	  return note;  
  }
  
  public List<Note> fetchAllNotes()
  {
	  
	  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sanjip");
	  EntityManager entityManager = entityManagerFactory.createEntityManager();
	  Query query = entityManager.createQuery("select n from Note n");
	  List<Note> list = query.getResultList();
	  return list;
  }
}
