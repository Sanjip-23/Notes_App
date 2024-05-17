<%@page import="com.org.dao.userDao"%>
<%@page import="com.org.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
<%@ include file="components/bootstrap.jsp" %>
</head>
<body>

<% User validateUserSession = (User)session.getAttribute("UserData");
		if(validateUserSession==null)
		{
			response.sendRedirect("login.jsp");
		}
		else
		{ %>
			<%@ include file="components/homeNavBar.jsp" %>
	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
					<% 
						int id = Integer.parseInt(request.getParameter("id"));
						
					%>
					<% 
						String msg = (String)session.getAttribute("failure");
						if(msg!=null)
						{ %>
							<h5 style="color: red;"><%= msg %></h5>
					<%	}
					%>
						<p class="fs-4 text-center"><b>Change Password</b></p>
						<form action="changePassword" method="post">
							<div class="mb-3">
								<label class="form-label">Enter Old Password</label> <input name="oldPassword"
									type="password" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Enter New Password</label> <input name="newPassword"
									type="password" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Confirm New Password</label> <input name="confirmPassword"
									type="password" class="form-control" required>
							</div>
							<input type="hidden" name="id" value="<%= id %>">
							<button type="submit" class="btn bg-primary text-white col-md-12">Update</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
		<%}
	%>
</body>
</html>