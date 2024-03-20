package com.example.arcadepointapi.api.dto;

import java.sql.Date;
import java.sql.Time;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Leilao;
import org.modelmapper.ModelMapper;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class LeilaoDTO {


    private Long id;
    private ProdutoDTO produto;
    private Float valorInicial;
    private Float valorIncremental;
    private Date dataInicio;
    private Date dataFim;
    private Time tempoInicio;
    private Time tempoFim;

    public static LeilaoDTO create(Leilao leilao) {
        ModelMapper modelMapper = new ModelMapper();
        LeilaoDTO dto = modelMapper.map(leilao, LeilaoDTO.class);
        return dto;
    }
}