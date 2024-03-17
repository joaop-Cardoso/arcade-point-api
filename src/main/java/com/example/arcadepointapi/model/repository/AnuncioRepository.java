package com.example.arcadepointapi.model.repository;

import com.example.arcadepointapi.model.entity.Anuncio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnuncioRepository  extends JpaRepository<Anuncio, Long> {
}
