
package com.example.recipes.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Recipe")
public class Recipe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public Long restaurantId;

    @Column(nullable = false, length = 255)
    public String title;

    public Double yieldAmount;
    public String yieldUnit;

    @Lob
    public String instructions;

    public Instant createdAt;
    public Instant updatedAt;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<RecipeIngredient> ingredients = new ArrayList<>();
}
