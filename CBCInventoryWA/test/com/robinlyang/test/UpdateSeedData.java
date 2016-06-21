/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robinlyang.test;

import com.robinlyang.user.User;
import com.robinlyang.user.UserService;
import java.sql.SQLException;
import java.util.UUID;

/**
 *
 * @author RobinY
 */
public class UpdateSeedData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Find Users
        UserService userService = new UserService();
        User user = userService.findUser("28c54782-2217-44ec-95a6-1488c2b4416f");
        System.out.println("User Found: " + user);
        
     
    }
}
