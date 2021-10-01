

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminAccount extends HttpServlet {
private static final long serialVersionUID = 1L;

public AdminAccount() 
{
    super();      
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	PrintWriter out = response.getWriter();
	ServletContext sct = getServletContext();
	String adminname = (String) sct.getAttribute("Adminname");
	String selecteduser = (String) sct.getAttribute("SelectedUser");
	out.write("<pre>Welcome "+adminname+" (Admin)");
	if(selecteduser.length()!=0)
	{
		out.write("              Selected user : "+selecteduser);
	}	
	out.write("</pre>");
	RequestDispatcher rd = sct.getRequestDispatcher("/AdminAccount.html");
	rd.include(request, response);	
	
	String removeuser = (String)sct.getAttribute("Removeuser");
	if(removeuser.equals("1"))
	{
		out.write("<br/>The selected user is removed !...");
		sct.setAttribute("Removeuser","0");
	}
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	doGet(request,response);
}

}
