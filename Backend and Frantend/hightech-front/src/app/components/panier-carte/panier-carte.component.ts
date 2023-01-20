import { Component, Input, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Panier } from 'src/app/models/Panier';
import { PanierService } from 'src/app/services/panier.service';

@Component({
  selector: 'app-panier-carte',
  templateUrl: './panier-carte.component.html',
  styleUrls: ['./panier-carte.component.css']
})
export class PanierCarteComponent implements OnInit {
  @Input() Panier_unit!: Panier;
  private subscription!: Subscription;


  constructor(protected panierService: PanierService) { }

  ngOnInit(): void {
  }


}
