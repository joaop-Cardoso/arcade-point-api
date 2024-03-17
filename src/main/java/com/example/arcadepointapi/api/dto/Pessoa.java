package com.example.arcadepointapi.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pessoa {

    private Long id;
    private boolean adm;
    private String cpf;
    private String nome;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private Telefone telefone;
    private Localidade localidade;
}