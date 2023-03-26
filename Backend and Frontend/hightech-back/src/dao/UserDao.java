package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import model.User;

public enum UserDao {
    instance;

    private Map<Integer, User> contentProvider = new HashMap<>();
    private int nextId = 1;


    private UserDao(){

    	 // Mock data
        User user1 = new User(1, "Doe", "John", "john.doe@example.com", "123 Main St", "johndoe", "password", false);
        User user2 = new User(2, "Smith", "Jane", "jane.smith@example.com", "456 High St", "janesmith", "password", true);
        User user3 = new User(3, "Johnson", "Bob", "bob.johnson@example.com", "789 Maple Ave", "bobjohnson", "password", false);
        User user4 = new User(4, "Omar", "EL FACHATI", "omar@example.com", "789 Maple Ave", "admin", "admin", true);
        User user5 = new User(5, "Bob", "ALICE", "omar@example.com", "789 Maple Ave", "user", "user", false);

        // Populate the contentProvider map with mock User objects
        contentProvider.put(user1.getId(), user1);
        contentProvider.put(user2.getId(), user2);
        contentProvider.put(user3.getId(), user3);
        contentProvider.put(user4.getId(), user4);
        contentProvider.put(user5.getId(), user5);

    }
 // CREATE operation
    public User create(User user) {
        // Assign the next available ID to the new User object
        user.setId(nextId++);
        
        // Add the new User object to the contentProvider map
        contentProvider.put(user.getId(), user);
        
        // Return the new User object
        return user;
    }
    
    // READ operation
    public User getById(int id) {
        // Retrieve the User object from the contentProvider map by its ID
        return contentProvider.get(id);
    }
    
    // READ operation
    public List<User> getAll() {
        // Retrieve all User objects from the contentProvider map
        return new ArrayList<>(contentProvider.values());
    }
    
    // UPDATE operation
    public User update(User user) {
        // Retrieve the existing User object from the contentProvider map by its ID
        User existingUser = contentProvider.get(user.getId());
        
        // Update the properties of the existing User object with the values from the new User object
        existingUser.setNom(user.getNom());
        existingUser.setPrenom(user.getPrenom());
        existingUser.setMail(user.getMail());
        existingUser.setAdresse(user.getAdresse());
        existingUser.setUsername(user.getUsername());
        existingUser.setMotDePasse(user.getMotDePasse());
        existingUser.setAdmin(user.isAdmin());
        
        // Return the updated User object
        return existingUser;
    }
    
    // DELETE operation
    public void delete(int id) {
        // Remove the User object from the contentProvider map by its ID
        contentProvider.remove(id);
    }
    
    
    public boolean isAdmin(int id) {
        User user = getById(id);
        return user != null && user.isAdmin();
    }
    
    public User getUserByCredentials(String username, String password) {
        for (User user : contentProvider.values()) {
            if (user.getUsername().equals(username) && user.getMotDePasse().equals(password)) {
                return user; // username and password match
            }
        }
        return null; // username or password is incorrect
    }

}