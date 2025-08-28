
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RecipeListComponent } from './components/recipe-list/recipe-list.component';
import { RecipeDetailComponent } from './components/recipe-detail/recipe-detail.component';
import { RecipeEditorComponent } from './components/recipe-editor/recipe-editor.component';
import { KitchenModeComponent } from './components/kitchen-mode/kitchen-mode.component';

const routes: Routes = [
  { path: '', component: RecipeListComponent },
  { path: 'recipes/:id', component: RecipeDetailComponent },
  { path: 'recipes/:id/edit', component: RecipeEditorComponent },
  { path: 'kitchen/:id', component: KitchenModeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
