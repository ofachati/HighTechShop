package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Article;

public enum ArticleDao {
    instance;

    private Map<Integer, Article> contentProvider = new HashMap<>();
    
    private ArticleDao() {

    	Article article = new Article(1, "PC Portable", "Lenovo IdeaPad 3", "Lenovo", 500.0,  "PC Portable", "https://t.ly/tDTXk");
        contentProvider.put(article.getId(), article);
        article = new Article(2, "PC de Bureau", "Dell Optiplex", "Dell", 700.0, "PC de Bureau", "https://t.ly/tDTXk");
        contentProvider.put(article.getId(), article);
        article = new Article(3, "Accessoires ordinateurs", "Souris sans fil", "Logitech", 30.0,  "Accessoires ordinateurs", "https://t.ly/tDTXk");
        contentProvider.put(article.getId(), article);
        article = new Article(4, "Smart phone", "Samsung Galaxy S21", "Samsung", 800.0,  "Smart phone", "https://t.ly/tDTXk");
        contentProvider.put(article.getId(), article);
        article = new Article(5, "Tel Fixe", "Telephone fixe noir", "Panasonic", 50.0,  "Tel Fixe", "https://t.ly/tDTXk");
        contentProvider.put(article.getId(), article);
        article = new Article(6, "Accessoires téléphone", "Etui en cuir pour téléphone", "Apple", 40.0,  "Accessoires téléphone", "https://t.ly/tDTXk");
        contentProvider.put(article.getId(), article);
        article = new Article(7, "Disque dur", "Disque dur externe 1 To", "Seagate", 100.0,  "Disque dur", "https://t.ly/tDTXk");
        contentProvider.put(article.getId(), article);
        article = new Article(8, "Clé USB", "Clé USB 32 Go", "Sandisk", 20.0,  "Clé USB", "https://t.ly/tDTXk");
        contentProvider.put(article.getId(), article);
        article = new Article(9, "Accessoires stockage", "Boîtier disque dur externe", "Toshiba", 30.0,  "Accessoires stockage", "https://t.ly/tDTXk");
        contentProvider.put(article.getId(), article);
        article = new Article(10, "Ordinateur portable", "HP Spectre x360", "HP", 1200.0,  "PC Portable", "https://t.ly/tDTXk");
        contentProvider.put(article.getId(), article);
    }

    public Map<Integer, Article> getModel() {
        return contentProvider;
    }
    
    public List<Article> getArticles() {
        return new ArrayList<>(contentProvider.values());
    }

    public Article addArticle(String libelle, String description, String marque, double prix, String categorie, String photo) {
        int maxId = 0;
        for (Article a : contentProvider.values()) {
            if (a.getId() > maxId) {
                maxId = a.getId();
            }
        }
        Article a= new Article(maxId + 1, libelle,  description,  marque,  prix,  categorie,   photo);
        contentProvider.put(maxId + 1,a);
        return a;
    }

    public void updateArticle(Article article) {
        contentProvider.put(article.getId(), article);
    }

    public void deleteArticle(int id) {
        contentProvider.remove(id);
    }
    
    public List<Article> getArticlesByCategory(String category) {
        List<Article> articlesByCategory = new ArrayList<>();
        for (Article article : contentProvider.values()) {
            if (article.getCategorie().equals(category)) {
                articlesByCategory.add(article);
            }
        }
        return articlesByCategory;
    }
    

    
}
