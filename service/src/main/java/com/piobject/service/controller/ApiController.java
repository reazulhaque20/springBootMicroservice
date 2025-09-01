package com.piobject.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class ApiController {

    @GetMapping("/greetings")
    public ResponseEntity<String> getGreetings(){
        return ResponseEntity.status(HttpStatus.OK).body("Greetings From Service 1.");
    }
}
