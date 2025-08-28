
package com.example.recipes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "`User`")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, unique = true)
    public String email;

    @Column(nullable = false)
    public String displayName;

    @Column(nullable = false)
    public Long restaurantId;
}
