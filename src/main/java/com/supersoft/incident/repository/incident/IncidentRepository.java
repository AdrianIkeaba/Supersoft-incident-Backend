package com.supersoft.incident.repository.incident;

import com.supersoft.incident.model.incident.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IncidentRepository extends JpaRepository<Incident, Integer> {
    List<Incident> findByEmail(String email);
}
