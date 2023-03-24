import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/User';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl = '/rest/users';
  currentUser!: User;

  constructor(private http: HttpClient) { }

  createUser(user: User): Observable<User> {
    return this.http.post<User>(this.baseUrl, user);
  }

  getAllUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.baseUrl);
  }

  getUserById(id: number): Observable<User> {
    return this.http.get<User>(`${this.baseUrl}/${id}`);
  }

  updateUser(id: number, user: User): Observable<User> {
    return this.http.put<User>(`${this.baseUrl}/${id}`, user);
  }

  deleteUser(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`);
  }

  isAdmin(id: number): Observable<boolean> {
    return this.http.get<boolean>(`${this.baseUrl}/${id}/isAdmin`);
  }

  getUserByCredentials(username: string, password: string) {
    const url = `${this.baseUrl}/getUserByCredentials?username=${username}&password=${password}`;
    return this.http.get(url);
  }

  



}
