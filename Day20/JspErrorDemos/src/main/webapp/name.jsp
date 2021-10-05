<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean1" class="com.java.jsp.Name"/>
	<jsp:setProperty property="firstName" name="bean1"/>
	<jsp:setProperty property="lastName" name="bean1"/>
	First Name : 
	<b>
		<jsp:getProperty property="firstName" name="bean1"/>
	</b> <br/><br/>
	Last Name : 
	<b>
		<jsp:getProperty property="lastName" name="bean1"/>
	</b> <br/><br/> 
	Full Name : 
	<b>
		<%=bean1.fullName() %>
	</b>
</body>
</html>