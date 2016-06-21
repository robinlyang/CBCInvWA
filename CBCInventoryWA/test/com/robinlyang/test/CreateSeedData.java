/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robinlyang.test;

import com.robinlyang.customer.Customer;
import com.robinlyang.customer.CustomerService;
import com.robinlyang.user.User;
import com.robinlyang.user.UserService;
import com.robinlyang.user.UserType;
import com.robinlyang.vendor.Vendor;
import com.robinlyang.vendor.VendorService;
import java.sql.SQLException;

/**
 *
 * @author RobinY
 */
public class CreateSeedData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
                        
        //Creates and persists Users
        UserService userService = new UserService();
        User staff = userService.createUser("Rob", "Yang", "robiny@gmail.com", 
                "password", UserType.STAFF);
        User clerk = userService.createUser("Ana", "ANA-LName", "ana@gmail.com", 
                "password", UserType.CLERK);
        User supervisor = userService.createUser("Cam", "CAM-LName", "cam@gmail.com", 
                "password", UserType.SUPERVISOR);
        User manager = userService.createUser("Ron", "RON-LName", "ron@gmail.com", 
                "password", UserType.MANAGER);
        
        //Creates and persists Customers
        CustomerService customerService = new CustomerService();
        Customer custo1 = customerService.createCustomer(true, "Customer one");
        Customer custo2 = customerService.createCustomer(false, "Customer two");
        
        //Creates and persists Vendors
        VendorService vendorService = new VendorService();
        Vendor vendo1 = vendorService.createVendor(true, "Vendor one");
        Vendor vendo2 = vendorService.createVendor(true, "Vendor two");
        
        //Find user
        staff = userService.findUser(staff.getUserId());
        System.out.println("User Found: " + staff);
        
        
    }
}
