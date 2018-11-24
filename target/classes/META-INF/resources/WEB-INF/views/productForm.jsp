<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Enter product details</title>
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
	<h3 style="margin:5px;">Enter product details:</h3>
	<div class="container-fluid">
		<form:form action="readForm" modelAttribute="product" method="post">
			<div class="form-group">
			<form:label path="prodId">ID: </form:label>
			<form:input path="prodId" class="form-control"/>
			<small><form:errors path="prodId" cssClass="text-danger"></form:errors></small>
			</div>
			<div class="form-group">
			<form:label path="prodBrand">Brand: </form:label>
			<form:input path="prodBrand" class="form-control"/>
			<small><form:errors path="prodBrand" cssClass="text-danger"></form:errors></small>
			</div>
			<div class="form-group">
			<form:label path="prodName">Name: </form:label>
			<form:input path="prodName" class="form-control"/>
			<small><form:errors path="prodName" cssClass="text-danger"></form:errors></small>
			</div>
			<div class="form-group">
			<form:label path="prodCat">Category: </form:label>
			<form:input path="prodCat" class="form-control"/>
			<small><form:errors path="prodCat" cssClass="text-danger"></form:errors></small>
			</div>
			<div class="form-group">
			<form:label path="prodGender">Gender: </form:label>
			<form:input path="prodGender" class="form-control"/>
			<small><form:errors path="prodGender" cssClass="text-danger"></form:errors></small>
			</div>
			<div class="form-group">
			<form:label path="prodPrice">Price: </form:label>
			<form:input path="prodPrice" class="form-control"/>
			<small><form:errors path="prodPrice" cssClass="text-danger"></form:errors></small>
			</div>
			<input type="submit" value="Insert Product" class="btn btn-primary">
		</form:form>
	</div>
</body>
</html>