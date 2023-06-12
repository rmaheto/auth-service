package com.coemaniac.authservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping("/homepage")
    public ResponseEntity<String> homePage(){
        return ResponseEntity.ok("Welcome to Spring Security Demo!!!");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> adminPage(){
        return ResponseEntity.ok("Welcome to Admin Page!!!");
    }
}
