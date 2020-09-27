package com.dxc.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldService {
	@GET
	public String sayHello() {
		String result = "Hello World by Hema";
		return result;

	}

}
