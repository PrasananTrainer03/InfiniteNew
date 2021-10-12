<%@page import="java.io.InputStream"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
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
		URL url = new URL("http://localhost:8080/RestService/webapi/helloservice/company");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    conn.setRequestMethod("GET");
	    conn.setRequestProperty("Accept", "text/plain");
	    
	    if (conn.getResponseCode() != 200) {
	        throw new RuntimeException("Failed : HTTP error code : "
	              + conn.getResponseCode());
	    }
	    InputStream in = url.openStream();
	    Scanner scan = new Scanner(in);
	     
	   // int line = 1;
	    while (scan.hasNext())
	    {
	        String str = scan.nextLine();
	        out.println( str);
	    }
	    scan.close();
%>
</body>
</html>