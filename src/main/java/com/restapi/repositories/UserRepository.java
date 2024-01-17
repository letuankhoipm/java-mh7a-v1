package com.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.models.users.User;

import io.micrometer.common.lang.NonNull;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    User findById(@NonNull long id);
}