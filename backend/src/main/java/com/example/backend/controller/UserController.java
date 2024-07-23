package com.example.backend.controller;

import com.example.backend.entity.User;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/api/users")
    public ResponseEntity<List<User>> listAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity<User> listUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/api/users/{id}")
    public ResponseEntity<User> updateUserWithId(@PathVariable Long id, @RequestBody User user){
        return userService.updateUserId(id, user);
    }

}
