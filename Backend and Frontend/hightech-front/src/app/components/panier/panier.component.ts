import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { Panier } from 'src/app/models/Panier';
import { PanierService } from 'src/app/services/panier.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Commande } from 'src/app/models/Commande';
import { CommandeService } from 'src/app/services/commande.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-panier',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.css']
})
export class PanierComponent implements OnInit, OnDestroy {
  panierProducts!: Panier[];
  private subscription!: Subscription;
  shippingForm!: FormGroup;

  currentStep = 0;
  constructor(
    protected panierService: PanierService,
    private fb: FormBuilder,
    private commandeService: CommandeService,
    private userService :UserService
  ) { }
  
  ngOnInit(): void {
    this.subscription = this.panierService.panierProductsChanged.subscribe(
      products => {
        this.panierProducts = products;
      }
    );
    
    this.panierProducts = this.panierService.get_panier();

    this.shippingForm = this.fb.group({
      name: [this.userService.currentUser?.prenom+" "+this.userService.currentUser?.nom, Validators.required],
      address: [this.userService.currentUser?.adresse, Validators.required],
      city: ['', Validators.required],
      postalCode: ['', Validators.required],
    });
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }

  valider_commande(): void {
    
/*
 id: number;
user: number;
date: Date;
adresseLivraison: string;
etat: string;
produits: number[];
total: number;
*/ 
    const commande ={} as Commande;
    //this.commande.user= this.userService.currentUser.id;
    commande.user= this.userService.currentUser?.id;
    commande.date= new Date();

        // Get the values of the address, postalCode, and city form controls
    const address = this.shippingForm.get('address')?.value;
    const postalCode = this.shippingForm.get('postalCode')?.value;
    const city = this.shippingForm.get('city')?.value;

    commande.adresseLivraison= `${address}, ${postalCode} ${city}`;
    commande.etat= "en cours";
    commande.produits= this.panierService.get_panier().flatMap(p => {
      const result = [];
      for (let i = 0; i < p.quantite; i++) {
        result.push(p.id);
      }
      return result;
    });;
    commande.total=this.panierService.prix_total_panier();
    this.commandeService.addCommande(commande);
    this.panierService.empty_panier();
  }
}
