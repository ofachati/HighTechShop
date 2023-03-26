import { Component, Input, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs';
import { Produit } from 'src/app/models/Produit';
import { LoginService } from 'src/app/services/login.service';
import { ProduitService } from 'src/app/services/produit.service';
import { UserService } from 'src/app/services/user.service';
import { MatDialog } from '@angular/material/dialog';
import { ProduitAddEditComponent } from '../produit-add-edit/produit-add-edit.component';
@Component({
  selector: 'app-produit-liste',
  templateUrl: './produit-liste.component.html',
  styleUrls: ['./produit-liste.component.css']
})
export class ProduitListeComponent implements OnInit,OnDestroy  {

  @Input()
  produits!: Produit[];
  private subscription!: Subscription;
  private routesubscription!: Subscription;
  categorie!: string ;


  
    constructor(protected produitService: ProduitService,private activatedRoute: ActivatedRoute,
      protected loginService: LoginService,
      protected userService: UserService,
      private dialog: MatDialog
      ) { }
  
  
    ngOnInit(): void {
    this.routesubscription=this.activatedRoute.paramMap.subscribe(params => {
      this.categorie = params.get('categorie') as string;
      console.log(this.categorie)

      //this.produits = this.produitService.getProductsByCategory(this.categorie);
      this.produitService.getProductsByCategory(this.categorie).subscribe(produits => this.produits = produits);

      console.log(this.produits)

  });




      this.subscription = this.produitService.ProductsChanged.subscribe(
        (products: Produit[]) => {
          this.produits = products;
        }
      );
        
      
    
    
//
  }

  ngOnDestroy(): void {
   this.subscription.unsubscribe();
   this.routesubscription.unsubscribe();

}

openLoginDialog() {
  this.dialog.open(ProduitAddEditComponent);
}


}
