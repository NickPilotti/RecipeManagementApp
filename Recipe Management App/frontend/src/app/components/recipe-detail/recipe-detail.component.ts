
import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RecipeService } from '../../services/recipe.service';
import { Recipe } from '../../models/recipe';

@Component({
  selector: 'app-recipe-detail',
  templateUrl: './recipe-detail.component.html'
})
export class RecipeDetailComponent {
  recipe?: Recipe;

  constructor(private route: ActivatedRoute, private recipes: RecipeService) {}

  async ngOnInit() {
    // initialize recipe here from route
  }
}
