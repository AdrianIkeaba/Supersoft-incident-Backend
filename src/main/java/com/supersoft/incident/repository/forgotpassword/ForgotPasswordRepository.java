package com.supersoft.incident.repository.forgotpassword;

import com.supersoft.incident.model.forgotpassword.ForgotPassword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForgotPasswordRepository extends JpaRepository<ForgotPassword, Integer> {
}
