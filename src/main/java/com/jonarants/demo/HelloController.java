package com.jonarants.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        System.out.println("Hitting root path");
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/test") 
    public String test() {
        System.out.println("Hitting test path");
        return "Test from path test";
    }

    @GetMapping({"/v1/testing"})
    public String multiPathEndpoint() {
        System.out.println("Hitting v1 testing");
        return "Testing from SpringBoot";
    }
}