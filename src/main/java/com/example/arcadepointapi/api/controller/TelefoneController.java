package com.example.arcadepointapi.api.controller;

import com.example.arcadepointapi.api.dto.TelefoneDTO;
import com.example.arcadepointapi.model.entity.Telefone;
import org.modelmapper.ModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TelefoneController {
    public Telefone converter(TelefoneDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Telefone.class);
    }
}
