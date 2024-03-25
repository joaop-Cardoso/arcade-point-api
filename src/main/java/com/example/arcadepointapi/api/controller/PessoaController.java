package com.example.arcadepointapi.api.controller;


import com.example.arcadepointapi.api.dto.PessoaDTO;
import com.example.arcadepointapi.model.entity.Pessoa;
import org.modelmapper.ModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PessoaController {
    public Pessoa converter(PessoaDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Pessoa.class);
    }
}
