package com.example.backend.controller;

import com.example.backend.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public ResponseEntity<List<User>> listAllUsers(){
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity<User> listUserById(@PathVariable Long id){

    }

    @PutMapping("/api/users/{id}")
    public ResponseEntity<User> updateUserWithId(@PathVariable Long id, @RequestBody User user){

    }

    @DeleteMapping("/api/users/{id}")
    public ResponseEntity<User> deleteUser(){

    }




}
