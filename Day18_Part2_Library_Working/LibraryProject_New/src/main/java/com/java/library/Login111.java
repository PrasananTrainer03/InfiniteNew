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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login111
 */
public class Login111 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login111() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		String username1 = null, password1 = null;		
		ServletContext sct = getServletContext();
		try
		{
			Connection cp = ConnectionHelper.getConnection();
			String sql = " SELECT Username,Password FROM LibUsers " +
					" WHERE Username = ? AND Password = ?"; 			
			PreparedStatement ps = cp.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();	
			while(rs.next())
			{
				username1 = rs.getString("Username");
				password1 = rs.getString("Password");
			}	
		}catch(SQLException se)
		{se.printStackTrace();}
		catch(Exception e)
		{e.printStackTrace();}
		
		if(username.equals(username1)&& password.equals(password1))
		{
			HttpSession session = request.getSession(true);
			String sessionid = session.getId();
			
			sct.setAttribute("Sessionid",sessionid);		
			
				sct.setAttribute("Username", username1);			
				RequestDispatcher rd = sct.getRequestDispatcher("/UserAccount");
				rd.forward(request, response);
		}
		else
		{	
			out.write("sorry!.....Username or Password is Incorrect.<br/>");
			out.write("Again Insert the username and password.");
			RequestDispatcher rd=sct.getRequestDispatcher("/index.html");
			rd.include(request, response);			
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
