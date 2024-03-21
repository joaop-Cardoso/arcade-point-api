package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.model.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProdutoDTO {

    private Long id;

    private Pessoa pessoa;

    private String nome;

    private String descricao;

    private Conservacao conservacao;

    private Marca marca;

    private CategoriaProdutos categoria;

    public static ProdutoDTO create(Produto produto) {
        ModelMapper modelMapper = new ModelMapper();
        ProdutoDTO dto = modelMapper.map(produto, ProdutoDTO.class);
        dto.pessoa = produto.getPessoa();
        dto.nome = produto.getNome();
        dto.descricao = produto.getDescricao();
        dto.conservacao = produto.getConservacao();
        dto.marca = produto.getMarca();
        dto.categoria = produto.getCategoria();
        return dto;
    }
}