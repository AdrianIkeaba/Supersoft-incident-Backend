package com.supersoft.incident.service;

import com.supersoft.incident.model.registration.UserRegistration;
import com.supersoft.incident.repository.registration.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    private UserRegistrationRepository repository;

    public void saveUser(UserRegistration user) {
        repository.save(user);
    }
}
