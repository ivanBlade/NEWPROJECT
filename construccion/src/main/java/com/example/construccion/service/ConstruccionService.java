package com.example.construccion.service;

import com.example.construccion.entity.Construccion;

import java.util.List;
import java.util.Optional;
public interface ConstruccionService {
    public List<Construccion> listar();

    public Construccion guardar(Construccion construccion);

    public Construccion actualizar(Construccion construccion);

    public Optional<Construccion> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
