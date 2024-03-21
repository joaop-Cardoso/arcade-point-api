package com.example.arcadepointapi.api.dto;


import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.CategoriaProdutos;
import com.example.arcadepointapi.model.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class CategoriaProdutosDTO {

    private Long id;

    private String categoria;

    public static CategoriaProdutosDTO create(CategoriaProdutos categoriaProdutos) {
        ModelMapper modelMapper = new ModelMapper();
        CategoriaProdutosDTO dto = modelMapper.map(categoriaProdutos, CategoriaProdutosDTO.class);
        dto.categoria = categoriaProdutos.getCategoria();
        return dto;
    }
}