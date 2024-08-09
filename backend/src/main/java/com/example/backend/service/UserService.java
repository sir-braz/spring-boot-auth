package com.example.backend.service;

import com.example.backend.dto.UserDto;

public interface UserService {
    void saveUser(UserDto userDto);

    boolean authenticateUser(UserDto userDto);
}
