package com.supersoft.incident.repository;

import com.supersoft.incident.model.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long> {
}

