package com.supersoft.incident.model.incident;

public class IncidentCountResponse {
    private int count;

    public IncidentCountResponse(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "IncidentCountResponse{" +
                "count=" + count +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
