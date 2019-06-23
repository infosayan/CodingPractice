package com.mockito;

import java.net.URI;

import javax.ws.rs.core.MediaType;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class MockitoTest {

	public void client() {
		Client client = Client.create();
		client.setFollowRedirects(true);
		WebResource resource = client.resource("");
		ClientResponse response = resource.header("Authorization", "Basicuserpassword")
				.accept(MediaType.APPLICATION_JSON)
				.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, "jsonbody");
	System.out.println(response.getStatus());
	
	}
	
	@Test
	public void shouldIndicateInstanceIsSlave() {
	    Client client = mock( Client.class );
	    WebResource webResource = mock( WebResource.class );
	    WebResource.Builder builder = mock( WebResource.Builder.class );

	    ClientResponse clientResponse = mock( ClientResponse.class );
	    when( builder.get( ClientResponse.class ) ).thenReturn( clientResponse );
	    when( clientResponse.getEntity( String.class ) ).thenReturn( "true" );
	    when( webResource.accept( anyString() ) ).thenReturn( builder );
	    when( client.resource( anyString() ) ).thenReturn( webResource );

	    Boolean isSlave = new Neo4jInstance(client, URI.create("http://localhost")).isSlave();

	    //assertTrue(isSlave);
	}
}
