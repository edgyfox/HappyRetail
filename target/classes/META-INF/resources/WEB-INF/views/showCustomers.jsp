<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Customers</title>
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
	<table class="table table-bordered table-striped" >
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
		</tr>
		<c:forEach var="customer" items="${customers}">
			<tr>
				<td>${customer.custId}</td>
				<td>${customer.custName}</td>
				<td>${customer.custEmail}</td>
				<td>${customer.custPhone}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>