package com.resttutorial.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/sayHello")
public interface HelloWorldClass {

	@GET
	@Produces("application/json")
	public Response sayHello();
}
