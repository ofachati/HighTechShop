import { Component } from '@angular/core';
import { User } from './models/User';
import { UserService } from './services/user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hightech-front';

  constructor(protected userService: UserService) { }
  ngOnInit(): void {
      
    const userString = localStorage.getItem('user');
  if (userString !== null) {
  this.userService.currentUser = JSON.parse(userString) as User;
} 
  }

  
  }