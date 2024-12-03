package org.example;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello") // Resource path
public class HelloWorldResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN) // Response MIME type
    public String sayHello() {
        return "Hello, World!";
    }
}
