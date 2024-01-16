package com.restapi.services.users;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.models.users.User;
import com.restapi.repositories.UserRepository;

import io.micrometer.common.lang.NonNull;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void saveUser(@NonNull User user) {
        User existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser != null) {
            throw new IllegalStateException("Email already taken");
            
        }
        userRepository.save(user);
    }
}
