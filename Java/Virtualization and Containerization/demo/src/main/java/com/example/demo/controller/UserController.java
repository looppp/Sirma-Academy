package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="test")
    public String test(){
       return "Hello i working fine.";
    }

    @GetMapping(path="users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @PostMapping(path="users")
    public User saveuser(@RequestBody User user){
        return userRepository.save(user);

    }
}
