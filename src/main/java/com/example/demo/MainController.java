package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello()
    {
        return  ResponseEntity.ok("HELLOW WORLD RESPONSE FROM CUSTOMER SERVICE");
    }

}


