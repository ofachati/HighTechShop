import { Component, Input, OnInit } from '@angular/core';
import { Produit } from 'src/app/models/Produit';
import { Router } from '@angular/router';

@Component({
  selector: 'app-produit-carte',
  templateUrl: './produit-carte.component.html',
  styleUrls: ['./produit-carte.component.css']
})
export class ProduitCarteComponent implements OnInit {
  @Input() produit!: Produit;
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  onCardClick(product: Produit) {
    console.log(product)
    this.router.navigate(['/products', product.id],{state: this.produit});
}

}
