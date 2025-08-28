
package com.example.recipes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Ingredient")
public class Ingredient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, unique = true, length = 255)
    public String name;
}
