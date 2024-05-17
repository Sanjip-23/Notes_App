<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="components/bootstrap.jsp" %>
</head>
<body>
    <%
	User validateUserSession = (User) session.getAttribute("UserData");
	if (validateUserSession == null) {
		response.sendRedirect("login.jsp");
	} else {
	%>
	<%@include file="components/homeNavBar.jsp"%>

	<%
	User details = (User) session.getAttribute("UserData");
	%>
	<h1 class="text-center">
		Welcome
		<%=details.getName()%>
		to Home Page
<h1 style=" color : blue">
<%= "My profile :-" %>
</h1>
<h4>
   Your Name:<%= details.getName() %><br>
   Your Age:<%= details.getAge() %><br>
   Your Mobile:<%= details.getMobile() %><br>
   Your Email:<%= details.getEmail() %><br>
  </h4>
<%} %>
</body>
</html>