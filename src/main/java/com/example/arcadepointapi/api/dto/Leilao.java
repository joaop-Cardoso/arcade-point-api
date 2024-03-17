package com.example.arcadepointapi.api.dto;

import java.sql.Date;
import java.sql.Time;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Leilao {


    private Long id;
    private Produto produto;
    private Float valorInicial;
    private Float valorIncremental;
    private Date dataInicio;
    private Date dataFim;
    private Time tempoInicio;
    private Time tempoFim;
}