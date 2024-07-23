package com.example.backend.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @PostMapping("/api/roles")
    public ResponseEntity<Void> createRole(){

    }
}
