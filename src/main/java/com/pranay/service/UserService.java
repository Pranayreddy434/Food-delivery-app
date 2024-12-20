package com.pranay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranay.model.User;
import com.pranay.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to find user by email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Other methods for user operations
    public void saveUser(User user) {
        userRepository.save(user);
    }
}


