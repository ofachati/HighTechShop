import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { Panier } from 'src/app/models/Panier';
import { PanierService } from 'src/app/services/panier.service';

@Component({
  selector: 'app-panier-liste',
  templateUrl: './panier-liste.component.html',
  styleUrls: ['./panier-liste.component.css']
})
export class PanierListeComponent implements OnInit,OnDestroy {
  panierProducts !: Panier[];
  private subscription!: Subscription;

  constructor(private panierService: PanierService) { }
  
  ngOnInit(): void {

    this.subscription = this.panierService.panierProductsChanged.subscribe(
      products => {
        this.panierProducts = products;
      }
    );
    
    this.panierProducts = this.panierService.get_panier();

  }

  ngOnDestroy(): void {
        this.subscription.unsubscribe();
  }


  valider_commande(){
    this.panierService.empty_panier();
  }

}
