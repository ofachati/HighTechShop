import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { User } from '../models/User';
import { UserService } from './user.service';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private apiUrl = '/rest/users';

  constructor(private http: HttpClient,
    private userService:UserService) { }


    login(username: string, password: string): Observable<boolean> {

  
      const url = `${this.apiUrl}/getUserByCredentials?username=${username}&password=${password}`;
      return this.http.get<User>(url).pipe(
        map((user: User) => {
          if (user) {
            localStorage.setItem('user', JSON.stringify(user));
            this.userService.currentUser=user as User;
            return true;
          } else {
            return false;
          }
        })
      );
    }
    
    
  /*
  login(username: string,password:string): boolean{
    
    localStorage.setItem('user',JSON.stringify( {Username:username,Password:password}));


    return true;
  }
*/
  isLoggedin():boolean{
    return localStorage.getItem('user') !== null ? true : false;
  }

  logout(){
    localStorage.removeItem("user");
  }

  

}
