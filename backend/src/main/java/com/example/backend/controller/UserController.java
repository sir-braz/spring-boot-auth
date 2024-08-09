package com.example.backend.controller;

import com.example.backend.dto.UserDto;
import com.example.backend.entity.User;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
        return ResponseEntity.ok("User Registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDto userDto){
        boolean isAuthenticate = userService.authenticateUser(userDto);
        if(isAuthenticate){
            return ResponseEntity.ok("Login sucessful");
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(){
        return ResponseEntity.ok("User logged out successfully");
    }

}
