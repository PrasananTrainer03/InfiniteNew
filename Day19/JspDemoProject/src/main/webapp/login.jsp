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
	String user,pwd;
	user = request.getParameter("userName");
	pwd = request.getParameter("passWord");
	
	if (user.equals("Nikita") && pwd.equals("Mohanty")) {
%>
	<jsp:forward page="menu.jsp"/>
<%
	} else {
%>
	<p>Invalid Credentials</p>
	<br/>
	<jsp:include page="login.html"/>
<%
	}
%>
</body>
</html>