import { Component, Input, OnInit } from '@angular/core';
import { Produit } from 'src/app/models/Produit';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-produit-carte',
  templateUrl: './produit-carte.component.html',
  styleUrls: ['./produit-carte.component.css']
})
export class ProduitCarteComponent implements OnInit {
  @Input() produit!: Produit;
  constructor(private router: Router, protected loginService:LoginService) { }

  ngOnInit(): void {
  }

  onCardClick(product: Produit) {
   
    if (!this.loginService.isLoggedin()){
      console.log(product);
    this.router.navigate(['/produit', product.id]);
  }
  
  }
  onEditBtnClick(product: Produit) {
    console.log(product);
      this.router.navigate(['ajouter-produit'], { state: { optionalProduct: product } });
}

}
