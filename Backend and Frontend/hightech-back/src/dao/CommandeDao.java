package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

import model.Article;
import model.Commande;

public enum CommandeDao {
    instance;
    
    private Map<Integer, Commande> contentProvider = new HashMap<>();
    private int lastId = 0;
    
    private CommandeDao() {
        // create some sample data for testing purposes
        Commande commande1 = new Commande(getNextId(), 101, new Date(), "123 Main St, Paris", "en cours",
                Arrays.asList(1, 2, 3), 100.0);
        Commande commande2 = new Commande(getNextId(), 102, new Date(), "456 Rue des Fleurs, Marseille", "livrée",
                Arrays.asList(2, 3), 50.0);
        Commande commande3 = new Commande(getNextId(), 103, new Date(), "789 Avenue des Champs-Élysées, Lyon", "annulée",
                Arrays.asList(1, 3), 75.0);

        contentProvider.put(commande1.getId(), commande1);
        contentProvider.put(commande2.getId(), commande2);
        contentProvider.put(commande3.getId(), commande3);
    }
    
    private int getNextId() {
        return ++lastId;
    }
    
    public Commande getCommande(int id) {
        return contentProvider.get(id);
    }
    
    public List<Commande> getAllCommandes() {
        return new ArrayList<>(contentProvider.values());
    }
    
    public Commande addCommande(Commande commande) {
    	int maxId = 0;
    	for (Commande a : contentProvider.values()) {
            if (a.getId() > maxId) {
                maxId = a.getId();
            }
        }
    	commande.setId(maxId+1);
    	contentProvider.put(maxId + 1,commande);
        return commande; 
    	
    	//int id = getNextId();
        //commande.setId(id);
        //contentProvider.put(id, commande);
        //return commande;
        
       
    }
    
    public Commande updateCommande(int id, Commande commande) {
        Commande existingCommande = contentProvider.get(id);
        if (existingCommande != null) {
            commande.setId(existingCommande.getId());
            contentProvider.put(id, commande);
            return commande;
        }
        return null;
    }
    
    public Commande deleteCommande(int id) {
        return contentProvider.remove(id);
    }
    
    public List<Commande> getCommandesByUser(int userId) {
        List<Commande> commandes = new ArrayList<>();
        for (Commande commande : contentProvider.values()) {
            if (commande.getUser() == userId) {
                commandes.add(commande);
            }
        }
        return commandes;
    }

}
