package com.example.springapprunnerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/")
    public String currentStage() {
        final String env = "ENV";
        String getenv = System.getenv(env);
    
        System.out.println("getenv = " + getenv);
    
        return "Current Stage: " + getenv;
    }
}