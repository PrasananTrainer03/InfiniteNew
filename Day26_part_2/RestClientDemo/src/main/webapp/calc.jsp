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
		int a,b;
		a=Integer.parseInt(request.getParameter("firstNo"));
		b=Integer.parseInt(request.getParameter("secondNo"));
		URL url = new URL("http://localhost:8080/RestService/webapi/calc/sum/" +a+"/"+b);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    conn.setRequestMethod("GET");
	    conn.setRequestProperty("Accept", "text/plain");
	    
	    if (conn.getResponseCode() != 200) {
	        throw new RuntimeException("Failed : HTTP error code : "
	              + conn.getResponseCode());
	    }
        BufferedReader br = new BufferedReader(new InputStreamReader(
	            (conn.getInputStream())));

	        String output;
	        out.println("Sum  ");
	        while ((output = br.readLine()) != null) {
	            out.println(output);
	        }

	        url = new URL("http://localhost:8080/RestService/webapi/calc/sub/" +a+"/"+b);
			conn = (HttpURLConnection) url.openConnection();
		    conn.setRequestMethod("GET");
		    conn.setRequestProperty("Accept", "text/plain");
		    
		    if (conn.getResponseCode() != 200) {
		        throw new RuntimeException("Failed : HTTP error code : "
		              + conn.getResponseCode());
		    }
	        br = new BufferedReader(new InputStreamReader(
		            (conn.getInputStream())));

		        out.println("<br/><br/>Sub  ");
		        while ((output = br.readLine()) != null) {
		            out.println(output);
		        }

		        url = new URL("http://localhost:8080/RestService/webapi/calc/mult/" +a+"/"+b);
				conn = (HttpURLConnection) url.openConnection();
			    conn.setRequestMethod("GET");
			    conn.setRequestProperty("Accept", "text/plain");
			    
			    if (conn.getResponseCode() != 200) {
			        throw new RuntimeException("Failed : HTTP error code : "
			              + conn.getResponseCode());
			    }
		        br = new BufferedReader(new InputStreamReader(
			            (conn.getInputStream())));

			        out.println("<br/><br/>Mult  ");
			        while ((output = br.readLine()) != null) {
			            out.println(output);
			        }

	        
%>

</body>
</html>