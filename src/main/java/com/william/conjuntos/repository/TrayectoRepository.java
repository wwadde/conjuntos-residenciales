package com.william.conjuntos.repository;

import com.william.conjuntos.domain.Conjunto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface TrayectoRepository extends R2dbcRepository<Conjunto, Long> {
}
