package com.supersoft.incident.model.forgotpassword;

public class FPResponse {

    private String message;

    @Override
    public String toString() {
        return "FPResponse{" +
                "message='" + message + '\'' +
                '}';
    }

    public FPResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
