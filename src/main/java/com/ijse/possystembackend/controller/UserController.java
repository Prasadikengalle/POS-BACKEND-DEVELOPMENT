package com.ijse.possystembackend.controller;

import com.ijse.possystembackend.entity.User;
import com.ijse.possystembackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    ResponseEntity<?> getAllUsers() {

        try{
            return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to get All users");
        }

    }

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody User user){

        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Fail to Create the user");
        }
    }


}
