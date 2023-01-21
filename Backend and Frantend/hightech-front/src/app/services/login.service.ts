import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }



  login(username: string,password:string): boolean{
    localStorage.setItem('user',JSON.stringify( {Username:username,Password:password}));
    return true;
  }

  isLoggedin():boolean{
    return localStorage.getItem('user') !== null ? true : false;
  }

  logout(){
    localStorage.removeItem("user");
  }

  

}
