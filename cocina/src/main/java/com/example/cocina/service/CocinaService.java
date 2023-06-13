package com.example.cocina.service;

import com.example.cocina.entity.Cocina;

import java.util.List;
import java.util.Optional;
public interface CocinaService {
    public List<Cocina> listar();

    public Cocina guardar(Cocina cocina);

    public Cocina actualizar(Cocina cocina);

    public Optional<Cocina> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
