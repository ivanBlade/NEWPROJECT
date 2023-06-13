package com.example.mueble.repository;

import com.example.mueble.entity.Mueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuebleRepository extends JpaRepository<Mueble, Integer> {
}
