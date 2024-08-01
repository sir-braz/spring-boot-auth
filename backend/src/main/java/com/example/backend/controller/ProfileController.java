package com.example.backend.controller;


import com.example.backend.entity.User;
import com.example.backend.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

   private final ProfileService profileService;

   @Autowired
   public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
   }

    @GetMapping("/list-user-profile")
    public ResponseEntity<User> getUserProfule(){
       User userProfile = profileService.getUserProfile();
       return ResponseEntity.ok(userProfile);
    }
}
