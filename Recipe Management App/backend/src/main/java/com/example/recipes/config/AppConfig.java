
package com.example.recipes.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * JAX-RS bootstrap (RESTEasy). Registers under /api/v1.
 * Actual resource classes are discovered by scanning.
 */
@ApplicationPath("/api/v1")
public class AppConfig extends Application {
    // empty, container scans for @Path resources.
}
