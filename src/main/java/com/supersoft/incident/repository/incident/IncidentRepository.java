package com.supersoft.incident.repository.incident;

import com.supersoft.incident.model.incident.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IncidentRepository extends JpaRepository<Incident, Integer> {
    List<Incident> findByEmail(String email);

    @Query("SELECT COUNT(*) FROM Incident i WHERE i.email = ?1")
    int countByEmail(String email);

    @Query(value = "SELECT status FROM incident WHERE email = ?1 ORDER BY date DESC LIMIT 1", nativeQuery = true)
    String findStatusByEmail(String email);
}
