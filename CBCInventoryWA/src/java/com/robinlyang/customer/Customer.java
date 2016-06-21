/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robinlyang.customer;

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
@Table(name = "t_customer")
public class Customer {
    
    //==========================================
    //==               Attributes             ==
    //==========================================
    @Id
    private String customerId;
    @Column(name = "status")
    private boolean status;
    @Column(name = "customer_name", length = 100)
    private String customerName;
    
    //==========================================
    //==               Constructors           ==
    //==========================================
    public Customer(){
        
    }

    public Customer(boolean status, String customerName) {
//        this.customerId = UUID.randomUUID().toString();
        this.status = status;
        this.customerName = customerName;
    }
        
    //==========================================
    //==        Getters and Setters           ==
    //==========================================

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String toString(){
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(customerId);
        sb.append(", status='").append(status).append('\'');
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
}
