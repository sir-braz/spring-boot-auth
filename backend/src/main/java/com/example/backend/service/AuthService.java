package com.example.backend.service;

import com.example.backend.entity.User;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<Void> createNewUser(User user);

    ResponseEntity<Void> siginUser();

    ResponseEntity<Void> updateToken();
}
