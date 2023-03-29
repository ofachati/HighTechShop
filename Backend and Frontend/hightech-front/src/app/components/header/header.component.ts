import { Component, OnInit } from '@angular/core';
import { MatMenuTrigger } from '@angular/material/menu/menu-trigger';
import { Router } from '@angular/router';
import { CategorieService } from 'src/app/services/categorie.service';
import { LoginService } from 'src/app/services/login.service';
import { PanierService } from 'src/app/services/panier.service';
import { ProduitService } from 'src/app/services/produit.service';
import { LoginComponent } from '../login/login.component';
import { MatDialog } from '@angular/material/dialog';
import { UserService } from 'src/app/services/user.service';
import { Categorie } from 'src/app/models/Categorie';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  globalCategories: Categorie[] = [];
  subCategories: Categorie[][] = [];


  constructor(protected panierService: PanierService ,
    protected categorieService:CategorieService,
    protected produitService:ProduitService,
    protected userService :UserService,
    private router: Router,protected loginService: LoginService,
    private dialog: MatDialog) { }
  ngOnInit(): void {


    this.categorieService.getRootCategories().subscribe(categories => {
      this.globalCategories = categories;
      categories.forEach(category => {
        this.categorieService.getSubcategories(category.id).subscribe(subCategories => {
          this.subCategories[category.id] = subCategories;
        });
      });
    });
  

    

  }
  
  openMyMenu(menuTrigger: MatMenuTrigger) {
    menuTrigger.openMenu();
}

//not working as expected so i removed it from the HTML
closeMyMenu(menuTrigger: MatMenuTrigger) {
  menuTrigger.closeMenu();
}

//
onCategoryClick(categorie: Categorie) {
  this.router.navigate(['/produits', categorie.name]);
}

openLoginDialog() {
  this.dialog.open(LoginComponent);
}


onRootCategoryClick(category: Categorie) {
  // Do something when a global category button is clicked

}

}
