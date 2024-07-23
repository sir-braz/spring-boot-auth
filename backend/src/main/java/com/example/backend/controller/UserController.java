package com.example.backend.controller;

import com.example.backend.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<List<User>> listAllUsers(){
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> listUserById(@PathVariable Long id){

    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){

    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<User> deleteUser(){

    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserWithId(@PathVariable Long id, @RequestBody User user){

    }


}
