<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Customer Log In</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
	<!-- Popper JS -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
	<c:import url="navbar.jsp"></c:import>
	<h3 style="margin:10px;">Enter user credentials: </h3>
	<div class="container-fluid">
		<form:form action="readCredentials" modelAttribute="credentials" method="post">
			<div class="form-group">
			<form:label path="username">Username: </form:label>
			<form:input path="username" class="form-control"/>
			</div>
			<div class="form-group">
			<form:label path="password">Password: </form:label>
			<form:password path="password" class="form-control"/>
			</div>
			<input type="submit" value="Login" class="btn btn-primary">
		</form:form>
	</div>
</body>
</html>