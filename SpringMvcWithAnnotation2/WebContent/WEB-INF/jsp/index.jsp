<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="addFood">Add Food Form</a>
<a href="addCustomer">Add Customer Form</a>
<form action="addCustomer/findCustomer" method="post"> 
<input type="text" name="key">
<input type="submit" value="Find Customer">
</form>
<form action="addCustomer/findAll" method="post">
<input type="submit" value="Find Customer">
</form>
<a href="getStudentDetails">Get Student Details</a>
</body>
</html>