package com.william.conjuntos.service.impl;

import com.william.conjuntos.domain.User;
import com.william.conjuntos.domain.dto.UserDTO;
import com.william.conjuntos.repository.UserRepository;
import com.william.conjuntos.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private static final String HOLA = "Hola mundo";

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    @Override
    public Flux<User> findAll() {
        log.info("Finding all users {}", HOLA);
        return userRepository.findAll();
    }

    @Override
    public Mono<User> create(UserDTO dto) {
        return userRepository.save(User.builder().username(dto.getUsername()).build());
//        return userRepository.save(modelMapper.map(dto, User.class));
    }
}
