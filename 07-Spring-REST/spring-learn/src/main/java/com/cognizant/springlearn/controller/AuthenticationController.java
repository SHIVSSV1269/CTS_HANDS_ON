package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.security.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * JWT hands-on: authentication service that returns a JWT.
 * POST /authenticate  { "username": "user", "password": "pwd" }
 * (Demo credentials: user / pwd)
 */
@RestController
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    private final JwtUtil jwtUtil;

    public AuthenticationController(JwtUtil jwtUtil) { this.jwtUtil = jwtUtil; }

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody Map<String, String> credentials) {
        LOGGER.info("START authenticate()");
        String username = credentials.get("username");
        String password = credentials.get("password");

        // Simple in-memory check for the demo (replace with real UserDetailsService).
        if ("user".equals(username) && "pwd".equals(password)) {
            String token = jwtUtil.generateToken(username);
            LOGGER.info("END authenticate() - token issued");
            return ResponseEntity.ok(Map.of("token", token));
        }
        return ResponseEntity.status(401).body(Map.of("error", "Invalid credentials"));
    }
}
