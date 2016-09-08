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
<div class="margined inline"><a href="addRequest">Add Request</a></div>
<div class="margined inline"><form action="viewRequest" method="post"><input type="text" name="key" placeholder="ID"><input type="submit" value="View Request By Id"></form></div>
<div class="margined inline"><form action="viewAllRequests" method="post"><input type="submit" value="View All Requests"></form></div>
</div>
</body>
</html>