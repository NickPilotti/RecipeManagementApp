
package com.example.recipes.api;

import com.example.recipes.model.Recipe;
import com.example.recipes.service.RecipeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

/**
 * Recipe REST endpoints (skeleton). JSON in/out.
 * Multi-tenant: pass X-Restaurant-Id header to scope, if desired.
 */
@Path("/recipes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RecipeResource {

    @Inject
    RecipeService recipeService; 

    @GET
    public List<Recipe> list(@QueryParam("query") String query,
                             @QueryParam("limit") @DefaultValue("20") int limit,
                             @QueryParam("offset") @DefaultValue("0") int offset,
                             @HeaderParam("X-Restaurant-Id") Long restaurantId) {
        return recipeService.search(query, limit, offset, restaurantId);
    }

    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") Long id, @HeaderParam("X-Restaurant-Id") Long restaurantId) {
        Optional<Recipe> r = recipeService.findByIdScoped(id, restaurantId);
        return r.<Response>map(Response::ok)
                .orElseGet(() -> Response.status(Response.Status.NOT_FOUND))
                .build();
    }

    @POST
    public Response create(Recipe recipe, @HeaderParam("X-Restaurant-Id") Long restaurantId) {
        Recipe created = recipeService.create(recipe, restaurantId);
        return Response.status(Response.Status.CREATED).entity(created).build();
    }

    @PUT
    @Path("/{id}")
    public Recipe update(@PathParam("id") Long id, Recipe recipe, @HeaderParam("X-Restaurant-Id") Long restaurantId) {
        return recipeService.update(id, recipe, restaurantId);
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id, @HeaderParam("X-Restaurant-Id") Long restaurantId) {
        recipeService.delete(id, restaurantId);
        return Response.noContent().build();
    }
}
