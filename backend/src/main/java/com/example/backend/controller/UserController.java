package com.example.backend.controller;

import com.example.backend.entity.User;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.ResponseEntity;

import java.util.List;


@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/api/users")
    public ResponseEntity<List<User>> listAllUsers() {
        try {
            List<User> users = (List<User>) userService.getAllUsers();
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/user/{id}")
    public ResponseEntity<User> listUserById(@PathVariable Long id){
       ResponseEntity<User> responseEntity = userService.getUserById(id);
       try{
           if(responseEntity.getStatusCode() == HttpStatus.OK && responseEntity.getBody() != null){
               return new ResponseEntity<>(responseEntity.getBody(), HttpStatus.OK);
           }else{
               return new ResponseEntity<>(HttpStatus.NOT_FOUND);
           }
       }catch (Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    @PutMapping("/api/user/{id}")
    public ResponseEntity<User> updateUserWithId(@PathVariable Long id, @RequestBody User user){
        User updateUser = userService.updateUserId(id, user).getBody();
        if(updateUser != null){
            return new ResponseEntity<>(updateUser, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/api/user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

    @DeleteMapping("/api/users/{id}")
    public ResponseEntity<User> deleteUser(){
        return null;
    }

}
