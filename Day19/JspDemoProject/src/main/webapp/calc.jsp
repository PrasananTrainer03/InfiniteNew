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
	int firstNo, secondNo, result;
	firstNo = Integer.parseInt(request.getParameter("firstNo"));
	secondNo = Integer.parseInt(request.getParameter("secondNo"));
	result = firstNo + secondNo;
	out.println("Sum is  " +result+ "<br/>");
	result = firstNo - secondNo;
	out.println("Sub is  " +result + "<br/>");
	result = firstNo * secondNo;
	out.println("Multiplication is  " +result + "<br/>");
%>
</body>
</html>