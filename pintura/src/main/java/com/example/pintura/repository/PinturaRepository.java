package com.example.pintura.repository;

import com.example.pintura.entity.Pintura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PinturaRepository extends JpaRepository<Pintura, Integer>  {
}
