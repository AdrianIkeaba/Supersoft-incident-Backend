package com.supersoft.incident.model.user;


import jakarta.persistence.*;

@Entity
@Table(name = "registration")
public class User {

    @Id
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "passwordconfirmation")
    private String password;

    @Column(name = "firstname")
    private String firstname;

    // Constructors, getters, and setters

    public User() {
    }

    public User(String email, String password, String firstname) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}

