package com.example.backend.controller;


import com.example.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoleController {

    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }


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
