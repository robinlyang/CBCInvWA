/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robinlyang.customer;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author RobinY
 */
public class CustomerService {
    
    //==========================================
    //==               Attributes             ==
    //==========================================
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("cbcInventory");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();
    
    //==========================================
    //==             Public Methods           ==
    //==========================================
    public Customer createCustomer(boolean status, String customerName){
        Customer customer = new Customer();
        customer.setCustomerId(UUID.randomUUID().toString());
        customer.setStatus(status);
        customer.setCustomerName(customerName);
        tx.begin();
        em.persist(customer);
        tx.commit();
        return customer;
    }
    
    public void removeCustomer(UUID customerId) {
        Customer customer = em.find(Customer.class, customerId);
        if(customer != null) {
            tx.begin();
            em.remove(customer);
            tx.commit();
        }
    }
    
    public Customer findCustomer(UUID customerId) {
        return em.find(Customer.class, customerId);
    }
        
    public Customer updateCustomer(UUID customerId, boolean status,
            String customerName) {
        Customer user = em.find(Customer.class, customerId);
        if(user != null){
            tx.begin();
            user.setStatus(status);
            user.setCustomerName(customerName);
            tx.commit();
        }
        return user;
    }
    
}
