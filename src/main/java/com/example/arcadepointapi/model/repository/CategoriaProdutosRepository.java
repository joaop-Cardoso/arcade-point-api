package com.example.arcadepointapi.model.repository;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.CategoriaProdutos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaProdutosRepository extends JpaRepository<CategoriaProdutos, Long> {
}
