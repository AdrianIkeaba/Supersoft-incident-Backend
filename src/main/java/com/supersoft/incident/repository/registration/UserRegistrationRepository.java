package com.supersoft.incident.repository.registration;

import com.supersoft.incident.model.registration.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long> {
}

