package com.example.arcadepointapi.model.repository;

import com.example.arcadepointapi.model.entity.Anuncio;
import com.example.arcadepointapi.model.entity.Procura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcuraRepository extends JpaRepository<Procura, Long> {
}
