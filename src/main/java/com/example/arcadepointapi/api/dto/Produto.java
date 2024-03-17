package com.example.arcadepointapi.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Produto {

    private Long id;

    private Pessoa pessoa;

    private String nome;

    private String descricao;

    private Conservacao conservacao;

    private Marca marca;

    private CategoriaProdutos categoria;
}