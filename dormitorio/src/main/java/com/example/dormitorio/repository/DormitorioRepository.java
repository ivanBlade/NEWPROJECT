package com.example.dormitorio.repository;

import com.example.dormitorio.entity.Dormitorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DormitorioRepository extends JpaRepository<Dormitorio, Integer> {
}
