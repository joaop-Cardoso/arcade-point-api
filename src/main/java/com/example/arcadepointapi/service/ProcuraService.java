package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.exception.RegraNegocioException;
import com.example.arcadepointapi.model.entity.*;
import com.example.arcadepointapi.model.repository.ProcuraRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProcuraService {

    private ProcuraRepository repository;

    public ProcuraService(ProcuraRepository repository) {
        this.repository = repository;
    }

    public List<Procura> getProcuras() {
        return repository.findAll();
    }

    public Optional<Procura> getProcuraById(Long id) {
        return repository.findById(id);
    }