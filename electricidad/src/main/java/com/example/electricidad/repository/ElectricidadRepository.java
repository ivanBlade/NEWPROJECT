package com.example.electricidad.repository;

import com.example.electricidad.entity.Electricidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectricidadRepository extends JpaRepository<Electricidad, Integer>  {
}
