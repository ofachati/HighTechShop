package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Categorie;

public enum CategorieDao {
	 instance;

	    private Map<Integer, Categorie> contentProvider = new HashMap<>();
	    
	    private CategorieDao(){

	    	// Ordinateurs category and subcategories
	    	Categorie ordinateurs = new Categorie(1, "Ordinateurs", "laptop", Arrays.asList(2, 3, 4));
	    	Categorie pcPortable = new Categorie(2, "PC Portable", "laptop", Collections.emptyList());
	    	Categorie pcDeBureau = new Categorie(3, "PC de Bureau", "tv", Collections.emptyList());
	    	Categorie accessoiresOrdi = new Categorie(4, "Accessoires ordinateurs", "keyboard", Collections.emptyList());

	    	contentProvider.put(1, ordinateurs);
	    	contentProvider.put(2, pcPortable);
	    	contentProvider.put(3, pcDeBureau);
	    	contentProvider.put(4, accessoiresOrdi);

	    	// Téléphonies category and subcategories
	    	Categorie telephonies = new Categorie(5, "Téléphonies", "stay_current_portrait", Arrays.asList(6, 7, 8));
	    	Categorie smartPhone = new Categorie(6, "Smart phone", "smartphone", Collections.emptyList());
	    	Categorie telFixe = new Categorie(7, "Tel Fixe", "phone", Collections.emptyList());
	    	Categorie accessoiresTel = new Categorie(8, "Accessoires téléphone", "watch", Collections.emptyList());

	    	contentProvider.put(5, telephonies);
	    	contentProvider.put(6, smartPhone);
	    	contentProvider.put(7, telFixe);
	    	contentProvider.put(8, accessoiresTel);

	    	// Stockage category and subcategories
	    	Categorie stockage = new Categorie(9, "Stockage", "save", Arrays.asList(10, 11, 12));
	    	Categorie disqueDur = new Categorie(10, "Disque dur", "sd_storage", Collections.emptyList());
	    	Categorie cleUsb = new Categorie(11, "Clé USB", "usb", Collections.emptyList());
	    	Categorie accessoiresStockage = new Categorie(12, "Accessoires stockage", "storage", Collections.emptyList());

	    	contentProvider.put(9, stockage);
	    	contentProvider.put(10, disqueDur);
	    	contentProvider.put(11, cleUsb);
	    	contentProvider.put(12, accessoiresStockage);

	    }
	    
	 // Method to get all categories
	    public List<Categorie> getAllCategories() {
	    	return new ArrayList<>(contentProvider.values());
	    }

	    // Method to get a category by ID
	    public Categorie getCategoryById(int id) {
	        return contentProvider.get(id);
	    }

	 // Method to get subcategories for a category by ID
	    public List<Categorie> getSubcategoriesForCategory(int id) {
	        return contentProvider.get(id)
	                .getSubCategories()
	                .stream()
	                .map(contentProvider::get)
	                .collect(Collectors.toList());
	    }


}
