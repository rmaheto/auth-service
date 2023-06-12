package com.coemaniac.authservice.service;

import com.coemaniac.authservice.dto.LoginRequest;
import com.coemaniac.authservice.dto.SignupRequest;
import org.springframework.security.core.Authentication;

public interface UserAccountService {
    public boolean isUsernameExists(String username);
    public boolean isEmailExists(String email);
    public void registerUser(SignupRequest userAccount);
    public Authentication authenticateUser(LoginRequest loginDTO);
}
