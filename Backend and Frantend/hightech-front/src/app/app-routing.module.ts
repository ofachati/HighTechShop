import { NgModule } from '@angular/core';
import { RouterModule, Routes, UrlSegment } from '@angular/router';
import { MatIcon } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { AccueilComponent } from './components/accueil/accueil.component';
import { LoginComponent } from './components/login/login.component';
import { ProduitPageComponent } from './components/produit-page/produit-page.component';
import { Produit } from './models/Produit';
import { PanierListeComponent } from './components/panier-liste/panier-liste.component';
import { ProduitListeComponent } from './components/produit-liste/produit-liste.component';
import { UrlMatcher } from '@angular/router';
import { ProduitAddEditComponent } from './components/produit-add-edit/produit-add-edit.component';
import { AdminAuthGuard } from './services/admin-auth.guard';

/*
//attempt to restrict id to be an integer in  "produit/:id" but it didn't work :(  
export const integerMatcher: UrlMatcher = (url: UrlSegment[]) => {
  if (!url.length || !Number.isInteger(+url[0].path)) {
    return null;
  }
  return { consumed: url };
};
*/

const routes: Routes = [
  { path: '', component: AccueilComponent },
  { path: 'login', component: LoginComponent },
  { path: 'produit/:id', component: ProduitPageComponent },
  { path: 'panier', component: PanierListeComponent },
  { path: 'produits/:categorie', component: ProduitListeComponent },
  { path: 'acceuil', component: AccueilComponent },
  { path: 'ajouter-produit', component: ProduitAddEditComponent , canActivate: [AdminAuthGuard] },
  { path: '**', redirectTo: 'acceuil' }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
