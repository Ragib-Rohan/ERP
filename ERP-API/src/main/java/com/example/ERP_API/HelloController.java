package com.example.ERP_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "ERP-API is running";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
