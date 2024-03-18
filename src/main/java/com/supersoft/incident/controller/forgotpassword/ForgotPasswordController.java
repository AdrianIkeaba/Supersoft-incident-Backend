package com.supersoft.incident.controller.forgotpassword;


import com.supersoft.incident.model.forgotpassword.FPResponse;
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

import javax.mail.MessagingException;
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
    public ResponseEntity<FPResponse> forgotPassword(@RequestBody ForgotPassword forgotPassword) {
        User user = userRepository.findByEmail(forgotPassword.getEmail());

        //Check if user exists
        if (user == null) {
            FPResponse fpResponse = new FPResponse("User does not exist");
            return ResponseEntity.status(404).body(fpResponse);
        }

        sendMail(forgotPassword.getEmail(), user.getPassword(), user.getFirstname(), forgotPassword.getDate());
        forgotPassword.setFirstname(user.getFirstname());
        forgotPassword.setPassword(user.getPassword());
        FPResponse fpResponse = new FPResponse("Email sent");
        return ResponseEntity.status(200).body(fpResponse);
    }

    private void sendMail(String email, String password, String firstname, String date) {
        ForgotPassword forgotPassword = new ForgotPassword();

        forgotPassword.setDate(date);
        forgotPassword.setEmail(email);
        forgotPassword.setFirstname(firstname);
        forgotPassword.setPassword(password);

        try {
            emailSenderService.sendEmail(email, "PASSWORD RECOVERY FOR SUPERSOFT INCIDENT PORTAL", "Hello " + firstname +
                    ",\n The password you used on the Incident App account is: " + password +
                    "\n DO NOT SHARE THIS PASSWORD WITH ANYONE. CONTACT ADMIN IF PASSWORD HAS BEEN COMPROMISED.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        forgotPasswordRepository.save(forgotPassword);
    }

}
