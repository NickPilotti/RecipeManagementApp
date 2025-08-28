-- MySQL schema for Recipe Management System
CREATE TABLE Restaurant (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE `User` (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  email VARCHAR(255) NOT NULL UNIQUE,
  display_name VARCHAR(255) NOT NULL,
  restaurant_id BIGINT NOT NULL,
  FOREIGN KEY (restaurant_id) REFERENCES Restaurant(id)
);

CREATE TABLE Recipe (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  restaurant_id BIGINT NOT NULL,
  title VARCHAR(255) NOT NULL,
  yield_amount DECIMAL(10,2),
  yield_unit VARCHAR(64),
  instructions TEXT,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  FOREIGN KEY (restaurant_id) REFERENCES Restaurant(id),
  INDEX idx_recipe_title (title),
  INDEX idx_recipe_restaurant (restaurant_id)
);

CREATE TABLE Ingredient (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL UNIQUE,
  INDEX idx_ingredient_name (name)
);

CREATE TABLE RecipeIngredient (
  recipe_id BIGINT NOT NULL,
  ingredient_id BIGINT NOT NULL,
  quantity DECIMAL(10,2),
  unit VARCHAR(64),
  PRIMARY KEY (recipe_id, ingredient_id),
  FOREIGN KEY (recipe_id) REFERENCES Recipe(id) ON DELETE CASCADE,
  FOREIGN KEY (ingredient_id) REFERENCES Ingredient(id) ON DELETE RESTRICT,
  INDEX idx_r_ing_recipe (recipe_id)
);
