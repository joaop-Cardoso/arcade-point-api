package com.example.arcadepointapi.model.entity;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Leilao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Produto produto;
    private Float valorInicial;
    private Float valorIncremental;
    private Date dataInicio;
    private Date dataFim;
    private Time tempoInicio;
    private Time tempoFim;
}