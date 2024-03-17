package com.example.arcadepointapi.model.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pessoa pessoa;

    private String nome;

    private String descricao;

    @ManyToOne
    private Conservacao conservacao;

    @ManyToOne
    private  Marca marca;

    @ManyToOne
    private  CategoriaProdutos categoria;
}