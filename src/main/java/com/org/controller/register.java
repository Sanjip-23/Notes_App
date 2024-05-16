package com.org.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.userDao;
import com.org.dto.User;
@WebServlet("/register")
public class register extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);	
	String name = req.getParameter("name");
	int age =Integer.parseInt(req.getParameter("age"));
	long mobile =Long.parseLong(req.getParameter("mobile"));
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	
	 
	 User u=new User();
	 u.setName(name); 
	 u.setAge(age);
	 u.setMobile(mobile);
	 u.setEmail(email);
	 u.setPassword(password);
	 
	 userDao user=new userDao();
	 user.saveAndUpdateUser(u);
	 
	 HttpSession session = req.getSession();
	 session.setAttribute("success", "Registration Successful");
	 
	 resp.sendRedirect("register.jsp");
}
}
