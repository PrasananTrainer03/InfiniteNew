<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String company="Infinite";
	out.println("Company is  " +company+"<br/>");
	session.setAttribute("company", company);
%>
<a href="page2.jsp">Page 2</a>
</body>
</html>