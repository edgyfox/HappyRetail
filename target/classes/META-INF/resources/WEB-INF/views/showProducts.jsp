<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>Brand</th>
			<th>Name</th>
			<th>Category</th>
			<th>Price</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.prodId}</td>
				<td>${product.prodBrand}</td>
				<td>${product.prodName}</td>
				<td>${product.prodCat}</td>
				<td>${product.prodPrice}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>