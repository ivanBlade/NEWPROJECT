package com.example.herramienta.service;

import com.example.herramienta.entity.Herramienta;

import java.util.List;
import java.util.Optional;
public interface HerramientaService {
    public List<Herramienta> listar();

    public Herramienta guardar(Herramienta herramienta);

    public Herramienta actualizar(Herramienta herramienta);

    public Optional<Herramienta> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
