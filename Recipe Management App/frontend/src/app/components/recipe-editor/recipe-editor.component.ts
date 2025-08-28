
import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RecipeService } from '../../services/recipe.service';
import { Recipe } from '../../models/recipe';

@Component({
  selector: 'app-recipe-editor',
  templateUrl: './recipe-editor.component.html'
})
export class RecipeEditorComponent {
  model: Recipe = { title: '', ingredients: [] };

  constructor(private route: ActivatedRoute, private svc: RecipeService, private router: Router) {}

  addIngredient() {
    // push ingredients to model list
  }

  async save() {
    // call update from recipe service;
  }
}
