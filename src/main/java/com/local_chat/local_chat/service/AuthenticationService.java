package com.local_chat.local_chat.service;

import com.local_chat.local_chat.DTO.response.JwtAuthenticationResponse;
import com.local_chat.local_chat.DTO.request.SignInRequest;
import com.local_chat.local_chat.DTO.request.SignUpRequest;
import com.local_chat.local_chat.util.jwt.JwtService;
import com.local_chat.local_chat.model.User;
import com.local_chat.local_chat.model.UserCred;
import com.local_chat.local_chat.repository.UserCredRepository;
import com.local_chat.local_chat.repository.UserRepository;
import com.local_chat.local_chat.util.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final UserCredRepository userCredRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public JwtAuthenticationResponse signIn(SignInRequest request){
        var user = User.builder()
                .name(request.getName())
                .surname(request.getSurname())
                .build();
        userRepository.save(user);
        var userCred = UserCred.builder()
                .userId(user)
                .username(passwordEncoder.encode(request.getUsername()))
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.ROLE_USER)
                .build();
        userCredRepository.save(userCred);
        var jwtToken = jwtService.generateToken(userCred);
        return JwtAuthenticationResponse.builder()
                .token(jwtToken)
                .build();

    }

    public JwtAuthenticationResponse signUp(SignUpRequest request){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()));
        var userCred = userCredRepository.findByUsername(request.getUsername())
                .orElseThrow(); //TODO EXCEPTION
        var jwtToken = jwtService.generateToken(userCred);
        return JwtAuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

}
