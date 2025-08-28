
package com.example.recipes.service;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * Given small scale (<=10k req/day), an in-memory cache would suffice.
 */
@ApplicationScoped
public class SearchService {
    // future: in-memory cache keyed by (restaurantId, query)
}
