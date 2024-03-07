package com.supersoft.incident.controller.login;

import com.supersoft.incident.model.login.Login;
import com.supersoft.incident.repository.login.LoginRepository;
import com.supersoft.incident.model.login.LoginRequest;
import com.supersoft.incident.model.user.User;
import com.supersoft.incident.repository.user.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@RestController
public class AuthController {

    private final UserRepository userRepository;

    private final LoginRepository loginRepository;

    public AuthController(LoginRepository loginRepository, UserRepository userRepository) {
        this.loginRepository = loginRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        // Retrieve user from database
        User user = userRepository.findByEmail(loginRequest.getEmail());

        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User does not exist " + loginRequest.getPassword());
        }

        // Check password
        if (!user.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Incorrect password");
        }

        // Successful login, save login info
        saveLoginInfo(user.getEmail());

        // Return user's first name in response
        return ResponseEntity.ok(user.getFirstname());
    }

    private void saveLoginInfo(String userEmail) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");
        String formattedTime = dateFormat.format(Calendar.getInstance().getTime().getTime());
        // Create a new Login instance
        Login login = new Login();
        login.setUser(userEmail);
        login.setDepartment("client");
        login.setType("client");
        login.setAction("logged in");
        login.setDate(new Date(Calendar.getInstance().getTime().getTime()));
        login.setTime(formattedTime);
        login.setServerIp("127.0.0.1");
        login.setUserAgent("Android");

        // Save login info to the database
        loginRepository.save(login);
    }
}

