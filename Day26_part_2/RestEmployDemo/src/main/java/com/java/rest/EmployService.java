package com.java.rest;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employ")
public class EmployService {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addEmploy")
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		return new EmployDAO().addEmploy(employ);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employ[] showEmploy() throws ClassNotFoundException, SQLException {
		EmployDAO dao = new EmployDAO();
		return dao.showEmploy();
	}
	
	@GET
	@Path("{empno}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ showEmploy(@PathParam("empno") int empno) throws ClassNotFoundException, SQLException {
		EmployDAO dao = new EmployDAO();
		return dao.searchEmploy(empno);
	}
}
