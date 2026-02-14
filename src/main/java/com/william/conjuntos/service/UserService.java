package com.william.conjuntos.service;

import com.william.conjuntos.domain.User;
import com.william.conjuntos.domain.dto.UserDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Flux<User> findAll();

    Mono<User> create(UserDTO dto);
}
