package com.example.backend.controller;

import com.example.backend.entity.User;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.ResponseEntity;

import java.util.List;


@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/api/users")
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/api/user/{id}")
    public ResponseEntity<User> listUserById(@PathVariable Long id){
       User user = userService.findById(id);
       return ResponseEntity.ok(user);
    }

    @PutMapping("/api/user/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody User updateUser){
        userService.updateUser(id, updateUser);
        return ResponseEntity.ok("Update with Success: " + id);
    }

}
