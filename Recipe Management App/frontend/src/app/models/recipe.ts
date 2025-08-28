
export interface IngredientLine {
  ingredientId: number;
  name: string;
  quantity: number;
  unit: string;
}

export interface Recipe {
  id: number;
  restaurantId: number;
  title: string;
  yieldAmount?: number;
  yieldUnit?: string;
  instructions?: string;
  ingredients: IngredientLine[];
  createdAt?: string;
  updatedAt?: string;
}
