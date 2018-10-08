<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Customer details</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
	<!-- Popper JS -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script></head>
<body>
<h3 style="margin:5px;">Enter customer details:</h3>
	<div class="container-fluid">
		<form:form action="readCustomerForm" modelAttribute="customer" method="post">
			<div class="form-group">
			<form:label path="custId">ID: </form:label>
			<form:input path="custId" class="form-control"/>
			</div>
			<div class="form-group">
			<form:label path="custEmail">Email: </form:label>
			<form:input path="custEmail" class="form-control"/>
			</div>
			<div class="form-group">
			<form:label path="custName">Name: </form:label>
			<form:input path="custName" class="form-control"/>
			</div>
			<div class="form-group">
			<form:label path="custPass">Password: </form:label>
			<form:input path="custPass" class="form-control"/>
			</div>
			<div class="form-group">
			<form:label path="custPhone">phone: </form:label>
			<form:input path="custPhone" class="form-control"/>
			</div>
			<input type="submit" value="Insert Customer" class="btn btn-primary">
		</form:form>
	</div>
</body>
</html>