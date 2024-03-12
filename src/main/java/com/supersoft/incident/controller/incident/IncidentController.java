package com.supersoft.incident.controller.incident;


import com.supersoft.incident.model.ICCResponse;
import com.supersoft.incident.model.incident.Incident;
import com.supersoft.incident.model.incident.IncidentCountResponse;
import com.supersoft.incident.model.incident.IncidentStatusResponse;
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
    public ResponseEntity<ICCResponse> createIncident(@RequestBody Incident incident) {
        try {
            incidentService.createIncident(incident);
            ICCResponse iccResponse = new ICCResponse("Incident Created Successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(iccResponse);
        } catch (Exception e) {
            ICCResponse iccResponse = new ICCResponse("Error creating Incident");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(iccResponse);
        }
    }

    @GetMapping("/view-incidents/{email}")
    public ResponseEntity<List<Incident>> getIncidentsByEmail(@PathVariable String email) {
        List<Incident> incidents = incidentService.getAllIncidents(email);
        return new ResponseEntity<>(incidents, HttpStatus.OK);
    }

    @GetMapping("/count-incidents/{email}")
    public ResponseEntity<IncidentCountResponse> countIncidentsByEmail(@PathVariable String email) {
        int count = incidentService.countIncidentsByEmail(email);
        IncidentCountResponse incidentCountResponse = new IncidentCountResponse(count);
        return ResponseEntity.ok(incidentCountResponse);
    }

    @GetMapping("/status/{email}")
    public ResponseEntity<IncidentStatusResponse> findStatusByEmail(@PathVariable String email) {
        String status = incidentService.findStatusByEmail(email);
        IncidentStatusResponse incidentStatusResponse = new IncidentStatusResponse(status);
        return ResponseEntity.ok(incidentStatusResponse);
    }

}