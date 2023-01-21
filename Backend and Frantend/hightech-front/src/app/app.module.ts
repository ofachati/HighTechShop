import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LoginComponent } from './components/login/login.component';
import { ProduitPageComponent } from './components/produit-page/produit-page.component';
import { ProduitCarteComponent } from './components/produit-carte/produit-carte.component';
import { ProduitListeComponent } from './components/produit-liste/produit-liste.component';
import { FooterComponent } from './components/footer/footer.component';
import { AccueilComponent } from './components/accueil/accueil.component';


// MatMenuModule, MatSidenavModule, MatExpansionModule, MatListModule } from '@angular/material';
import { MatToolbar, MatToolbarModule } from '@angular/material/toolbar';
//import { FlexLayoutModule } from '@angular/flex-layout';
import {MatButtonModule} from '@angular/material/button';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatIconModule} from '@angular/material/icon';
import {MatMenuModule} from '@angular/material/menu';
import {MatListModule} from '@angular/material/list';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatExpansionModule} from '@angular/material/expansion';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';

import { ReactiveFormsModule } from '@angular/forms';
import {MatCardModule} from '@angular/material/card';


import { MatCommonModule, MatNativeDateModule } from '@angular/material/core';
import { MatTooltipModule } from '@angular/material/tooltip';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import {MatBadgeModule} from '@angular/material/badge';
import {MatGridListModule} from '@angular/material/grid-list';
import { PanierCarteComponent } from './components/panier-carte/panier-carte.component';
import { PanierListeComponent } from './components/panier-liste/panier-liste.component';
import { ProduitAddEditComponent } from './components/produit-add-edit/produit-add-edit.component';
import {MatDialogModule} from '@angular/material/dialog';
import {MatSelectModule} from '@angular/material/select';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    ProduitPageComponent,
    ProduitCarteComponent,
    ProduitListeComponent,
    FooterComponent,
    AccueilComponent,
    PanierCarteComponent,
    PanierListeComponent,
    ProduitAddEditComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatButtonModule,
    MatMenuModule,
    MatIconModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatFormFieldModule,
    FormsModule,
    ReactiveFormsModule,
    MatCardModule,
    MatBadgeModule,

    MatCommonModule,
    MatGridListModule,
  
    
    MatDatepickerModule,
    MatNativeDateModule,
    MatTooltipModule,
    MatSnackBarModule,
    MatDialogModule,
    MatSelectModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
