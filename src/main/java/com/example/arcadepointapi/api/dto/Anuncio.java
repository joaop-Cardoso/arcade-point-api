package com.example.arcadepointapi.api.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Anuncio {

    private Long id;

    private Float valor;

    private Produto produto;
}