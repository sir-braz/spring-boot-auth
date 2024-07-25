package com.example.backend.service;

import com.example.backend.entity.Role;
import org.springframework.http.ResponseEntity;

public interface RoleService {
    ResponseEntity<Void> createNewRole();

    ResponseEntity<Void> listAllRoles();

    ResponseEntity<Void> listRoleById();

    ResponseEntity<Void> updateRoleById(Role role, Long id);

    ResponseEntity<Void> deleteRoleById(Long id);
}
