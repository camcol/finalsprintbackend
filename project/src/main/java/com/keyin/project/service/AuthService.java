package com.keyin.project.service;

import com.keyin.project.model.Student;
import com.keyin.project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private StudentRepository studentRepository;

    public String login(String email, String password) {
        Student student = studentRepository.findByEmail(email);
        if (student == null) {
            return "Email not exists";
        } else if (!student.getPassword().equals(password)) {
            return "Incorrect Email and Password not match";
        } else {
            return "Login Success";
        }
    }
}
