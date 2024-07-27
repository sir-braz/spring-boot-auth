package com.example.backend.service;

import com.example.backend.entity.Role;
import org.springframework.http.ResponseEntity;

public interface RoleService {
    Role createNewRole(Role role);

    ResponseEntity<Role> listAllRoles();

    ResponseEntity<Role> listRoleById(Long id);

    ResponseEntity<Role> updateRoleById(Role role, Long id);

    ResponseEntity<Role> deleteRoleById(Long id);
}
