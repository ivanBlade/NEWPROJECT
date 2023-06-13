package com.example.automotriz.service;

import com.example.automotriz.entity.Automotriz;

import java.util.List;
import java.util.Optional;
public interface AutomotrizService {
    public List<Automotriz> listar();

    public Automotriz guardar(Automotriz automotriz);

    public Automotriz actualizar(Automotriz automotriz);

    public Optional<Automotriz> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
