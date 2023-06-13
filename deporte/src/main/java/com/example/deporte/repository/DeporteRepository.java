package com.example.deporte.repository;

import com.example.deporte.entity.Deporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeporteRepository extends JpaRepository<Deporte, Integer> {
}
