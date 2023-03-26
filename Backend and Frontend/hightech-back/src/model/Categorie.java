package model;
import java.util.List;

public class Categorie {
    private int id;
    private String name;
    private String icon;
    private List<Integer> subCategories;

    public Categorie() {       
    }
    
    public Categorie(int id, String name, String icon, List<Integer> subCategories) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.subCategories = subCategories;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public List<Integer> getSubCategories() {
        return subCategories;
    }

    // optional setters if needed
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setSubCategories(List<Integer> subCategories) {
        this.subCategories = subCategories;
    }
}
