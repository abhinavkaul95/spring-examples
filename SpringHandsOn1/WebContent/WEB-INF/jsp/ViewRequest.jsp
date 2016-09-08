<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
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
<tr>
<td>${command.requestType}</td>
<td>${command.requestId}</td>
<td>${command.description}</td>
<td>${command.customerNumber}</td>
</tr>
</table>
</div>
<div style="float: right; margin-right: 20%;"><a href=".">Back to index page</a></div>
</body>
</html>