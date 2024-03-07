package com.supersoft.incident.repository.casee;

import com.supersoft.incident.model.casee.Case;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CaseRepository extends JpaRepository<Case, Integer> {
    List<Case> findByEmail(String email);
}
