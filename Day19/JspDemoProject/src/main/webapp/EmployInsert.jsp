<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinitepractice",
		"root","root");
	String cmd = "insert into Employ(empno,name,gender,dept,desig,basic) values(?,?,?,?,?,?)";
	PreparedStatement pst = con.prepareStatement(cmd);
	pst.setInt(1, Integer.parseInt(request.getParameter("empno")));
	pst.setString(2, request.getParameter("name"));
	pst.setString(3, request.getParameter("gender"));
	pst.setString(4, request.getParameter("dept"));
	pst.setString(5,request.getParameter("desig"));
	pst.setInt(6,Integer.parseInt(request.getParameter("basic")));
	pst.executeUpdate();
	out.println("*** Record Inserted ***");
%>
</body>
</html>