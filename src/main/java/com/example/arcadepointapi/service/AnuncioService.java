package com.example.arcadepointapi.service;


import com.example.arcadepointapi.model.entity.*;
import com.example.arcadepointapi.model.repository.AnuncioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AnuncioService {

    private AnuncioRepository repository;

    public AnuncioService(AnuncioRepository repository) {
        this.repository = repository;
    }

    public List<Anuncio> getAnuncios() {
        return repository.findAll();
    }

    public Optional<Anuncio> getAnuncioById(Long id) {
        return repository.findById(id);
    }}