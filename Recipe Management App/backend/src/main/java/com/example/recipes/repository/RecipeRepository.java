
package com.example.recipes.repository;

import com.example.recipes.model.Recipe;
import java.util.*;

public interface RecipeRepository {
    List<Recipe> searchRecipe(String query, int limit, int offset, Long restaurantId);
    Optional<Recipe> findRecipe(Long id, Long restaurantId);
    Recipe saveRecipe(Recipe recipe);
    Recipe updateRecipe(Long id, Recipe recipe, Long restaurantId);
    void deleteRecipe(Long id, Long restaurantId);
}
