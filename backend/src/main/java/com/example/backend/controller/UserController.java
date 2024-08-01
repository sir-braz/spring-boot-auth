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
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
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
        try{
            if(updateUser != null){
                return new ResponseEntity<>(updateUser, HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/api/user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){
        boolean isDeleted = userService.deleteUser(id).hasBody();
        try{
            if(isDeleted){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
