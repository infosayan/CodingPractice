package com.javatpoint.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/product")
public class ProductService{
 	/*@POST
 	@Path("/add")
 	@Produces({"application/json", "xml"})
	public Response addUser(
		@FormParam("id") int id,
		@FormParam("name") String name,
		@FormParam("price") float price) {
 
		return Response.status(200)
			.entity(" Product added successfuly!<br> Id: "+id+"<br> Name: " + name+"<br> Price: "+price)
			.build();
 	}*/
 	@GET
 	@Path("/getProduct")
 	@Consumes({"application/json"})
	public void addUser(
		@QueryParam(value="id") int id,
		@QueryParam(value="name") String name) {
 		System.out.println("id ="+id+" name ="+name);
 		}
}