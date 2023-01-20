import { Component, Input, OnInit } from '@angular/core';
import { Panier } from 'src/app/models/Panier';

@Component({
  selector: 'app-panier-carte',
  templateUrl: './panier-carte.component.html',
  styleUrls: ['./panier-carte.component.css']
})
export class PanierCarteComponent implements OnInit {
  @Input() Panier_unit!: Panier;

  constructor() { }

  ngOnInit(): void {
  }

}
