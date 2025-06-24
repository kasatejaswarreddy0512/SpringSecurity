package com.jsp.SpringSecurity.controller;

import com.jsp.SpringSecurity.Dto.JwtAuthenticationResponse;
import com.jsp.SpringSecurity.Dto.SignInRequest;
import com.jsp.SpringSecurity.Dto.SignupRequest;
import com.jsp.SpringSecurity.entity.User;
import com.jsp.SpringSecurity.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignupRequest signupRequest){
        return ResponseEntity.ok(authenticationService.signUp(signupRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signIn(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signin(signInRequest));
    }
}
