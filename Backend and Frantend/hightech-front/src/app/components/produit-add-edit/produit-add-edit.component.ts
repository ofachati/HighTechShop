import { Component, Inject, Input, OnInit } from '@angular/core';
import { AbstractControl, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Produit } from 'src/app/models/Produit';
import { ProduitService } from 'src/app/services/produit.service';
import { Location } from '@angular/common';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';


@Component({
  selector: 'app-produit-add-edit',
  templateUrl: './produit-add-edit.component.html',
  styleUrls: ['./produit-add-edit.component.css']
})
export class ProduitAddEditComponent implements OnInit {

  produitform!: FormGroup;
  @Input() optionalProduct!: Produit ;


  constructor
  ( @Inject(MAT_DIALOG_DATA) public data: any,
    private router: Router,private produitService:ProduitService,
     private  activatedRoute :ActivatedRoute,
      private location: Location) { }
  
  ngOnInit(): void {
    
    //this.optionalProduct = history.state.optionalProduct;
    
    
    this.produitform = new FormGroup({
      libelle: new FormControl('', [Validators.required]),
      marque: new FormControl('', [Validators.required]),
      prix: new FormControl('', [Validators.required,Validators.pattern('^[0-9]+(\.[0-9]{1,2})?$')]),
      categorie: new FormControl('', [Validators.required]),
      //photo: new FormControl('', [Validators.required, Validators.pattern('(https?://)?([\\da-z.-]+)\\.([a-z.]{2,6})[/\\w .-]*/?')])
      photo: new FormControl('', [Validators.required]),
      description: new FormControl('', [Validators.required]),

    });


  
    
    if(this.data !== undefined){
      this.optionalProduct = this.data.optionalProduct;

      console.log("ggg");
    console.log(this.optionalProduct);
      this.produitform.patchValue({
        libelle: this.optionalProduct.libelle,
        marque: this.optionalProduct.marque,
        prix: this.optionalProduct.prix,
        categorie: this.optionalProduct.categorie,
        photo: this.optionalProduct.photo,
        description: this.optionalProduct.description
    });
  } 
    
    
  }


/*
  validateUrl(control: AbstractControl) {
    if (!control.value) {
      return null;
    }
    const URL_REGEX = /(http|https):\/\/(\w+:{0,1}\w*)?(\S+)(:[0-9]+)?(\/|\/([\w#!:.?+=&%!\-/]))?/;
    return URL_REGEX.test(control.value) ? null : { invalidUrl: true };
  }
*/
  
  onFormSubmit(){
    
    if (this.produitform.valid) {
      let libelle = this.produitform.get('libelle')?.value;
      let marque = this.produitform.get('marque')?.value;
      let prix = this.produitform.get('prix')?.value;
      let categorie = this.produitform.get('categorie')?.value;
      let photo = this.produitform.get('photo')?.value;
      let description=this.produitform.get('description')?.value;



      if(this.optionalProduct !== undefined){
          
        this.produitService.updateProduit(this.optionalProduct);
       // this.location.back()

      }
      else{this.produitService.addProduit(libelle, description, marque, prix, categorie, photo);
       console.log("hery from component")
        //this.location.back();

      
      }
     
    } 

   }

}
