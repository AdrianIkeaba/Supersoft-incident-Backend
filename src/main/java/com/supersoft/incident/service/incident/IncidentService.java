package com.supersoft.incident.service.incident;

import com.supersoft.incident.model.incident.Incident;
import com.supersoft.incident.repository.incident.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentService {

    @Autowired
    private IncidentRepository incidentRepository;

    public void createIncident(Incident incident) {
        incidentRepository.save(incident);
    }

    public List<Incident> getAllIncidents(String email) {
        return incidentRepository.findByEmail(email);
    }

    public int countIncidentsByEmail(String email) {
        return incidentRepository.countByEmail(email);
    }

    public String findStatusByEmail(String email) {
        return incidentRepository.findStatusByEmail(email);
    }

}
