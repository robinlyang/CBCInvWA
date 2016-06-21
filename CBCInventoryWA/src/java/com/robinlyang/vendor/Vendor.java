/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robinlyang.vendor;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author RobinY
 */
@Entity
@Table(name = "T_Vendor")
public class Vendor {
    
    //==========================================
    //==               Attributes             ==
    //==========================================
    @Id
    private String vendorId;
    @Column(name = "status")
    private boolean status;
    @Column(name = "vendor_name")
    private String vendorName;
    
    //==========================================
    //==               Constructors           ==
    //==========================================
    public Vendor(){
        
    }

    public Vendor(boolean status, String vendorName) {
        this.vendorId = UUID.randomUUID().toString();
        this.status = status;
        this.vendorName = vendorName;
    }
        
    //==========================================
    //==        Getters and Setters           ==
    //==========================================

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
}
