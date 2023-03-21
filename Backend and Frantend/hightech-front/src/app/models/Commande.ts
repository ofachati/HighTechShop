export interface Commande {
    id: number;
    user: number;
    date: Date;
    adresseLivraison: string;
    etat: string;
    produits: number[];
    total: number;
  }
  