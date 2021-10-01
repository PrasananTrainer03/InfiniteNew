

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Showselecteduser extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Showselecteduser() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		ServletContext sct = getServletContext();		
		String susername = request.getParameter("suser");
		sct.setAttribute("SelectedUser",susername);
		RequestDispatcher rd1 = sct.getRequestDispatcher("/AdminAccount");
		rd1.include(request, response);
		
		if(susername.length()==0) 
		{
			out.write("<br/>Current user unselected !....");				
		}
		else
		{					
			out.write("<br/>Selected User : "+susername);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
