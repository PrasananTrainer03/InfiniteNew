<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<form method="post" action="EmpInsert.jsp">
		<center>
			Employ No : 
			<input type="text" name="empno"/> <br/> <br/> 
			Name of Employ : 
			<input type="text" name="name"/> <br/><br/> 
			Department : 
			<input type="text" name="dept"/> <br/><br/> 
			Designation : 
			<input type="text" name="desig"/> <br/><br/> 
			Basic : 
			<input type="text" name="basic"/> <br/><br/> 
			<input type="submit" value="Insert"/> 
		</center>
	</form>
</body>
</html>