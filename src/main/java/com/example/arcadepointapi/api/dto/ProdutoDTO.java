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

    private Long idPessoa;

    private String nome;

    private String descricao;

    private Long idConservacao;

    private Long idMarca;

    private Long idCategoriaProdutos;

    public static ProdutoDTO create(Produto produto) {
        ModelMapper modelMapper = new ModelMapper();
        ProdutoDTO dto = modelMapper.map(produto, ProdutoDTO.class);
        dto.nome = produto.getNome();
        dto.descricao = produto.getDescricao();
        return dto;
    }
}