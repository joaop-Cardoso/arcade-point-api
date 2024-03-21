package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.exception.RegraNegocioException;
import com.example.arcadepointapi.model.entity.*;
import com.example.arcadepointapi.model.repository.LocalidadeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LocalidadeService {

    private LocalidadeRepository repository;

    public LocalidadeService(LocalidadeRepository repository) {
        this.repository = repository;
    }

    public List<Localidade> getLocalidades() {
        return repository.findAll();
    }

    public Optional<Localidade> getLocalidadeById(Long id) {
        return repository.findById(id);
    }