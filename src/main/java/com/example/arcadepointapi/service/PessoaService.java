package com.example.arcadepointapi.api.dto;

import com.example.arcadepointapi.exception.RegraNegocioException;
import com.example.arcadepointapi.model.entity.*;
import com.example.arcadepointapi.model.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PessoaService {

    private PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> getPessoas() {
        return repository.findAll();
    }

    public Optional<Pessoa> getPessoaById(Long id) {
        return repository.findById(id);
    }