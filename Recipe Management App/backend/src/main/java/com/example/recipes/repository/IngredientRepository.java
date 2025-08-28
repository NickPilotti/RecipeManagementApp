
package com.example.recipes.repository;

import com.example.recipes.model.Ingredient;
import java.util.*;

public interface IngredientRepository {
    Optional<Ingredient> findIngredientByName(String name);
    List<Ingredient> searchIngredient(String query, int limit);
}
