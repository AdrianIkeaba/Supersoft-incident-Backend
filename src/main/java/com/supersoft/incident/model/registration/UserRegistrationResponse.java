package com.supersoft.incident.model.registration;
public class UserRegistrationResponse {
    private String message;

    @Override
    public String toString() {
        return "UserRegistrationResponse{" +
                "message='" + message + '\'' +
                '}';
    }

    // Constructor, getters, and setters
    public UserRegistrationResponse(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
