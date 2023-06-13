package com.example.electricidad.service;

import com.example.electricidad.entity.Electricidad;

import java.util.List;
import java.util.Optional;
public interface ElectricidadService {
    public List<Electricidad> listar();

    public Electricidad guardar(Electricidad electricidad);

    public Electricidad actualizar(Electricidad electricidad);

    public Optional<Electricidad> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
