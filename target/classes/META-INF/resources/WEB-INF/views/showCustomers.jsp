<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers</title>
</head>
<body>
	<table>
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