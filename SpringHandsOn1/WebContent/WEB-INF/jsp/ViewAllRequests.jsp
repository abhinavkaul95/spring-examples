<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<title>Insert title here</title>
</head>
<body>
<div class="centered">
<table border="1">
<tr>
<th>Request Type</th>
<th>Request Id</th>
<th>Description</th>
<th>Customer Number</th>
</tr>
<c:forEach items="${command}" var="req">
<tr>
<td>${req.requestType}</td>
<td>${req.requestId}</td>
<td>${req.description}</td>
<td>${req.customerNumber}</td>
</tr>
</c:forEach>
</table>
</div>
<div style="float: right; margin-right: 20%;"><a href=".">Back to index page</a></div>
</body>
</html>