package com.example.arcadepointapi.api.controller;

import com.example.arcadepointapi.api.dto.LocalidadeDTO;
import com.example.arcadepointapi.model.entity.Localidade;
import org.modelmapper.ModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class LocalidadeController {
    public Localidade converter(LocalidadeDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Localidade.class);
    }
}
