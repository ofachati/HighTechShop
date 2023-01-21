import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  value = 'Clear me';
  hide = true;
  loginform!: FormGroup;


  constructor(protected loginService:LoginService,private router: Router) { }

  ngOnInit(): void {
     this.loginform = new FormGroup({
      login: new FormControl(''),
      password: new FormControl('')})
  }


  onFormSubmit(){
   console.log('login:' + this.loginform.get('login')?.value);
   if(this.loginService.login(this.loginform.get('login')?.value,this.loginform.get('password')?.value)){
    this.router.navigate(['/acceuil']);
   }
  }

}


