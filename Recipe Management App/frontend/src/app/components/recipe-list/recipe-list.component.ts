
import { Component } from '@angular/core';
import { RecipeService } from '../../services/recipe.service';
import { Recipe } from '../../models/recipe';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html'
})
export class RecipeListComponent {
  query = '';
  recipes: Recipe[] = [];

  constructor(private recipesSvc: RecipeService) {}

  ngOnInit() { this.search(); }

  async search() {
    // grab recipes from recipe service
  }
}
