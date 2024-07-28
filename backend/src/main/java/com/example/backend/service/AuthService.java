package com.example.backend.service;

import com.example.backend.dto.AuthRequest;
import com.example.backend.dto.AuthResponse;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<Void> createNewUser(AuthRequest user);

    ResponseEntity<Void> signinUser();

    ResponseEntity<Void> updateToken();

    AuthResponse createNewUser(AuthRequest request);
}
