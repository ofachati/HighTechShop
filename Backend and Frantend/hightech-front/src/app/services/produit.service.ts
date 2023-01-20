import { Injectable } from '@angular/core';
import { Categorie } from '../models/Categorie';
import { Produit } from '../models/Produit';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {


  private produits: Produit[] = [
    { id: 1, libelle: 'MacBook Pro', marque: 'Apple', prix: 1999, categorie: Categorie.PC_Portable, photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 2, libelle: 'ThinkPad T480', marque: 'Lenovo', prix: 1399, categorie: Categorie.PC_Portable, photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 3, libelle: 'Galaxy S21', marque: 'Samsung', prix: 799, categorie: Categorie.Smart_phone, photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 4, libelle: 'Surface Pro 7', marque: 'Microsoft', prix: 899, categorie: Categorie.PC_Portable, photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 5, libelle: 'Alienware m17 R3', marque: 'Dell', prix: 1999, categorie: Categorie.PC_Portable, photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 6, libelle: 'iPhone 12', marque: 'Apple', prix: 999, categorie: Categorie.Smart_phone, photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 7, libelle: 'ZenBook UX425', marque: 'Asus', prix: 999, categorie: Categorie.PC_Portable, photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' },
    { id: 8, libelle: 'XPS 13', marque: 'Dell', prix: 1299, categorie: Categorie.PC_Portable, photo: 'https://media.ldlc.com/r1600/ld/products/00/05/95/97/LD0005959734.jpg' }
  ];

  constructor() { }

  
  // get all products
  getAllProducts(): Produit[] {
    return this.produits;
  }

  // get product by id
  getProductById(id: number) {
    return this.produits.find(product => product.id === id);
  }
  getProductsByCategory(id: number) {
    return this.produits.find(product => product.id === id);
  }


}
