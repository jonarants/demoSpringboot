package com.jonarants.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @GetMapping({"/health", "/v1/ailen"})
    public String multiPathEndpoint() {
        return "Funcionando perfectamente, amo y señor del springboot que no ceno hamburguesa ayer por wey.";
    }
}