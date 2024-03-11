package com.supersoft.incident.model.login;

public class LoginResponse {
    private String name;

    public LoginResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "name='" + name + '\'' +
                '}';
    }
}
