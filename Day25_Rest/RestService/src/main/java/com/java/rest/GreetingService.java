package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("greeting")
public class GreetingService {

	
	@GET
	@Path("/info/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String greetMe(@PathParam("name") String name) {
		return "Good Morning " +name;
	}
	
}
