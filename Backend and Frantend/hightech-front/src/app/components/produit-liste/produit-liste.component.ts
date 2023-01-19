import { Component, Input, OnInit } from '@angular/core';
import { Produit } from 'src/app/models/Produit';

@Component({
  selector: 'app-produit-liste',
  templateUrl: './produit-liste.component.html',
  styleUrls: ['./produit-liste.component.css']
})
export class ProduitListeComponent implements OnInit {

  @Input()
  produits!: Produit[];
  /*
  */
    constructor() { }

  ngOnInit(): void {
  }

}
