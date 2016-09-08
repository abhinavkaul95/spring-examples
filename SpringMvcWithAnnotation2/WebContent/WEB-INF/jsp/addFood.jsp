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
<form:form action="addFood" method="post">
<form:input path="foodCode"/><span style="color: red;"><form:errors path="foodCode"></form:errors></span>
<form:input path="description"/><span style="color: red;"><form:errors path="description"></form:errors></span>
<form:input path="ratePerUnit"/>
<form:select path="cuisine" items="${cuisineData}"></form:select>
<input type="submit" value="Submit">
</form:form>
</body>
</html>