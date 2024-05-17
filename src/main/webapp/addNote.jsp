<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
    .paint-card{
       box-shadow: 0 0 10px rgba(0,0,0,0.3);
    }
</style>
<%@ include file="components/bootstrap.jsp" %>
</head>
<body>

<%@ include file="components/homeNavBar.jsp"%>

	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-4 text-center">ADD NOTES HERE</p>
						
						
						<form action="addnotes" method="post">
							<div class="mb-3">
								<label class="form-label">Title</label> <input
									name="title" type="text" class="form-control" required>
							</div>
							<div class="mb-3">
							   <textarea rows="7" class="form-control" cols="45" placeholder="Add your notes here ...." name="description"></textarea>								
					        </div>
							<button type="submit" class="btn bg-primary text-white col-md-12">ADD</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>



</body>
</html>