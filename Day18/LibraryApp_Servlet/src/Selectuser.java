

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Selectuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Selectuser() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		ServletContext sct = getServletContext();
		RequestDispatcher rd1 = sct.getRequestDispatcher("/AdminAccount");
		rd1.include(request, response);		
		
		try
		{
			Connection cp = ConnectionHelper.getConnection();
			String sql1 = "SELECT Username FROM LibUsers WHERE Type = 'U'";
			Statement s1 = cp.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs1 = s1.executeQuery(sql1);
			if(rs1.next())
			{	
				rs1.previous();				
				out.write("<html><head><meta http-equiv='Content-Type'" +
				" content='text/html; charset=ISO-8859-1'></head>"+
				"<body><form action='Showselecteduser'><table>");
				
				String x = (String)sct.getAttribute("SelectedUser");
				if(x.length()!=0)
				{
					out.write("<tr><td><input type='radio' name='suser' value=''" + " onclick=submit(this) " +
							" <br/></td><td><br/><br><h3>Unselect user</h3><br/></td></tr>");
				}
				
				out.write("<tr><td>Select</td><td>Name</td></tr>");					
				while(rs1.next()) 
				{											
					String name = rs1.getString("Username");								
					out.write("<tr><td><input type='radio' name='suser' value="+name
					+" onclick=submit(this)></td><td>"+name+"</td></tr>");					
				}				
				out.write("</table></form></body></html>");			
			}		
			else
			{
				out.write("<br/><br/>There is no user !.....");
			}		
		}
		catch(Exception e)
		{e.printStackTrace();}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
