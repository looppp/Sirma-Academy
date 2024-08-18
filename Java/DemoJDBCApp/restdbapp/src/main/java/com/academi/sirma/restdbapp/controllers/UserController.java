package com.academi.sirma.restdbapp.controllers;

import com.academi.sirma.restdbapp.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.academi.sirma.restdbapp.services.UserService;


@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
        // TODO validate data

        try {
            userService.register(user);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
        return ResponseEntity.ok("Success");
    }

}
