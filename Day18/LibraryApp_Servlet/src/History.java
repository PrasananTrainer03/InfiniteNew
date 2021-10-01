

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class History extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public History() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		PrintWriter out = response.getWriter();
		ServletContext sct = getServletContext();
		String username = (String) sct.getAttribute("Username");
		RequestDispatcher rd1 = sct.getRequestDispatcher("/UserAccount");
		rd1.include(request, response);
				
		try
		{
			Connection cp = ConnectionHelper.getConnection();		
			String sql = " SELECT * FROM TransReturn WHERE Username = ? " ;			
			PreparedStatement ps = cp.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ps.setString(1,username);						
			ResultSet rs = ps.executeQuery();
			int i = 0;
												
			if(rs.next())
			{
				rs.previous();
				out.write("<br/>History : <br/>");
				out.write("<html><head><meta http-equiv='Content-Type'" +
				" content='text/html; charset=ISO-8859-1'></head>"+
				"<body><table><tr><td>BookId</td><td>Fromdate</td><td>Todate</td></tr>");			
				while(rs.next()) 
				{					
					int bookid = rs.getInt("BookId");	
					Date fromdate = rs.getDate("Fromdate");
					Date todate = rs.getDate("Todate");								
					out.write("<td>"+bookid+"</td><td>"+fromdate+"</td><td>"+todate+"</td></tr>");		
					i++;
				}				
				out.write("</table></form></body></html>");			
			}								
			if(i == 0)
			{
				out.write("<br/>-------------------------------------------");
			}				
		}
		catch(SQLException se)
		{se.printStackTrace();}
		catch(Exception e)
		{e.printStackTrace();}				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
