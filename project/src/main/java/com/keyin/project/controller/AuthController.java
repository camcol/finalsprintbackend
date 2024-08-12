package com.keyin.project.controller;

import com.keyin.project.model.Student;
import com.keyin.project.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Student student) {
        String result = authService.login(student.getEmail(), student.getPassword());
        return ResponseEntity.ok(Map.of("message", result));
    }
}
