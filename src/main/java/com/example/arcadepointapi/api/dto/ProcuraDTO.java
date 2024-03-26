package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Procura;
import com.example.arcadepointapi.model.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProcuraDTO {

    private Long id;
    private Float valorAprox;
    private Long idProduto;

    public static ProcuraDTO create(Procura procura) {
        ModelMapper modelMapper = new ModelMapper();
        ProcuraDTO dto = modelMapper.map(procura, ProcuraDTO.class);
        dto.valorAprox = procura.getValorAprox();
        return dto;
    }
}