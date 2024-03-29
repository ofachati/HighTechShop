import { Injectable } from '@angular/core';
import { Panier } from '../models/Panier';
import { Produit } from '../models/Produit';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PanierService {
  panierProductsChanged = new Subject<Panier[]>();
  constructor() { }


  insert_panier(id:number,nom : string,prix:number) {
    let PanierProducts: Panier[]
    let unparsedPanier= localStorage.getItem('PanierProducts');
    //if PanierProducts doesn't exist in local storage
    if(unparsedPanier == null){
      PanierProducts = [];
      PanierProducts.push({id:id,nom:nom,quantite:1,prix:prix});
      localStorage.setItem('PanierProducts', JSON.stringify(PanierProducts));
      //
      this.panierProductsChanged.next(PanierProducts);
    } 
    //if PanierProducts exist in local storage
    else {
      PanierProducts = JSON.parse(unparsedPanier);
      let existingProduct = PanierProducts.find(p => (p.id === id));
      if(existingProduct === undefined) {
        PanierProducts.push({id:id,nom:nom,quantite:1,prix:prix});
      } else {
        existingProduct.quantite++;
      }
      localStorage.setItem('PanierProducts', JSON.stringify(PanierProducts));
      //
      this.panierProductsChanged.next(PanierProducts);
    }
  }


  
  delete_from_panier(nom : string,prix:number) {
    let PanierProducts: Panier[]
    let unparsedPanier= localStorage.getItem('PanierProducts');

    if(unparsedPanier !== null) {
      PanierProducts = JSON.parse(unparsedPanier);
      let existingProduct = PanierProducts.find(p => (p.nom === nom &&p.prix === prix));
      if(existingProduct !== undefined) {
        if(existingProduct.quantite === 1) {
          PanierProducts.splice(PanierProducts.indexOf(existingProduct), 1);
        } else {
          existingProduct.quantite--;
        }
        localStorage.setItem('PanierProducts', JSON.stringify(PanierProducts));
        //
        this.panierProductsChanged.next(PanierProducts);
      }
    }
  }

  empty_panier() {
    localStorage.removeItem("PanierProducts");
    //
    this.panierProductsChanged.next([]);
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
