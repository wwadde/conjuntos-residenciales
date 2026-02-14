package com.william.conjuntos.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("conjuntos")
@Getter
@Setter
@NoArgsConstructor
public class Conjunto {

    @Id
    private Long id;

    @Column("nombre")
    private String nombre;
}
