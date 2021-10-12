<%@page import="com.java.rest.client.Gender"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.sun.jersey.api.client.ClientResponse"%>
<%@page import="com.sun.jersey.api.client.WebResource"%>
<%@page import="com.sun.jersey.api.client.Client"%>
<%@page import="com.java.rest.client.Employ"%>
<%@page import="javax.ws.rs.client.Invocation"%>
<%@page import="javax.ws.rs.client.Entity"%>
<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.Response"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@page import="javax.ws.rs.client.ClientBuilder"%>
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
	Employ employ = new Employ();
	employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
	employ.setName(request.getParameter("name"));
	employ.setGender(Gender.valueOf(request.getParameter("gender")));
	employ.setDept(request.getParameter("dept"));
	employ.setDesig(request.getParameter("desig"));
	employ.setBasic(Integer.parseInt(request.getParameter("basic")));
	 Client client = Client.create();

     WebResource webResource = client
        .resource("http://localhost:8080/RestEmployDemo/webapi/employ/addEmploy");
	//new Gson().toJson(employ);
  //   out.println(new Gson().toJson(employ));    
  // '{"empno":"18","name":"JOEL Varghese","gender":"MALE","dept":"Java","desig":"Programmer","basic":"48234"}' 
  	Gson obj = new Gson();  
  String input = obj.toJson(employ);
  // String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";

     ClientResponse res = webResource.type("application/json")
        .post(ClientResponse.class, input);

     if (response.getStatus() != 200) {
         throw new RuntimeException("Failed : HTTP error code : "
              + res.getStatus());
     } 

   //  out.println("Output from Server .... \n");
  
     String output = res.getEntity(String.class);
     out.println(output); 
%>
</body>
</html>