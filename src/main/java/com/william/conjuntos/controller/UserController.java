package com.william.conjuntos.controller;


import com.william.conjuntos.domain.User;
import com.william.conjuntos.domain.dto.UserDTO;
import com.william.conjuntos.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;


    @GetMapping
    public Flux<User> getUsers() {
        return userService.findAll();
    }

    @PostMapping
    public Mono<User> createUser(@RequestBody UserDTO dto) {
        return userService.create(dto);
    }
}
