package com.JerseyProjet.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class UserServices {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
	public String sayPlainTextHello() {
		return "Hello Jersey";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{eventId}/{productId}/{status}")
	public String getData(@PathParam("eventId") Long eventId, @PathParam("productId") Long productId,
			@PathParam("status") String status, @QueryParam("myparam1") String value1) {
		return "{'uuid':" + eventId + ",'productId':" + productId + ",'status':'" + status + ",'myparam1':'" + value1
				+ "'}";
	}

}
