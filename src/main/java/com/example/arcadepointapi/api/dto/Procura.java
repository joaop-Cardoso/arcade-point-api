package com.example.arcadepointapi.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Procura {

    private Long id;
    private Float valorAprox;
    private Produto produto;
}