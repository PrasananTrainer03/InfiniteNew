<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean1" class="com.java.jsp.Hello" />
	<jsp:setProperty property="sname" name="bean1"/>
	Value is : 
	<b>
		<jsp:getProperty property="sname" name="bean1"/>
	</b>
</body>
</html>