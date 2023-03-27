import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { Panier } from 'src/app/models/Panier';
import { PanierService } from 'src/app/services/panier.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Commande } from 'src/app/models/Commande';
import { CommandeService } from 'src/app/services/commande.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-panier-liste',
  templateUrl: './panier-liste.component.html',
  styleUrls: ['./panier-liste.component.css']
})
export class PanierListeComponent implements OnInit, OnDestroy {
  panierProducts!: Panier[];
  private subscription!: Subscription;
  shippingForm!: FormGroup;
  commande!: Commande;

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
      name: ['', Validators.required],
      address: ['', Validators.required],
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
    
    this.commande.user= this.userService.currentUser.id;
    this.commande.date= new Date();
    this.commande.adresseLivraison= "hahahahahhahahahhah test adress";
    this.commande.etat= "en cours";
    this.commande.produits= [1,6,9,6,9];
    this.commande.total=1400;
    this.commandeService.addCommande( this.commande);
    this.panierService.empty_panier();
  }
}
