package com.william.conjuntos.repository;

import com.william.conjuntos.domain.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
}
