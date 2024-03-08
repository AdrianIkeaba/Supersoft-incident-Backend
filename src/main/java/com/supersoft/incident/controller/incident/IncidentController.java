package com.supersoft.incident.controller.incident;


import com.supersoft.incident.model.incident.Incident;
import com.supersoft.incident.service.incident.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IncidentController {

    @Autowired
    private IncidentService incidentService;

    @PostMapping("/create-incident")
    public ResponseEntity<String> createIncident(@RequestBody Incident incident) {
        try {
            incidentService.createIncident(incident);
            return ResponseEntity.status(HttpStatus.CREATED).body("Incident Created Successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error creating Incident");
        }
    }

    @GetMapping("/view-incidents/{email}")
    public ResponseEntity<List<Incident>> getIncidentsByEmail(@PathVariable String email) {
        List<Incident> incidents = incidentService.getAllIncidents(email);
        return new ResponseEntity<>(incidents, HttpStatus.OK);
    }

    @GetMapping("/count-incidents/{email}")
    public int countIncidentsByEmail(@PathVariable String email) {
        return incidentService.countIncidentsByEmail(email);
    }
}