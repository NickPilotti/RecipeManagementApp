
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { RecipeListComponent } from './components/recipe-list/recipe-list.component';
import { RecipeDetailComponent } from './components/recipe-detail/recipe-detail.component';
import { RecipeEditorComponent } from './components/recipe-editor/recipe-editor.component';
import { KitchenModeComponent } from './components/kitchen-mode/kitchen-mode.component';

@NgModule({
  declarations: [
    RecipeListComponent,
    RecipeDetailComponent,
    RecipeEditorComponent,
    KitchenModeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule
  ],
  bootstrap: [RecipeListComponent]
})
export class AppModule { }
