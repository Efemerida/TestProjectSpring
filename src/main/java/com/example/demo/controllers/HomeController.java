package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/api/hello")
    public ResponseEntity<String> hello(){
        System.out.println("a");
        System.out.println("a");
        return ResponseEntity.ok("Hello");
    }

}
