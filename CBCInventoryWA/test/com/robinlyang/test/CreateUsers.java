/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robinlyang.test;

import com.robinlyang.user.User;
import com.robinlyang.user.UserService;
import com.robinlyang.user.UserType;
import java.sql.SQLException;

/**
 *
 * @author RobinY
 */
public class CreateUsers {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        UserService service = new UserService();
        
        //Creates and persists Users
        User staff = service.createUser("Rob", "Yang", "robiny@gmail.com", 
                "password", UserType.STAFF);
        User clerk = service.createUser("Ana", "ANA-LName", "ana@gmail.com", 
                "password", UserType.STAFF);
        User supervisor = service.createUser("Cam", "CAM-LName", "cam@gmail.com", 
                "password", UserType.STAFF);
        User manager = service.createUser("Ron", "RON-LName", "ron@gmail.com", 
                "password", UserType.STAFF);
        
    }
}
