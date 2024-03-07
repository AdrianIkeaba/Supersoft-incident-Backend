package com.supersoft.incident.repository.change;

import com.supersoft.incident.model.change.Change;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChangeRepository  extends JpaRepository<Change, Integer> {

    List<Change> findByEmail(String email);
}
