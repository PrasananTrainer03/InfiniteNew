<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="loginvalid">
		<center>
			User Name : 
			<input type="text" name="userName" /> 
			<br/><br/>
			Password : 
			<input type="password" name="passWord" />
			<br/><br/>
			<input type="submit" value="Submit" />
		</center>
	</form>
	${error }
</body>
</html>