package com.local_chat.local_chat.controller;

import com.local_chat.local_chat.DTO.response.JwtAuthenticationResponse;
import com.local_chat.local_chat.DTO.request.SignInRequest;
import com.local_chat.local_chat.DTO.request.SignUpRequest;
import com.local_chat.local_chat.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
@RequiredArgsConstructor
public class RegisterController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<JwtAuthenticationResponse> register(
            @RequestBody SignInRequest request
            ) {
        return ResponseEntity.ok(authenticationService.signIn(request));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationResponse> logIn(
            @RequestBody SignUpRequest request
    ) {
        return ResponseEntity.ok(authenticationService.signUp(request));
    }
}
