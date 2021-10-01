package com.java.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Return
 */
public class Return extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Return() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext sct = getServletContext();
		String username = (String) sct.getAttribute("Username");
		RequestDispatcher rd1 = sct.getRequestDispatcher("/UserAccount");
		rd1.include(request, response);
				
		String sql = null;		
		try
		{
			Connection cp = ConnectionHelper.getConnection();	
			sql = " SELECT * FROM TranBook WHERE Username = ? " ;			
			PreparedStatement ps = cp.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ps.setString(1,username);						
			ResultSet rs = ps.executeQuery();
			int i = 0;
												
			if(rs.next())
			{
				out.write("<br/><br/>Select which book you want to return :");
				rs.previous();				
				out.write("<html><head><meta http-equiv='Content-Type'" +
				" content='text/html; charset=ISO-8859-1'></head>"+
				"<body><form action='ReturnNext'><table><tr>"+
				"<td>BookId</td><td>Fromdate</td><td>Select</td></tr>");			
			
			while(rs.next()) 
			{					
				int bookid = rs.getInt("BookId");	
				Date fromdate = rs.getDate("Fromdate");
								
				out.write("<td>"+bookid+"</td><td>"+fromdate+"</td>" +
				"<td><input type='checkbox' name='bookid' value="+bookid+"></td></tr>");		
				i++;
			}	
			
			out.write("</table><br/><input type='submit' value='Return Books' ></form></body></html>");			
			}	
							
			if(i == 0)
			{
				out.write("<br/><br/>No more book is available to return .");
			}	
			
		}
		catch(SQLException se)
		{se.printStackTrace();}
		catch(Exception e)
		{e.printStackTrace();}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
