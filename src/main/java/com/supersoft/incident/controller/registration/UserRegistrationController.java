package com.supersoft.incident.controller.registration;

import com.supersoft.incident.model.registration.UserRegistration;
import com.supersoft.incident.model.registration.UserRegistrationResponse;
import com.supersoft.incident.service.registration.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRegistrationController {

    @Autowired
    private UserRegistrationService service;


    @PostMapping("/register")
    public ResponseEntity<UserRegistrationResponse> registerUser(@RequestBody UserRegistration user) {
        try {
            service.saveUser(user);
            UserRegistrationResponse response = new UserRegistrationResponse("User registered successfully!");
            return ResponseEntity.status(HttpStatus.valueOf(200)).body(response);
        } catch (Exception e) {
            UserRegistrationResponse response = new UserRegistrationResponse("Error registering user");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}