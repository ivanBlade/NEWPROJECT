package com.example.pintura.service;

import com.example.pintura.entity.Pintura;

import java.util.List;
import java.util.Optional;
public interface PinturaService {
    public List<Pintura> listar();

    public Pintura guardar(Pintura pintura);

    public Pintura actualizar(Pintura pintura);

    public Optional<Pintura> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
