package com.jsp.SpringSecurity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserAdminController {

    @GetMapping("/admin")
    public ResponseEntity<String> adminController(){
        return ResponseEntity.ok("ADMIN Controller");
    }

    @GetMapping("/user")
    public ResponseEntity<String> userController(){
        return ResponseEntity.ok("USER Controller");
    }
}
