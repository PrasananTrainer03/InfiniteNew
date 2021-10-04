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
	String company=(String)session.getAttribute("company");
	out.println("Company is " +company + "<br/><br/>");
%>
<a href="page3.jsp">Page 3</a>
</body>
</html>