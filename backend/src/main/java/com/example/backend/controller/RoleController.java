package com.example.backend.controller;


import com.example.backend.entity.Role;
import com.example.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        Role createdRole = roleService.createNewRole(role);
        if (createdRole != null) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/api/roles")
    public ResponseEntity<Void> listAllRoles(){
        return roleService.listAllRoles();
    }

    @GetMapping("/api/roles/{id}")
    public ResponseEntity<Void> listRoleById(){
        return roleService.listRoleById();
    }

    @PutMapping("/api/roles/{id}")
    public ResponseEntity<Void> updateRoleWithId(@RequestBody Role role, @PathVariable Long id){
        return roleService.updateRoleById(role, id);
    }

    @DeleteMapping("/api/role/{id}")
    public ResponseEntity<Void> deleteRoleById(@PathVariable Long id){
        return roleService.deleteRoleById(id);
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
