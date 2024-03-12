package com.supersoft.incident.model.login;

public class LoginResponse {
    private String name;

    private String organisation;

    private String department;

    private String status;

    public LoginResponse(String name, String organisation, String department, String status) {
        this.name = name;
        this.organisation = organisation;
        this.department = department;
        this.status = status;
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
                ", organisation='" + organisation + '\'' +
                '}';
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
