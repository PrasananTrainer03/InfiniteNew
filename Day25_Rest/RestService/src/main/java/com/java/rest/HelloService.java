package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloservice")
public class HelloService {

	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Welcome to Rest Srevices...";
	}

	@GET
	@Path("/company")
	@Produces(MediaType.TEXT_PLAIN)
	public String company() {
		return "Its Infinite...";
	}
	
	@GET
	@Path("/trainer")
	@Produces(MediaType.TEXT_PLAIN)
	public String trainer() {
		return "Prasanna Trainer...";
	}
}
