<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<c:out value="language" />
<a href="?lang=en"></a>
<a href="?lang=fr"></a>
<a href="?lang=de"></a>
<h1>Spring MVC Application</h1>
<spring:message code="lbl.btn.username" var="username" />
<spring:message code="lbl.btn.password" var="password" />
<spring:message code="lbl.btn.phoneNumber" var="phoneNumber" />
<spring:message code="lbl.btn.submit" var="btnText" />
<form:form action="" method="post">
<label>${username}</label><form:input path="username" />
<label>${password}</label><form:input path="password" />
<label>${phoneNumber}</label><form:input path="phoneNumber"/>
<input value="${btnText}" />
</form:form>
</body>
</html>