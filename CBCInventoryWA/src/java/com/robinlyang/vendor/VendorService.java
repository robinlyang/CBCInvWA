/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robinlyang.vendor;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author RobinY
 */
public class VendorService {
    
    //==========================================
    //==               Attributes             ==
    //==========================================
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("cbcInventory");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();
    
    //==========================================
    //==             Public Methods           ==
    //==========================================
    public Vendor createVendor(boolean status, String vendorName) {
        Vendor vendor = new Vendor();
        vendor.setVendorId(UUID.randomUUID().toString());
        vendor.setStatus(status);
        vendor.setVendorName(vendorName);
        tx.begin();
        em.persist(vendor);
        tx.commit();
        return vendor;
    }
    
    public void removeVendor(UUID vendorId) {
        Vendor vendor = em.find(Vendor.class, vendorId);
        if(vendor != null) {
            tx.begin();
            em.remove(vendor);
            tx.commit();
        }
    }
    
    public Vendor updateVendor(UUID vendorId, boolean status,
            String vendorName) {
        Vendor vendor = em.find(Vendor.class, vendorId);
        if(vendor != null){
            tx.begin();
            vendor.setStatus(status);
            vendor.setVendorName(vendorName);
            tx.commit();
        }
        return vendor;
    }
}
