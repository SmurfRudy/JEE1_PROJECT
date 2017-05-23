package com.petitjaxrs.services;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserServices {
	
	DAO dao = new DAO();
	
	@Context
	ServletContext context;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/hi")
	public String sayPlainTextHello() {
		return "Hello Jersey";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{eventId}/{productId}/{status}")
	public String getData(@PathParam("eventId") Long eventId, @PathParam("productId") Long productId,
			@PathParam("status") String status, @QueryParam("myparam1") String value1) {
		return "{'uuid':" + eventId + ",'productId':" + productId + ",'status':'" + status + ", ‘myparam1':'" + value1
				+ "'}";
		
	}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/list")
	public String getUsers() {
		DAO dao = getDao();
		return dao.getAllUsers().toString();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{login}")
	public String getUser(@PathParam("login") String login) {
		DAO dao = getDao();
		return dao.getUser(login).toString();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{login}")
	public String addUser(User user, @PathParam("login") String login){
		DAO dao = getDao();
		dao.addUser(user);
		return "User ajouté";
	}
	
	
	public DAO getDao(){
		if(context.getAttribute("DAO") != null){
			this.dao = (DAO)context.getAttribute("DAO");
		}else{
			context.setAttribute("DAO", this.dao);
		}
		return this.dao;
	}
	

}
