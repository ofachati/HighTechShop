import { Component, Input, OnInit } from '@angular/core';
import { Produit } from 'src/app/models/Produit';
import { ActivatedRoute, Router,NavigationStart } from '@angular/router';
import { Subscription } from 'rxjs';
import { ProduitService } from 'src/app/services/produit.service';
import { PanierService } from 'src/app/services/panier.service';

@Component({
  selector: 'app-produit-page',
  templateUrl: './produit-page.component.html',
  styleUrls: ['./produit-page.component.css']
})
export class ProduitPageComponent implements OnInit {
  produit!: Produit;
  private subscription!: Subscription;
  path_id!: string;
  routesubscription!: Subscription;

  constructor(private activatedRoute: ActivatedRoute, private router: Router, private produitService: ProduitService,protected panierService:PanierService) {
    //console.log(this.router.getCurrentNavigation().extras.state); 
  }

  ngOnInit(): void {

    this.routesubscription=this.activatedRoute.paramMap.subscribe(params => {
      this.path_id = params.get('id') as string;
      console.log(this.path_id)
      this.produit = this.produitService.getProductById(Number(this.path_id));
      console.log(this.produit)
  });


    

    //this.produit=history.state;
}
}

