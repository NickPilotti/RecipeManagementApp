
# Recipe Management System
Recipe Management System Application with:
- **Frontend:** Angular
- **Backend:** Java with **RESTEasy (JAX‑RS)** for API endpoints
- **Database:** MySQL 
- **Docs:** README

---

## Product Requirements 
- Track recipes (ingredients, instructions, yield)
- Search recipes
- Kitchen‑friendly display (large fonts, step‑by‑step)
- Edit/remove recipes

## Architectural Boundaries
- Throughput: **≤ 10k requests/day** (small scale; single node acceptable)
- Data size: **≤ 1k recipes** (fits easily in a single MySQL instance)
- Users: **dozens of users** across different restaurants (multi‑restaurant ready via `restaurant_id` column)

---

## High-Level App Layout
```
.
├── README.md
├── .gitignore
├── db
│   ├── schema.sql
│   └── seed.sql
├── backend
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com/example/recipes
│       │   │       ├── config/AppConfig.java
│       │   │       ├── api/RecipeResource.java
│       │   │       ├── api/HealthResource.java
│       │   │       ├── model/{Recipe, Ingredient, RecipeIngredient, User, Restaurant}.java
│       │   │       ├── repository/{RecipeRepository, IngredientRepository}.java
│       │   │       └── service/{RecipeService, SearchService}.java
│       │   └── resources/application.properties
└── frontend
    ├── package.json
    └── src
        ├── index.html
        ├── styles.css
        └── app
            ├── app.module.ts
            ├── app-routing.module.ts
            ├── models/{recipe.ts, ingredient.ts, user.ts}
            ├── services/{api.service.ts, recipe.service.ts}
            └── components
                ├── recipe-list/{recipe-list.component.ts, .html}
                ├── recipe-detail/{recipe-detail.component.ts, .html}
                ├── recipe-editor/{recipe-editor.component.ts, .html}
                └── kitchen-mode/{kitchen-mode.component.ts, .html}
```

---

## Domain Model (ERD)
```
Restaurant( id PK, name )
User( id PK, email, display_name, restaurant_id FK -> Restaurant.id )
Recipe( id PK, restaurant_id FK -> Restaurant.id, title, yield_amount, yield_unit, instructions TEXT, created_at, updated_at )
Ingredient( id PK, name )
RecipeIngredient( recipe_id FK -> Recipe.id, ingredient_id FK -> Ingredient.id, quantity, unit )
```

---

## API (RESTEasy)
- `GET /api/v1/health` → basic liveness
- `GET /api/v1/recipes?query=&limit=&offset=` → list/search
- `GET /api/v1/recipes/{id}` → fetch one
- `POST /api/v1/recipes` → create
- `PUT /api/v1/recipes/{id}` → update
- `DELETE /api/v1/recipes/{id}` → remove

---

## Frontend UX Flows (Angular)
- **Recipe List**: searchable table/cards, pagination
- **Recipe Detail**: ingredients + step‑by‑step instructions
- **Kitchen Mode**: large‑type, distraction‑free, one step per screen
- **Recipe Editor**: create/update recipe with dynamic ingredients list

---

## Scaling & Reliability Notes
- Single MySQL instance is sufficientfor indexing and simple read‑through caching in `SearchService` if needed.
- Given ≤10k req/day, a single backend instance is acceptable. Horizontal scaling possible later behind a load balancer.
- Angular modularity allows for scalable maintainable solution for new restaurants and recipe additions.

---
