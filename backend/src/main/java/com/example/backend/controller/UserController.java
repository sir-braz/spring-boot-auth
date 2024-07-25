package com.example.backend.controller;

import com.example.backend.entity.User;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<List<User>> listAllUsers() {
        try {
            List<User> users = (List<User>) userService.getAllUsers();
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/user/{id}")
    public ResponseEntity<User> listUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/api/user/{id}")
    public ResponseEntity<User> updateUserWithId(@PathVariable Long id, @RequestBody User user){
        return userService.updateUserId(id, user);
    }

    @DeleteMapping("/api/user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

}
