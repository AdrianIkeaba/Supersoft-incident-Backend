package com.supersoft.incident.service;

import com.supersoft.incident.model.UserRegistration;
import com.supersoft.incident.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    private UserRegistrationRepository repository;

    public UserRegistration saveUser(UserRegistration user) {
        return repository.save(user);
    }
}

