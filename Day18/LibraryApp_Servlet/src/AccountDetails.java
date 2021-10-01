

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

public class AccountDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AccountDetails() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		ServletContext sct = getServletContext();		
		RequestDispatcher rd1 = sct.getRequestDispatcher("/UserAccount");
		rd1.include(request, response);		
		String username = (String)sct.getAttribute("Username");
		
		out.write("<pre><br/><br/><h4>Username : "+username+"<br/><br/>Type     : user</h4></pre>");
		out.write("Currently issued books :<br/><br/>");
		
		try
		{
			Connection cp = ConnectionHelper.getConnection();
			String sql = " SELECT * FROM Trans WHERE Username = ? ;"; 			
			PreparedStatement ps = cp.prepareStatement(sql,
			ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ps.setString(1,username);			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				rs.previous();
				out.write("<html><head><meta http-equiv='Content-Type'" +
				" content='text/html; charset=ISO-8859-1'></head>"+
				"<body><table><tr><td>BookId</td><td>Fromdate</td></tr>");				
				while(rs.next()) 
				{					
					int bookid = rs.getInt("BookId");	
					Date fromdate = rs.getDate("Fromdate");								
					out.write("<td>"+bookid+"</td><td>"+fromdate+"</td></tr>");		
				}			
				out.write("</table></body></html>");			
			}
			else
			{
				out.write("-------------------------");
			}
			
		}catch(SQLException se)
		{se.printStackTrace();}
		catch(Exception e)
		{e.printStackTrace();}
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
