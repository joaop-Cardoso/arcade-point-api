package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Marca;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MarcaDTO {

    private Long id;

    private String nome;

    public static MarcaDTO create(Marca marca) {
        ModelMapper modelMapper = new ModelMapper();
        MarcaDTO dto = modelMapper.map(marca, MarcaDTO.class);
        dto.nome = marca.getNome();
        return dto;
    }
}