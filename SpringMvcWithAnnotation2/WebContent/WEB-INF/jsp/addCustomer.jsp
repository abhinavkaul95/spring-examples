<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form action="addCustomer" method="post">
<form:input path="customerNumber" />
<form:input path="customerName" />
<form:input path="emailId" />
<form:input path="phoneNumber" />
<input type="submit" value="Submit">
</form:form>
</body>
</html>