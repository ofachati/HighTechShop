package model;

import java.util.Date;
import java.util.List;


public class Commande {

    private int id;
    private int user;
    private Date date;
    private String adresseLivraison;
    private String etat;
    private List<Integer> produits;
    private double total;

    public Commande() {}

    public Commande(int id, int user, Date date, String adresseLivraison, String etat,
            List<Integer> produits, double total) {
		this.id = id;
		this.user = user;
		this.date = date;
		this.adresseLivraison = adresseLivraison;
		this.etat = etat;
		this.produits = produits;
		this.total =total;
		}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public List<Integer> getProduits() {
        return produits;
    }

    public void setProduits(List<Integer> produits) {
        this.produits = produits;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
