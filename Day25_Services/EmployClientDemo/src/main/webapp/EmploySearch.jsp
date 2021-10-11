<%@page import="infinite.EmployServiceDemo.Employ"%>
<%@page import="infinite.EmployServiceDemo.EmployService"%>
<%@page import="infinite.EmployServiceDemo.EmployServiceServiceLocator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="EmploySearch.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> 
			<br/><br/>
			<input type="submit" value="Search" />
		</center>
	</form>
	<%
		if (request.getParameter("empno") != null) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmployServiceServiceLocator loc = new EmployServiceServiceLocator();
			EmployService proxy = loc.getEmployService();
			Employ employ = proxy.searchEmploy(empno);
			if (employ !=null) {
				out.println("Name  " +employ.getName());
			} else {
				out.println("Record Not Found...");
			}
		}
	%>
</body>
</html>