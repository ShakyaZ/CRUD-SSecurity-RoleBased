package com.example.schoolcrud.controller;
import com.example.schoolcrud.entity.Student;
import com.example.schoolcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private StudentService studentService;
    @GetMapping ("/")
    public String home(){
        return "home";
    }

    @GetMapping("/user")
    public String user(){
        return "Welcome user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome admin";
    }

}
