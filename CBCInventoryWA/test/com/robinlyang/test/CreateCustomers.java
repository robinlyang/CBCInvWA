/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robinlyang.test;

import com.robinlyang.customer.Customer;
import com.robinlyang.customer.CustomerService;
import java.sql.SQLException;

/**
 *
 * @author RobinY
 */
public class CreateCustomers {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CustomerService service = new CustomerService();
        
        //Creates and persists Customers
        Customer custo1 = service.createCustomer(true, "Customer one");

        Customer custo2 = service.createCustomer(false, "Customer two");
    }
}
