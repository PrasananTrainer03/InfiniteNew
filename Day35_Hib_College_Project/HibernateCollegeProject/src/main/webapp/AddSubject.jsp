<%@page import="com.java.hib.CollegeCrud"%>
<%@page import="com.java.hib.Subjects"%>
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
	Subjects subject = new Subjects();
	subject.setSubjectId(Integer.parseInt(request.getParameter("subjectId")));
	subject.setYear(Integer.parseInt(request.getParameter("year")));
	subject.setInstructor(request.getParameter("instructor"));
	subject.setSubject(request.getParameter("subject"));
	subject.setTheory(Integer.parseInt(request.getParameter("theory")));
	subject.setPractical(Integer.parseInt(request.getParameter("practical")));
	CollegeCrud obj = new CollegeCrud();
	out.println(obj.addSubject(subject));
%>
</body>
</html>