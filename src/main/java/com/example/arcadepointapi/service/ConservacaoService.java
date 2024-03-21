package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.exception.RegraNegocioException;
import com.example.arcadepointapi.model.entity.*;
import com.example.arcadepointapi.model.repository.ConservacaoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ConservacaoService {

    private ConservacaoRepository repository;

    public ConservacaoService(ConservacaoRepository repository) {
        this.repository = repository;
    }

    public List<Conservacao> getConservacoes() {
        return repository.findAll();
    }

    public Optional<Conservacao> getConservacaoById(Long id) {
        return repository.findById(id);
    }