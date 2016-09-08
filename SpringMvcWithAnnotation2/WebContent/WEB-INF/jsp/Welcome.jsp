<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${command}
<table border="1">
<tr>
<td>${command.foodCode}</td>
<td>${command.description}</td>
<td>${command.ratePerUnit}</td>
</tr>
</table>
</body>
</html>