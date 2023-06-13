package com.example.iluminacion.service;

import com.example.iluminacion.entity.Iluminacion;

import java.util.List;
import java.util.Optional;
public interface IluminacionService {
    public List<Iluminacion> listar();

    public Iluminacion guardar(Iluminacion iluminacion);

    public Iluminacion actualizar(Iluminacion iluminacion);

    public Optional<Iluminacion> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
