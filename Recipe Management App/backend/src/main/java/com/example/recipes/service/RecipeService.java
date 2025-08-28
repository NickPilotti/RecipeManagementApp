
package com.example.recipes.service;

import com.example.recipes.model.Recipe;
import com.example.recipes.repository.RecipeRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.*;

@ApplicationScoped
public class RecipeService {

    @Inject
    RecipeRepository repo; // implementation assumed due to time constraints

    public List<Recipe> searchRecipe(String query, int limit, int offset, Long restaurantId) {
        return repo.search(query, limit, offset, restaurantId);
    }

    public Optional<Recipe> findRecipe(Long id, Long restaurantId) {
        return repo.findByIdScoped(id, restaurantId);
    }

    public Recipe createRecipe(Recipe recipe, Long restaurantId) {
        recipe.restaurantId = restaurantId;
        return repo.save(recipe);
    }

    public Recipe updateRecipe(Long id, Recipe updates, Long restaurantId) {
        updates.id = id;
        updates.restaurantId = restaurantId;
        return repo.update(id, updates, restaurantId);
    }

    public void deleteRecipe(Long id, Long restaurantId) {
        repo.delete(id, restaurantId);
    }
}
