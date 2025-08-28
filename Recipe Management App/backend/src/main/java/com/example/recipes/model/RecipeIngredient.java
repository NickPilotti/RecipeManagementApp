
package com.example.recipes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "RecipeIngredient")
@IdClass(RecipeIngredientKey.class)
public class RecipeIngredient {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id")
    public Recipe recipe;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ingredient_id")
    public Ingredient ingredient;

    public Double quantity;
    public String unit;
}
