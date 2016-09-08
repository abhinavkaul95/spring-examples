<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
<form:form action="addRequest" method="post" class="centered">
<div class="margined inline"><strong>Request Type: </strong><form:select path="requestType" items="${typeList}"></form:select></div>
<div class="margined inline"><strong>Request ID: </strong><form:input path="requestId"/></div>
<div class="margined inline"><strong>Description: </strong><form:input path="description"/></div>
<div class="margined inline"><strong>Customer Number: </strong><form:input path="customerNumber"/></div>
<div class="margined inline"><input type="submit" value="Add the request"></div>
</form:form>
<div style="float: right; margin-right: 20%;"><a href=".">Back to index page</a></div>
</body>
</html>