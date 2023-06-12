package com.coemaniac.authservice.controller;

import com.coemaniac.authservice.dto.LoginRequest;
import com.coemaniac.authservice.dto.MessageResponse;
import com.coemaniac.authservice.dto.SignupRequest;
import com.coemaniac.authservice.service.AuthServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthServiceImpl authService;

    @PostMapping("/signup")
    public ResponseEntity<MessageResponse> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {

        return new ResponseEntity<>(authService.registerUser(signUpRequest),HttpStatus.OK);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<MessageResponse> authenticate(@RequestBody LoginRequest loginRequest){

        MessageResponse response = authService.authenticate(loginRequest);
        if(response!=null){
            return ResponseEntity.ok(response);
        }else{
            return ResponseEntity.status(400).body(new MessageResponse("Failed to authenticate user"));
        }
    }
}
