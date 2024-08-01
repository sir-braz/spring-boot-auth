package com.example.backend.controller;

import com.example.backend.dto.AuthRequest;
import com.example.backend.dto.AuthResponse;
import com.example.backend.entity.User;
import com.example.backend.service.LoginService;
import com.example.backend.utility.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@RequestBody User signUpRequest) {
        User newUser = new User();
        newUser.setUsername(signUpRequest.getUsername());
        newUser.setPassword(signUpRequest.getPassword());
        return null;
    }

    @PostMapping("/signin")
    public ResponseEntity<String> login(@RequestBody User loginRequest){
        User user = userService.findByUsername(loginRequest.getUsername());
        String token = JwtUtil.generateToken(user);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/refresh")
    public ResponseEntity<String> refresh(@RequestBody String refreshToken){
        String newToken = JwtUtil.refreshJwt(refreshToken);
        return ResponseEntity.ok(newToken);
    }

}
