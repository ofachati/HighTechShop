import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  value = 'Clear me';
  hide = true;
  loginform!: FormGroup;


  constructor() { }

  ngOnInit(): void {
     this.loginform = new FormGroup({
      login: new FormControl(''),
      password: new FormControl('')})
  }


  onFormSubmit(){
   console.log('login:' + this.loginform.get('login')?.value);

  }
}


