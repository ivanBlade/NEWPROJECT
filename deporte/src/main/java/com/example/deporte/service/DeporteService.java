package com.example.deporte.service;

import com.example.deporte.entity.Deporte;

import java.util.List;
import java.util.Optional;
public interface DeporteService {
    public List<Deporte> listar();

    public Deporte guardar(Deporte deporte);

    public Deporte actualizar(Deporte deporte);

    public Optional<Deporte> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
