package com.example.jardineria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Jardineria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Producto;
    private String Marca;
    private String Modelo;
    private String Descripcion;
    private String Color;
    private String Precio;
    private String Peso;
}
