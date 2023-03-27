import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Commande } from '../models/Commande';

@Injectable({
  providedIn: 'root'
})
export class CommandeService {

  private readonly BASE_URL = '/rest/commandes';

  constructor(private http: HttpClient) { }

  getAllCommandes(): Observable<Commande[]> {
    return this.http.get<Commande[]>(this.BASE_URL);
  }

  getCommandeById(id: number): Observable<Commande> {
    return this.http.get<Commande>(`${this.BASE_URL}/${id}`);
  }

  addCommande(commande: Commande): Observable<Commande> {
    return this.http.post<Commande>(this.BASE_URL, commande);
  }


  addProduit(libelle: string, description: string, marque: string, prix: number, categorie: string, photo: string) {
    let params = new HttpParams();
    params = params.append('libelle', libelle);
    params = params.append('description', description);
    params = params.append('marque', marque);
    params = params.append('prix', prix.toString());
    params = params.append('categorie', categorie);
    params = params.append('photo', photo);
  
    return this.http.post<any>(this.BASE_URL+"/", params,{ headers: new HttpHeaders({ 'Content-Type': 'application/x-www-form-urlencoded' }) })
    .subscribe(r=>{});
  }




  updateCommande(id: number, commande: Commande): Observable<Commande> {
    return this.http.put<Commande>(`${this.BASE_URL}/${id}`, commande);
  }

  deleteCommande(id: number): Observable<Commande> {
    return this.http.delete<Commande>(`${this.BASE_URL}/${id}`);
  }

  getCommandesByUser(userId: number): Observable<Commande[]> {
    return this.http.get<Commande[]>(`${this.BASE_URL}/user/${userId}`);
  }
}
