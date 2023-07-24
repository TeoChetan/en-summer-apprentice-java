package com.endava.ProiectEndava.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="users")
public class Users implements Serializable {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "email")
    private String email;

    public Users() {}
    public Integer getUserId() {return userId;}
    public void setUserId(Integer userId) {this.userId = userId;}
    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public Users(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
}
