<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="components/bootstrap.jsp" %>
<style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f8f9fa;
      margin: 0;
      padding: 0;
    }

    .container {
      max-width: 400px;
      margin: 100px auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .alert {
      background-color: #ffc107;
      color: #000;
      border-color: #ffc107;
    }

    .btn {
      margin-top: 20px;
    }
  </style>
</head>
<body>
     <div class="container">
    <div class="alert" role="alert">
      Are you sure you want to logout?
    </div>
    <div class="text-center">
    <a href="logoutServlet.jsp">
      <button type="button" class="btn btn-danger">Yes</button>
     </a>
     <a href="home.jsp">
      <button type="button" class="btn btn-secondary">No</button>
      </a>
    </div>
  </div>
</body>
</html>