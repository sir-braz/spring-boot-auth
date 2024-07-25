package com.example.backend.service;

import com.example.backend.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<List<User>> getAllUsers();

    ResponseEntity<User> getUserById(Long id);

    ResponseEntity<User> updateUserId(Long id, User user);

    ResponseEntity<User> deleteUser(Long id);
}
