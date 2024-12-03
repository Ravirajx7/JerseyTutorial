package org.example;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class Main   {
    public static void main(String[] args) {
        URI baseUri = URI.create("http://localhost:8080/api/");
        ResourceConfig config = new ResourceConfig().packages("org.example");

        // Start Grizzly HTTP server
        GrizzlyHttpServerFactory.createHttpServer(baseUri, config);
        System.out.println("Server started at: " + baseUri);
    }
}
