package com.example.backend.service;

import com.example.backend.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    void updateUser(Long id, User updateUser);
}
