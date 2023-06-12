package com.coemaniac.authservice.service;

import com.coemaniac.authservice.dto.LoginRequest;
import com.coemaniac.authservice.dto.MessageResponse;
import com.coemaniac.authservice.dto.SignupRequest;

public interface AuthService {

    public MessageResponse registerUser(SignupRequest signupRequest);
    public MessageResponse authenticate(LoginRequest loginRequest);
}
