package com.org.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.userDao;
import com.org.dto.Note;
import com.org.dto.User;
@WebServlet("/addnotes")
public class addNotes extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String title = req.getParameter("title");
	String des = req.getParameter("description");
	
	Note note = new Note();
	note.setTitle(title);
	note.setDescription(des);
	
	HttpSession session = req.getSession();
	User user = (User)session.getAttribute("UserData");
	
	List<Note> notes = new ArrayList<Note>();
	notes.add(note);
	
	user.setNote(notes);
	note.setUser(user);
	
	userDao dao = new userDao();
	dao.saveAndUpdateUser(user);
	
	session.setAttribute("addSuccess", "NOTE ADDED SUCCESSFULLY");
	resp.sendRedirect("home.jsp");
}
}
