package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
   private int id;
   private String nom;
   private String prenom;
   private String mail;
   private String adresse;
   private String username;
   private String motDePasse;
   private boolean admin;
   
   public User() {}
   
   public User(int id, String nom, String prenom, String mail, String adresse, String username, String motDePasse, boolean admin) {
      this.id = id;
      this.nom = nom;
      this.prenom = prenom;
      this.mail= mail;
      this.adresse=adresse;
      this.username = username;
      this.motDePasse = motDePasse;
      this.admin = admin;
   }
   
   public int getId() {
      return id;
   }
   
   public void setId(int id) {
      this.id = id;
   }
   
   public String getNom() {
      return nom;
   }
   
   public void setNom(String nom) {
      this.nom = nom;
   }
   
   public String getPrenom() {
      return prenom;
   }
   
   public void setPrenom(String prenom) {
      this.prenom = prenom;
   }
   
   public String getUsername() {
      return username;
   }
   
   public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public void setUsername(String username) {
      this.username = username;
   }
   
   public String getMotDePasse() {
      return motDePasse;
   }
   
   public void setMotDePasse(String motDePasse) {
      this.motDePasse = motDePasse;
   }
   
   public boolean isAdmin() {
      return admin;
   }
   
   public void setAdmin(boolean admin) {
	   this.admin = admin;
   }
}

