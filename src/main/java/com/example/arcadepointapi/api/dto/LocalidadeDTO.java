package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Localidade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LocalidadeDTO {

    private Long id;
    private String uf;
    private String cidade;

    public static LocalidadeDTO create(Localidade localidade) {
        ModelMapper modelMapper = new ModelMapper();
        LocalidadeDTO dto = modelMapper.map(localidade, LocalidadeDTO.class);
        dto.uf = localidade.getUf();
        dto.cidade = localidade.getCidade();
        return dto;
    }
}