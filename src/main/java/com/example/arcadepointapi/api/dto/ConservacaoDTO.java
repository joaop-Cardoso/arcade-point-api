package com.example.arcadepointapi.api.dto;


import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Conservacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ConservacaoDTO {


    private Long id;

    private String estado;

    public static ConservacaoDTO create(Conservacao conservacao) {
        ModelMapper modelMapper = new ModelMapper();
        ConservacaoDTO dto = modelMapper.map(conservacao, ConservacaoDTO.class);
        dto.estado = conservacao.getEstado();
        return dto;
    }
}