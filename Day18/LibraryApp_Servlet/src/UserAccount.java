

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserAccount extends HttpServlet {
private static final long serialVersionUID = 1L;
public UserAccount()
{
    super();      
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	PrintWriter out = response.getWriter();
	ServletContext sct = getServletContext();
	String username = (String) sct.getAttribute("Username");
	out.write("Welcome "+username+"");
	RequestDispatcher rd = sct.getRequestDispatcher("/UserAccount.html");
	rd.include(request, response);	
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	doGet(request,response);
}
}
