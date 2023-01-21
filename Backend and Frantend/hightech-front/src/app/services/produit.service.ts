import { Injectable } from '@angular/core';
import { Categorie } from '../models/Categorie';
import { Produit } from '../models/Produit';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {
  ProductsChanged = new Subject<Produit[]>();


  private produits: Produit[] = [
    { id: 1, libelle: 'MacBook Pro', marque: 'Apple', prix: 1999, categorie: 'PC Portable', photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 2, libelle: 'ThinkPad T480', marque: 'Lenovo', prix: 1399, categorie: 'PC Portable', photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 3, libelle: 'Galaxy S21', marque: 'Samsung', prix: 799, categorie: 'Smart Phone', photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 4, libelle: 'Surface Pro 7', marque: 'Microsoft', prix: 899, categorie: 'PC Portable', photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 5, libelle: 'Alienware m17 R3', marque: 'Dell', prix: 1999, categorie: 'PC Portable', photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 6, libelle: 'iPhone 12', marque: 'Apple', prix: 999, categorie: 'Smart Phone', photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 7, libelle: 'ZenBook UX425', marque: 'Asus', prix: 999, categorie: 'PC Portable', photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 8, libelle: 'XPS 13', marque: 'Dell', prix: 1299, categorie: 'PC Portable', photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' }
  ];

  constructor() { }

  
  // get all products
  getAllProducts(): Produit[] {
    return this.produits;
  }

  // get product by id
  getProductById(id: number): Produit {
    //return this.produits.find(product => product.id === id) !== undefined ? this.produits.find(product => product.id === id) as Produit:{} as Produit;
     return this.produits.find(product => product.id === id) as Produit;
  }
 
  //
  /*
  getProductsByCategory(categorie: string): Produit[] {
    return this.produits.find(product => product.categorie === categorie) !== undefined ? this.produits.find(product => product.categorie === categorie) as unknown   as Produit[]  :[] as Produit[];
    
  }
  */

  getProductsByCategory(categorie: string): Produit[] {
     const liste_produits =this.produits.filter(produit => produit.categorie === categorie);
     this.ProductsChanged.next(liste_produits);
    return liste_produits;

}


/*
This function first find the highest id in the "produits" list using the spread operator (...), the Array.prototype.map() method, and the Math.max() method. It then adds the new product to the "produits" list and emit an event via the Subject that you can subscribe to in other component to get the new state of the products list.
*/
  addProduit(libelle: string, marque: string, prix: number, categorie: string, photo: string) {
    let newId = 1;
    if (this.produits.length > 0) {
        newId = Math.max(...this.produits.map(p => p.id)) + 1;
    }
    this.produits.push({ id: newId, libelle, marque, prix, categorie, photo });
    this.ProductsChanged.next(this.produits);
  }



  updateProduit(id: number, libelle: string, marque: string, prix: number, categorie: string, photo: string) {
    let index = this.produits.findIndex(p => p.id === id);
    this.produits[index].libelle = libelle;
    this.produits[index].marque = marque;
    this.produits[index].prix = prix;
    this.produits[index].categorie = categorie;
    this.produits[index].photo = photo;
}
}
