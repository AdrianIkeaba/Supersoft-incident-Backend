package com.supersoft.incident.model.registration;

import jakarta.persistence.*;

@Entity
public class UserRegistrationResponse {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String message;

    public UserRegistrationResponse() {
    }

    public UserRegistrationResponse(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
