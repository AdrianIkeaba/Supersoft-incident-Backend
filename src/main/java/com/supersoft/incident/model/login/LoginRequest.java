package com.supersoft.incident.model.login;

public class LoginRequest {

    private String email;
    private String password;
    private String userAgent;

    // Constructors, getters, and setters

    public LoginRequest() {
    }

    public LoginRequest(String email, String password, String userAgent) {
        this.email = email;
        this.password = password;
        this.userAgent = userAgent;
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

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}

