package com.supersoft.incident.model.incident;

public class IncidentStatusResponse {

    public IncidentStatusResponse(String status) {
        this.status = status;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "IncidentStatusResponse{" +
                "status='" + status + '\'' +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
