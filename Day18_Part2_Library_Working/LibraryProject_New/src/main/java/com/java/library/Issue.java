package com.java.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Issue
 */
public class Issue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Issue() {
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
		HttpSession session = request.getSession(true);
		String username = (String) sct.getAttribute("Username");
		RequestDispatcher rd1 = sct.getRequestDispatcher("/UserAccount");
		rd1.include(request, response);
				
		if(request.getParameterValues("bookid") != null)
		{			
			
			
			String str[] = request.getParameterValues("bookid");
			try
			{
				Connection cp = ConnectionHelper.getConnection();
				for(String s : str)
				{
				String sql = "SELECT Username FROM TranBook WHERE BookId = ? ";
				PreparedStatement ps = cp.prepareStatement(sql);
				ps.setString(1,s);
				ResultSet rs =ps.executeQuery();
				String uname = null;
				if(rs.next()) uname = rs.getString("Username");
				
				if(username.equals(uname))
				{
					out.write("<br/><br/>You have already issued the book with Id ("+s+")");
				}
				else
				{
				String sql1 = "INSERT INTO tranbook(userName,BookId,FromDate) VALUES(?,?,?)" ;
				PreparedStatement ps1 = cp.prepareStatement(sql1);
				ps1.setString(1,username);
				ps1.setString(2,s);
				ps1.setDate(3,new Date(session.getLastAccessedTime()));
				ps1.executeUpdate();
				
				String sql2 = "SELECT TotalBooks FROM Books WHERE Id = ?";
				PreparedStatement ps2 = cp.prepareStatement(sql2);
				ps2.setString(1,s);
				ResultSet rs2 =ps2.executeQuery();
				rs2.next();
				String btotal = rs2.getString("TotalBooks");
				int bt = Integer.parseInt(btotal);
				bt = bt-1;
				
				String sql3 = "UPDATE Books SET TotalBooks = ? WHERE Id = ?" ;
				PreparedStatement ps3 = cp.prepareStatement(sql3);
				ps3.setInt(1,bt);
				ps3.setString(2,s);
				ps3.executeUpdate();
				
				out.write("<br/><br/>The book with Id ("+s+") is issued !...");	
				}
				}
			}
			catch(Exception e)
			{e.printStackTrace();}			
		}
		else
		{
			out.write("<br/><br/>Please select book to issue ....... ");			
		}		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
