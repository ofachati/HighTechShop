import { Injectable } from '@angular/core';
import { Produit } from '../models/Produit';
import { catchError, Observable, of, Subject, tap } from 'rxjs';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ProduitService {
  ProductsChanged = new Subject<Produit[]>();
  private articlesUrl = '/rest/articles';  // URL tok web api

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  
  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<Produit[]> {
    return this.http.get<Produit[]>(this.articlesUrl)
      .pipe(
        catchError(this.handleError<Produit[]>('getArticles', []))
      );
  }

  getProductById(id: number): Observable<Produit> {
    const url = `${this.articlesUrl}/${id}`;
    return this.http.get<Produit>(url, this.httpOptions).pipe(
    catchError(this.handleError<Produit>('getProductById id=${id}'))
    );
    }

  getProductsByCategory(category: string): Observable<Produit[]> {
      const url = `${this.articlesUrl}/category/${category}`;
      return this.http.get<Produit[]>(url, this.httpOptions)
        .pipe(
          catchError(this.handleError<Produit[]>('getArticlesByCategory', []))
        );
    }


    /*
  addProduit(libelle: string, description: string, marque: string, prix: number, categorie: string, photo: string): Observable<any> {
    let params = new HttpParams();
    params = params.append('libelle', libelle);
    params = params.append('description', description);
    params = params.append('marque', marque);
    params = params.append('prix', prix.toString());
    params = params.append('categorie', categorie);
    params = params.append('photo', photo);
  
    return this.http.post<any>(this.articlesUrl+"/", params,{ headers: new HttpHeaders({ 'Content-Type': 'application/x-www-form-urlencoded' }) })
      .pipe(
        catchError(this.handleError<any>('add product'))
      );
  }
  */
  
  addProduit(produit: Produit){
    return this.http.post<Produit>(this.articlesUrl, produit);
  }

  

  updateProduit (article: Produit) {
    const url = `${this.articlesUrl}/`;
    console.log(article)
    return this.http.put(url, article,this.httpOptions).pipe(
      catchError(this.handleError<any>('updateArticle'))
    );
  }

  deleteProductById (id:number){
    console.log(`Sending DELETE request to URL: ${this.articlesUrl}/${id}`);
    const url = `${this.articlesUrl}/${id}`;
  
    return this.http.delete<void>(url, this.httpOptions).pipe(
      catchError(this.handleError<Produit>('deleteArticle'))
    );
  }

 

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }
  
}
