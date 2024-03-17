package com.example.arcadepointapi.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Localidade {

    private Long id;
    private String uf;
    private String cidade;
}