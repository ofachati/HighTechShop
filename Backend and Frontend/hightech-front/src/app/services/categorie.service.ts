import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Categorie } from '../models/Categorie';
import { Panier } from '../models/Panier';


@Injectable({
  providedIn: 'root'
})
export class CategorieService {
  private readonly categoriesUrl = '/rest/categories';

  constructor(private http: HttpClient) {}

  getAllCategories(): Observable<Categorie[]> {
    return this.http.get<Categorie[]>(this.categoriesUrl);
  }

  getCategorieById(id: number): Observable<Categorie> {
    return this.http.get<Categorie>(`${this.categoriesUrl}/${id}`);
  }

  getSubcategories(id: number): Observable<Categorie[]> {
    return this.http.get<Categorie[]>(`${this.categoriesUrl}/${id}/subcategories`);
  }
}
