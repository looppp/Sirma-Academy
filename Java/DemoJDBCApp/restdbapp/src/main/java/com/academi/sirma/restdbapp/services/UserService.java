package com.academi.sirma.restdbapp.services;

import com.academi.sirma.restdbapp.models.User;
import org.springframework.stereotype.Service;
import com.academi.sirma.restdbapp.repositories.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(User user){
        // TODO add some validations rules
        // password encrypting
        userRepository.saveUser(user);
    }
}
