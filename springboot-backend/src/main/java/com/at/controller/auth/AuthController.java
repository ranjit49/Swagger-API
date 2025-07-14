package com.at.controller.auth;

import com.at.model.auth.User;
import com.at.repository.auth.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public boolean login(@RequestBody User user) {
        User existing = userRepository.findByUsername(user.getUsername());
        return existing != null && existing.getPassword().equals(user.getPassword());
    }
}
