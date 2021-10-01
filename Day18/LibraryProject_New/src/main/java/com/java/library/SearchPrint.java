package com.java.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
 * Servlet implementation class SearchPrint
 */
public class SearchPrint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPrint() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sct = getServletContext();
		RequestDispatcher rd1 = sct.getRequestDispatcher("/UserAccount");
		rd1.include(request, response);
		PrintWriter out = response.getWriter();
		String searchtype = request.getParameter("searchtype");		
		String searchvalue = request.getParameter("searchvalue");
		
		String sql = null;		
		try
		{
			Connection cp = ConnectionHelper.getConnection();
			if(searchtype.equals("id")) sql = " SELECT * FROM Books WHERE Id = ? " ;
			else if(searchtype.equals("bookname")) sql = " SELECT * FROM Books WHERE Name = ? " ;
			else if(searchtype.equals("authorname")) sql = " SELECT * FROM Books WHERE Author = ? " ;
			else if(searchtype.equals("dept")) sql = " SELECT * FROM Books WHERE Dept = ? " ;
			else sql = " SELECT * FROM Books WHERE Name != ? OR 1 = 1 " ;
			PreparedStatement ps = cp.prepareStatement(sql,
					ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ps.setString(1,searchvalue);						
			ResultSet rs = ps.executeQuery();		
												
			if(rs.next())
			{
				out.write("<br/>Select books to issue : <br/>");
				rs.previous();				
			out.write("<html><head><meta http-equiv='Content-Type'" +
			" content='text/html; charset=ISO-8859-1'></head>"+
			"<body><form action='Issue'><table><tr>"+
			"<td>Id</td><td>Name</td><td>Author</td><td>Edition</td>" +
			"<td>Dept</td><td>TotalBooks</td><td>Select</td></tr>");			
			
			while(rs.next()) 
			{					
				int bid = rs.getInt("Id");						
				String bname = rs.getString("Name");
				String bauthor = rs.getString("Author");
				String bedition = rs.getString("Edition");
				String bdept = rs.getString("Dept");	
			//	String bprice = rs.getString("Price");
				String btotal = rs.getString("TotalBooks");	
				
				out.write("<td>"+bid+"</td><td>"+bname+"</td><td>"+bauthor+"</td>" +
				"<td>"+bedition+"</td><td>"+bdept+"</td><td>"+btotal+"</td>");
				
				if(Integer.parseInt(btotal) > 0)
					out.write("<td><input type='checkbox' name='bookid' value="+bid+"></td></tr>");		
				else
					out.write("<td><input type='checkbox' name='bookid' disabled='true' value="+bid+"></td></tr>");
					
			}	
			out.write("</table><br/><input type='submit' value='Issue Books' ></form></body></html>");			
			}	
							
			else 
			{
				out.write("<html><head><meta http-equiv='Content-Type'" +
			" content='text/html; charset=ISO-8859-1'></head>" +
			"<body><form action='Search'>" +
			"Sorry !... <br/> No book found for the Search Criteria<br/><br/>" +
			"<input type='submit' value='Return'></form></body></html>");
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
