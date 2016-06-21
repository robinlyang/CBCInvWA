/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robinlyang.user;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author RobinY
 */
public class UserService {
    
    //==========================================
    //==               Attributes             ==
    //==========================================
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("cbcInventory");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();
    
    //==========================================
    //==             Public Methods           ==
    //==========================================
    public User createUser(String firstName, String lastName,
            String email, String password, UserType userType)
    {
        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);
        user.setUserType(userType);
        tx.begin();
        em.persist(user);
        tx.commit();
        return user;
    }
    
    public void removeUser(UUID userId) {
        User user = em.find(User.class, userId);
        if(user != null) {
            tx.begin();
            em.remove(user);
            tx.commit();
        }
    }
    
    public User findUser(UUID userId) {
        return em.find(User.class, userId);
    }
        
    public User updateUser(UUID userId, String firstName, String lastName,
            String email, String password, UserType userType) {
        User user = em.find(User.class, userId);
        if(user != null){
            tx.begin();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setPassword(password);
            user.setUserType(userType);
            tx.commit();
        }
        return user;
    }
}
