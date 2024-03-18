package com.supersoft.incident.controller.forgotpassword;


import com.supersoft.incident.model.forgotpassword.ForgotPassword;
import com.supersoft.incident.model.user.User;
import com.supersoft.incident.repository.forgotpassword.ForgotPasswordRepository;
import com.supersoft.incident.repository.user.UserRepository;
import com.supersoft.incident.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Calendar;

@RestController
public class ForgotPasswordController {

    @Autowired
    private EmailSenderService emailSenderService;

    private final UserRepository userRepository;
    private final ForgotPasswordRepository forgotPasswordRepository;

    public ForgotPasswordController(UserRepository userRepository , ForgotPasswordRepository forgotPasswordRepository) {
        this.userRepository = userRepository;
        this.forgotPasswordRepository = forgotPasswordRepository;
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<String> forgotPassword(@RequestBody ForgotPassword forgotPassword) {
        User user = userRepository.findByEmail(forgotPassword.getEmail());

        //Check if user exists
        if (user == null) {
            return ResponseEntity.status(404).body("");
        }

        sendMail(forgotPassword.getEmail(), forgotPassword.getPassword(), forgotPassword.getFirstname(), forgotPassword.getDate());
        return ResponseEntity.status(200).body("");

    }

    private void sendMail(String email, String password, String firstname, String date) {
        ForgotPassword forgotPassword = new ForgotPassword();

        forgotPassword.setDate(date);
        forgotPassword.setEmail(email);
        forgotPassword.setFirstname(firstname);
        forgotPassword.setPassword(password);

        emailSenderService.sendEmail(email, "PASSWORD RECOVERY FOR SUPERSOFT INCIDENT PORTAL", "Hello " + firstname +
                ",\n The password you used on the Incident App account is: " + password +
                "\n DO NOT SHARE THIS PASSWORD WITH ANYONE. CONTACT ADMIN IF PASSWORD HAS BEEN COMPROMISED.");

        forgotPasswordRepository.save(forgotPassword);
    }

}
