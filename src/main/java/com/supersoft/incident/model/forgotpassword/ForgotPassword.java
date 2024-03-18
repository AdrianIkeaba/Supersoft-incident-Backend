package com.supersoft.incident.model.forgotpassword;

import jakarta.persistence.*;

@Entity
@Table(name = "forgotpassword")
public class ForgotPassword {

    public ForgotPassword(int id, String firstname, String email, String password) {
        this.id = id;
        this.firstname = firstname;
        this.email = email;
        this.password = password;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "date")
    private String date;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public ForgotPassword() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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
}
