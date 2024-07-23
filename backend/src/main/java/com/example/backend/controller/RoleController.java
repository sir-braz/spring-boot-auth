package com.example.backend.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @PostMapping("/api/roles")
    public ResponseEntity<Void> createRole(){

    }

    @GetMapping("/api/roles")
    public ResponseEntity<Void> listAllRoles(){

    }

    @GetMapping("/api/roles/{id}")
    public ResponseEntity<Void> listRoleById(){

    }

    @PutMapping("/api/roles/{id}")
    public ResponseEntity<Void> updateRoleWithId(){

    }


}
