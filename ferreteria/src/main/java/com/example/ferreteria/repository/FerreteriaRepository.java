package com.example.ferreteria.repository;

import com.example.ferreteria.entity.Ferreteria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FerreteriaRepository extends JpaRepository<Ferreteria, Integer>  {
}
