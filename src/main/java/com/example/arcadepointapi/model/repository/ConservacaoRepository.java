package com.example.arcadepointapi.model.repository;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Conservacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConservacaoRepository extends JpaRepository<Conservacao, Long> {
}
