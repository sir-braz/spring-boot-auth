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
    public ResponseEntity<Role> listAllRoles(){
        try{
            ResponseEntity<Role> listRole = roleService.listAllRoles();
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/roles/{id}")
    public ResponseEntity<Role> listRoleById(@PathVariable Long id){
        try{
            ResponseEntity<Role> listRoleId = roleService.listRoleById(id);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/api/roles/{id}")
    public ResponseEntity<Role> updateRoleWithId(@RequestBody Role role, @PathVariable Long id){
        try{
            ResponseEntity<Role> updateRole = roleService.updateRoleById(role, id);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/api/role/{id}")
    public ResponseEntity<Role> deleteRoleById(@PathVariable Long id){
        try{
            ResponseEntity<Role> deleteRole = roleService.deleteRoleById(id);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
