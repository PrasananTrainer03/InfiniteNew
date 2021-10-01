package com.java.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c1 =new Cookie("Gowtham", "87");
		response.addCookie(c1);
		c1.setMaxAge(24*1000*60*60);
		
		Cookie c2 = new Cookie("Harshit", "90");
		response.addCookie(c2);
		c2.setMaxAge(24*1000*60*60);
		
		Cookie c3 = new Cookie("Chandana", "91");
		response.addCookie(c3);
		c3.setMaxAge(24*1000*60*60);
		
		PrintWriter out = response.getWriter();
		out.println("*** Cookies Created Successfully ***");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
