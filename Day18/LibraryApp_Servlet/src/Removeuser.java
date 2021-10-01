

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Removeuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Removeuser() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		ServletContext sct = getServletContext();
		String susername = (String) sct.getAttribute("SelectedUser");		
		RequestDispatcher rd1 = sct.getRequestDispatcher("/AdminAccount");
		rd1.include(request, response);
		
		if(susername.length()==0)
		{
			out.write("<br/> Select user to remove !....");
		}
		else
		{
		out.write("<html><head><meta http-equiv='Content-Type'" +
		" content='text/html; charset=ISO-8859-1'></head><body>" + 
		"<br/><input type='radio' name='removeuser'"
		+ "onclick="+"window.location='Removeusernext'>Remove selected user.<br/>"
		+ "<br/><input type='radio' name='removeuser'"
		+ "onclick="+"window.location='Selectuser'>Select another user.<br/>"
		+ "</body></html>");		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
