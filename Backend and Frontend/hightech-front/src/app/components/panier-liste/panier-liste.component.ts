import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { Panier } from 'src/app/models/Panier';
import { PanierService } from 'src/app/services/panier.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-panier-liste',
  templateUrl: './panier-liste.component.html',
  styleUrls: ['./panier-liste.component.css']
})
export class PanierListeComponent implements OnInit,OnDestroy {
  panierProducts !: Panier[];
  private subscription!: Subscription;
  shippingForm!: FormGroup;


  currentStep = 0;
  constructor(protected panierService: PanierService,
    private fb: FormBuilder) { }
  
  ngOnInit(): void {

    this.subscription = this.panierService.panierProductsChanged.subscribe(
      products => {
        this.panierProducts = products;
      }
    );
    
    this.panierProducts = this.panierService.get_panier();


      

    this.shippingForm = this.fb.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      address: ['', Validators.required],
      city: ['', Validators.required],
      state: ['', Validators.required],
      zipCode: ['', Validators.required],
      country: ['', Validators.required],
      phone: ['', Validators.required],
      email: ['', Validators.compose([Validators.required, Validators.email])]
    });
  }

  ngOnDestroy(): void {
        this.subscription.unsubscribe();
  }


  valider_commande(){
    this.panierService.empty_panier();
  }



}
