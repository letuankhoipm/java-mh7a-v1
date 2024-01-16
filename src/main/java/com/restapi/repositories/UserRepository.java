package com.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.models.users.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}