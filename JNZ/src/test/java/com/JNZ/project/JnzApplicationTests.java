package com.JNZ.project;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.JNZ.project.entities.UserEntity;
import com.JNZ.project.repos.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class JnzApplicationTests {
	
	@Test
	void contextLoads() {
	}
	
    @Autowired
    private UserRepository userRepository;

	    @Test
	    public void testCreateUser() {
	    	UserEntity user = new UserEntity(
	    		    "CO123",
	    		    "Doe",
	    		    "John",
	    		    1L,
	    		    true,
	    		    "johndoe",
	    		    "password123",
	    		    2L,
	    		    true,
	    		    false
	    		);

	        // Set user properties here
	        userRepository.save(user);
	    }
	    
	    @Test
	    public void testFindUser() {
	        UserEntity user = userRepository.findById(1L).get();
	        System.out.println(user);
	        
	    }
	    
	    @Test
	    public void testUpdateUser() {
	        // Récupérez un utilisateur existant à partir de la base de données
	        Long userIdToUpdate = 1L;
	        UserEntity userToUpdate = userRepository.findById(userIdToUpdate).orElse(null);

	        if (userToUpdate != null) {
	            // Modifiez les propriétés de l'utilisateur
	            userToUpdate.setNom("NewLastName");
	            userToUpdate.setPrenom("NewFirstName");

	            // Enregistrez les modifications dans la base de données
	            userRepository.save(userToUpdate);

	            // Récupérez à nouveau l'utilisateur pour voir si les modifications ont été enregistrées
	            UserEntity updatedUser = userRepository.findById(userIdToUpdate).orElse(null);
	            if (updatedUser != null) {
	                System.out.println("User updated: " + updatedUser);
	            } else {
	                System.out.println("User not found after update");
	            }
	        } else {
	            System.out.println("User not found");
	        }
	    }
	    
	    @Test
	    public void testDeleteUser() {
	        Long userIdToDelete = 3L;

	        // Vérifiez d'abord si l'utilisateur existe
	        if (userRepository.existsById(userIdToDelete)) {
	            // Supprimez l'utilisateur
	            userRepository.deleteById(userIdToDelete);

	            // Vérifiez si l'utilisateur a été supprimé avec succès
	            if (!userRepository.existsById(userIdToDelete)) {
	                System.out.println("User deleted successfully");
	            } else {
	                System.out.println("User deletion failed");
	            }
	        } else {
	            System.out.println("User not found");
	        }
	    }
	    
	    @Test
	    public void testListAllUsers() {
	        List<UserEntity> allUsers = userRepository.findAll();

	        if (!allUsers.isEmpty()) {
	            for (UserEntity user : allUsers) {
	                System.out.println(user);
	            }
	        } else {
	            System.out.println("No users found");
	        }
	    }

	    
	    @Test
	    public void testFindUserByNom() {
	        List<UserEntity> allUsers = userRepository.findByNomUser("Doe");
	        if (!allUsers.isEmpty()) {
	            for (UserEntity user : allUsers) {
	                System.out.println(user);
	            }
	        } else {
	            System.out.println("No users found");
	        }
	        
	    }
	    
	    @Test
	    public void testFindByNomUserContains ()
	    {
	    List<UserEntity> prods=userRepository.findByNomUserContains("Do");
	    for (UserEntity p : prods)
	    {
	    System.out.println(p);
	    } }
	    
	    @Test
	    public void testfindByNomPrnom()
	    {
	    List<UserEntity> prods = userRepository.findByNomPrenom("Doe", "John");
	    for (UserEntity p : prods)
	    {
	    System.out.println(p);
	    }
	    }
	    
	    @Test
	    public void testfindByOrderByNomUserAsc()
	    {
	    List<UserEntity> prods =
	    userRepository.findByOrderByNomUserAsc();
	    for (UserEntity p : prods)
	    {
	    System.out.println(p);
	    }
	    }

	   

}
