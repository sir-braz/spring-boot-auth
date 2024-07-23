package com.example.backend.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/api/role/{id}")
    public ResponseEntity<Void> deleteRoleById(){

    }


}
