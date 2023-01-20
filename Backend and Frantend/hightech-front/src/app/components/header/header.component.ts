import { Component, OnInit } from '@angular/core';
import { MatMenuTrigger } from '@angular/material/menu/menu-trigger';
import { PanierService } from 'src/app/services/panier.service';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(protected panierService: PanierService) { }

  ngOnInit(): void {
  }
  
  openMyMenu(menuTrigger: MatMenuTrigger) {
    menuTrigger.openMenu();
}


//not working as expected so i removed it from the HTML
closeMyMenu(menuTrigger: MatMenuTrigger) {
  menuTrigger.closeMenu();
}
//


}
