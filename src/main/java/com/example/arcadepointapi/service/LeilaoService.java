package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.exception.RegraNegocioException;
import com.example.arcadepointapi.model.entity.*;
import com.example.arcadepointapi.model.repository.LeilaoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LeilaoService {

    private LeilaoRepository repository;

    public LeilaoService(LeilaoRepository repository) {
        this.repository = repository;
    }

    public List<Leilao> getLeiloes() {
        return repository.findAll();
    }

    public Optional<Leilao> getLeilaoById(Long id) {
        return repository.findById(id);
    }