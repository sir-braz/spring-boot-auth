package com.example.backend.controller;

import com.example.backend.entity.User;
import com.example.backend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/api/auth/register")
    public ResponseEntity<Void> registerUser(@RequestBody User user){
        return authService.createNewUser(user);
    }

    @PostMapping("/api/auth/login")
    public ResponseEntity<Void> loginUser(){
        return authService.signinUser();
    }

    @PostMapping("/api/auth/refresh-token")
    public ResponseEntity<Void> refreshToken(){
        return authService.updateToken();
    }
}
