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


}
