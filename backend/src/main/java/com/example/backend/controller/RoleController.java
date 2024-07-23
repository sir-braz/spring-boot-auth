package com.example.backend.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoleController {

    @PostMapping("/api/roles")
    public ResponseEntity<Void> createRole(){
        return null;
    }

    @GetMapping("/api/roles")
    public ResponseEntity<Void> listAllRoles(){
        return null;
    }

    @GetMapping("/api/roles/{id}")
    public ResponseEntity<Void> listRoleById(){
        return null;
    }

    @PutMapping("/api/roles/{id}")
    public ResponseEntity<Void> updateRoleWithId(){
        return null;
    }

    @DeleteMapping("/api/role/{id}")
    public ResponseEntity<Void> deleteRoleById(){
        return null;
    }


}
