package com.jonarants.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @GetMapping({"/v1/testing"})
    public String multiPathEndpoint() {
        return "Testing from SpringBoot";
    }
}