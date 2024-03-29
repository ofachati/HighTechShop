import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  value = 'Clear me';
  hide = true;
  loginform!: FormGroup;

  errorMessage = '';
  successMessage = '';

  constructor(protected loginService:LoginService,private router: Router,
    private dialogRef: MatDialogRef<LoginComponent>
    ) { }

  ngOnInit(): void {
     this.loginform = new FormGroup({
      login: new FormControl(''),
      password: new FormControl('')})
  }

/*
  onFormSubmit(){
   console.log('login:' + this.loginform.get('login')?.value);
   if(this.loginService.login(this.loginform.get('login')?.value,this.loginform.get('password')?.value)){
    this.router.navigate(['/acceuil']);
   }
  }
  */
  onFormSubmit() {
    if (this.loginform.valid) {
      this.loginService.login(this.loginform.value.login, this.loginform.value.password)
        .subscribe(
          result => {
            if (result) {
              this.successMessage = 'You have been logged in successfully.';
              this.router.navigate(['/acceuil']);
              this.dialogRef.close(); // Close the dialog on successful login

            } else {
              this.errorMessage = 'Invalid username or password.';
            }
          }, 
          error => {
            this.errorMessage = 'Invalid username or password..';
          }
        );
    }
  }


}


