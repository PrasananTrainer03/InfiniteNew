<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set value="0" var="i" />
	<c:forEach step="1" begin="1" end="6">
		<c:out value="${i}" />
		<c:set var="i" value="${i+1}" />
		<c:out value="Welcome to JSTL" /> <br/>
	</c:forEach>
</body>
</html>