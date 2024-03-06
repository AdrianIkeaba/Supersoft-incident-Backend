package com.supersoft.incident.repository.login;

import com.supersoft.incident.model.login.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
    // Custom queries as needed
}
