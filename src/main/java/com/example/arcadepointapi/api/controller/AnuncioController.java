package com.example.arcadepointapi.api.controller;

import com.example.arcadepointapi.api.dto.AnuncioDTO;
import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Produto;
import com.example.arcadepointapi.service.ProdutoService;
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
        Anuncio anuncio = modelMapper.map(dto, Anuncio.class);
        Produto produto = modelMapper.map(dto, Produto.class);
        anuncio.setProduto(produto);

        if (dto.getIdProduto() != null) {
            Optional<Produto> produto1 = ProdutoService.getProdutoById(dto.getIdProduto());
            if (!produto1.isPresent()) {
                anuncio.setProduto(null);
            } else {
                anuncio.setProduto(produto1.get());
            }
        }

        return modelMapper.map(dto, Anuncio.class);

    }

}
