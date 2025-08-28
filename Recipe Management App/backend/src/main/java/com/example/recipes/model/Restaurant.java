
package com.example.recipes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Restaurant")
public class Restaurant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String name;
}
