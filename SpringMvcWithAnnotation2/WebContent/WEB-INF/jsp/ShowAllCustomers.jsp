<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="../resources/css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table>
<c:forEach items="${foundCustomers}" var="cust">
<spring:url value="/customer/${cust.customerNumber}" var="url"></spring:url>
<tr>
<td><a href="${url}">${cust.customerNumber}</a></td>
<td><span onclick="alert('No details')"><c:out value="${cust.customerName}"></c:out></span></td>
<td><c:out value="${cust.phoneNumber}"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>