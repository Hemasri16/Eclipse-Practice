package com.dxc.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloService {
	@GET
	public String sayHello() {
		String hello = "Hello World !!!";
		return hello;

	}

}
