package com.example.iluminacion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Iluminacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Producto;
    private String Marca;
    private String Descripcion;
    private String Color;
    private Double Precio;
    private Double Peso;
}
