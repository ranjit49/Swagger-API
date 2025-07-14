package com.at.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import com.at.model.auth.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
