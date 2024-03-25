package com.example.arcadepointapi.api.controller;

import com.example.arcadepointapi.api.dto.AnuncioDTO;
import com.example.arcadepointapi.model.entity.Anuncio;
import org.modelmapper.ModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnuncioController {
    public Anuncio converter(AnuncioDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Anuncio.class);
    }

}
