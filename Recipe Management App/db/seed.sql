INSERT INTO Restaurant (name) VALUES ('Northwind Kitchen'), ('Contoso Bistro');

INSERT INTO `User` (email, display_name, restaurant_id) VALUES
('chef.ana@northwind.example', 'Chef Ana', 1),
('chef.liu@contoso.example', 'Chef Liu', 2);

INSERT INTO Ingredient (name) VALUES ('Flour'), ('Sugar'), ('Salt'), ('Eggs'), ('Butter'), ('Milk');

INSERT INTO Recipe (restaurant_id, title, yield_amount, yield_unit, instructions) VALUES
(1, 'Pancakes', 12, 'pieces', '1. Mix dry. 2. Add wet. 3. Cook on griddle.'),
(2, 'Scrambled Eggs', 4, 'servings', '1. Beat eggs. 2. Cook slowly. 3. Season.');

INSERT INTO RecipeIngredient (recipe_id, ingredient_id, quantity, unit) VALUES
(1, 1, 2.0, 'cups'),   -- Flour
(1, 6, 1.5, 'cups'),   -- Milk
(1, 4, 2.0, 'units'),  -- Eggs
(1, 3, 0.5, 'tsp'),    -- Salt
(2, 4, 8.0, 'units'),  -- Eggs
(2, 5, 1.0, 'tbsp');   -- Butter
