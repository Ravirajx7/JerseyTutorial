package org.example;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api") // Base URI for all resources
public class RestConfig extends ResourceConfig {
    public RestConfig() {
        // Register resource classes
        packages("org.example");
    }
}
