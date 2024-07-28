package com.example.backend.service;

import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<Void> createNewUser(AuthRequest user);

    ResponseEntity<Void> signinUser();

    ResponseEntity<Void> updateToken();
}
