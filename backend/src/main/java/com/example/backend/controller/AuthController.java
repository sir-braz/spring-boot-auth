package com.example.backend.controller;

import com.example.backend.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/api/auth/register")
    public ResponseEntity<Void> registerUser(@RequestBody User user){

    }
}
