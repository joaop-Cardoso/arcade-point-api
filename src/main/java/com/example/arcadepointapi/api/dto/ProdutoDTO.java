package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProdutoDTO {

    private Long id;

    private PessoaDTO pessoa;

    private String nome;

    private String descricao;

    private ConservacaoDTO conservacao;

    private MarcaDTO marca;

    private CategoriaProdutosDTO categoria;

    public static ProdutoDTO create(Produto produto) {
        ModelMapper modelMapper = new ModelMapper();
        ProdutoDTO dto = modelMapper.map(produto, ProdutoDTO.class);
        return dto;
    }
}