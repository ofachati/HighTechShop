import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MatIcon } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { AccueilComponent } from './components/accueil/accueil.component';
import { LoginComponent } from './components/login/login.component';
import { ProduitPageComponent } from './components/produit-page/produit-page.component';
import { Produit } from './models/Produit';
import { PanierListeComponent } from './components/panier-liste/panier-liste.component';
const routes: Routes = [
  { path: '', component: AccueilComponent },
  { path: 'login', component: LoginComponent },
  { path: 'products/:id', component: ProduitPageComponent },
  { path: 'panier', component: PanierListeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
