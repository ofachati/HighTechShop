import { Injectable } from '@angular/core';
import { Panier } from '../models/Panier';
import { Produit } from '../models/Produit';

@Injectable({
  providedIn: 'root'
})
export class PanierService {
  constructor() { }


  insert_panier(product: Produit) {
    let PanierProducts: Panier[]
    let unparsedPanier= localStorage.getItem('PanierProducts');
    //if PanierProducts doesn't exist in local storage
    if(unparsedPanier == null){
      PanierProducts = [];
      PanierProducts.push({nom:product.libelle,quantite:1,prix:product.prix});
      localStorage.setItem('PanierProducts', JSON.stringify(PanierProducts));
    } 
    //if PanierProducts exist in local storage
    else {
      PanierProducts = JSON.parse(unparsedPanier);
      let existingProduct = PanierProducts.find(p => p.nom === product.libelle);
      if(existingProduct === undefined) {
        PanierProducts.push({nom:product.libelle,quantite:1,prix:product.prix});
      } else {
        existingProduct.quantite++;
      }
      localStorage.setItem('PanierProducts', JSON.stringify(PanierProducts));
    }
  }


  
  delete_from_panier(product: Produit) {
    let PanierProducts: Panier[]
    let unparsedPanier= localStorage.getItem('PanierProducts');

    if(unparsedPanier !== null) {
      PanierProducts = JSON.parse(unparsedPanier);
      let existingProduct = PanierProducts.find(p => p.nom === product.libelle);
      if(existingProduct !== undefined) {
        if(existingProduct.quantite === 1) {
          PanierProducts.splice(PanierProducts.indexOf(existingProduct), 1);
        } else {
          existingProduct.quantite--;
        }
        localStorage.setItem('PanierProducts', JSON.stringify(PanierProducts));
      }
    }
  }

  empty_panier() {
    localStorage.removeItem("PanierProducts");
  }

  get_panier(): Panier[] {
    let PanierProducts: Panier[]
    let unparsedPanier= localStorage.getItem('PanierProducts');

    if(unparsedPanier !== null) {
      PanierProducts = JSON.parse(unparsedPanier);
      return PanierProducts;
    }
    else {
      return [];
    }
  }


  prix_total_panier(): number {
    let PanierProducts: Panier[]
    let unparsedPanier= localStorage.getItem('PanierProducts');
    if(unparsedPanier !== null) {
      PanierProducts = JSON.parse(unparsedPanier);
      return PanierProducts.reduce((acc, p) => acc + (p.prix * p.quantite), 0);
    }
    else {
      return 0;
    }
  }


  quantite_total_panier(): number {
    let PanierProducts: Panier[]
    let unparsedPanier= localStorage.getItem('PanierProducts');
    if(unparsedPanier !== null) {
      PanierProducts = JSON.parse(unparsedPanier);
      return PanierProducts.reduce((acc, p) => acc +  p.quantite, 0);
    }
    else {
      return 0;
    }
  }

}
