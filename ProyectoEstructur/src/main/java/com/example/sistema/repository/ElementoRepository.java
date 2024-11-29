package com.example.sistema.repository;

import com.example.sistema.model.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementoRepository extends JpaRepository<Elemento, Long> {
}
