
import { Injectable } from '@angular/core';
import { ApiService } from './api.service';
import { Recipe } from '../models/recipe';

@Injectable({ providedIn: 'root' })
export class RecipeService {
  constructor(private api: ApiService) {}

  list(query = '', limit = 20, offset = 0): Promise<Recipe[]> {
    return this.api.get(`/recipes?query=${encodeURIComponent(query)}&limit=${limit}&offset=${offset}`) as any;
  }

  getRecipe(id: number): Promise<Recipe> {
    return this.api.get(`/recipes/${id}`) as any;
  }

  createRecipe(r: Recipe): Promise<Recipe> {
    return this.api.post(`/recipes`, r) as any;
  }

  updateRecipe(id: number, r: Recipe): Promise<Recipe> {
    return this.api.put(`/recipes/${id}`, r) as any;
  }

  removeRecipe(id: number): Promise<void> {
    return this.api.delete(`/recipes/${id}`) as any;
  }
}
