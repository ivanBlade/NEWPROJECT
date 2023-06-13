package com.example.tecnologia.repository;

import com.example.tecnologia.entity.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnologiaRepository extends JpaRepository<Tecnologia, Integer> {
}
