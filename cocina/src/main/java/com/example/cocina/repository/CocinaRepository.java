package com.example.cocina.repository;

import com.example.cocina.entity.Cocina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocinaRepository extends JpaRepository<Cocina, Integer> {
}
