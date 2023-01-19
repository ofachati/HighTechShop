import { Component, Input, OnInit } from '@angular/core';
import { Produit } from 'src/app/models/Produit';
import { ActivatedRoute, Router,NavigationStart } from '@angular/router';

@Component({
  selector: 'app-produit-page',
  templateUrl: './produit-page.component.html',
  styleUrls: ['./produit-page.component.css']
})
export class ProduitPageComponent implements OnInit {
  produit!: Produit;

  constructor(private activatedRoute: ActivatedRoute, private router: Router) {
    //console.log(this.router.getCurrentNavigation().extras.state); 
  }

  ngOnInit(): void {
    this.produit=history.state;
}
}

