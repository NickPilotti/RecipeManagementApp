
import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RecipeService } from '../../services/recipe.service';
import { Recipe } from '../../models/recipe';

@Component({
  selector: 'app-kitchen-mode',
  templateUrl: './kitchen-mode.component.html'
})
export class KitchenModeComponent {
  recipe?: Recipe;
  steps: string[] = [];
  stepIndex = 0;

  constructor(private route: ActivatedRoute, private svc: RecipeService) {}

  async ngOnInit() {
    // initialize recipe/steps here
  }

  prev() { if (this.stepIndex > 0) this.stepIndex--; }
  next() { if (this.stepIndex < this.steps.length - 1) this.stepIndex++; }
}
