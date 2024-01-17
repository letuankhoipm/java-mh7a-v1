package com.restapi.services.auth;

import org.springframework.stereotype.Service;

import com.restapi.repositories.UserRepository;

@Service
public class AuthService {
    private UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean userExistsByEmail(String email) {
        com.restapi.models.users.User user = userRepository.findByEmail(email);
        return user != null;
    }
}
