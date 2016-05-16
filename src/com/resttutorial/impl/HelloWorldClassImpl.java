package com.resttutorial.impl;

import javax.ws.rs.core.Response;

import org.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.resttutorial.api.HelloWorldClass;

@Component
@Scope("request")
public class HelloWorldClassImpl implements HelloWorldClass {

	@Override
	public Response sayHello() {
		JSONObject helloJSON = new JSONObject("{name:'vipin'}");
		String result = "The result is " + helloJSON;
		return Response.status(200).entity(result).build();
	}

}
