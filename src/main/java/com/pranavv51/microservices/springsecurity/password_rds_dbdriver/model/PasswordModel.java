package com.pranavv51.microservices.springsecurity.password_rds_dbdriver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "UserCredentials")
public class PasswordModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UserId")
    private Long id;
    @Column(name = "UserName")
    private String username;
    @Column(name = "UserPassword")
    private String password;
    @Column(name = "UserRoles")
    private String role;

    public PasswordModel(){}

    public PasswordModel(String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {

        String temp = "The read values for a user is:-\n";
        return temp+"PasswordModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
