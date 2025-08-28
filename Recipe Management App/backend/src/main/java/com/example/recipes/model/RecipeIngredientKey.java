
package com.example.recipes.model;

import java.io.Serializable;
import java.util.Objects;

public class RecipeIngredientKey implements Serializable {
    public Long recipe;
    public Long ingredient;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredientKey that = (RecipeIngredientKey) o;
        return Objects.equals(recipe, that.recipe) &&
               Objects.equals(ingredient, that.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipe, ingredient);
    }
}
