package com.supersoft.incident.model;

public class ICCResponse {
    @Override
    public String toString() {
        return "ICCResponse{" +
                "message='" + message + '\'' +
                '}';
    }

    public ICCResponse(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
