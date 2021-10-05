<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean1" class="com.java.jsp.Greeting"/>
	Default Value : 
	<b>
		<jsp:getProperty property="greet" name="bean1"/>
	</b> <br/><br/>
	<jsp:setProperty property="greet" name="bean1" value="Good Afternoon..."/>
	Updated Value : 
	<b>
		<jsp:getProperty property="greet" name="bean1"/>
	</b>
</body>
</html>