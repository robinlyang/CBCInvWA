/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robinlyang.user;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author RobinY
 */
@Entity
@Table(name = "T_User")
public class User{
    
    //==========================================
    //==               Attributes             ==
    //==========================================
    @Id
    private String userId;
    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(name = "email", length = 150)
    private String email;
    @Column(name = "password", length = 50)
    private String password;
//    @Temporal(TemporalType.DATE)
//    private Date dateofBirth;
    
    @Enumerated(EnumType.STRING)   //Enumeration
    private UserType userType;

    //==========================================
    //==               Constructors           ==
    //==========================================
    public User(){
    }
    
    public User(String firstName, String lastName, String email, String password,
            UserType userType){
//        this.userId = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }
    
    //==========================================
    //==        Getters and Setters           ==
    //==========================================
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    
    public String toString(){
    final StringBuilder sb = new StringBuilder("User{");
    sb.append("id=").append(userId);
    sb.append(", firstName='").append(firstName).append('\'');
    sb.append(", lastName='").append(lastName).append('\'');
    sb.append(", password=").append(password);
    sb.append(", userType='").append(userType).append('\'');
    sb.append('}');
    return sb.toString();
  }
    
        
}
