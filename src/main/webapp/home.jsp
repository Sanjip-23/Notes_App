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
<%@ include file="components/homeNavBar.jsp" %>

<h1>WELCOME TO HOME PAGE</h1>

    <%HttpSession session2 = request.getSession(); 
    String msg = (String)session2.getAttribute("addSuccess");
    if(msg != null){
    %>
    <h1  style="text-align: center;"><%= msg %></h1>
    <% 
    session2.invalidate();
    }
    %>
    

   <a href="addNote.jsp">
      <button type="button" class="btn btn-primary">ADD NOTE</button>
     </a>
</body>
</html>