package com.example.dormitorio.service;

import com.example.dormitorio.entity.Dormitorio;

import java.util.List;
import java.util.Optional;
public interface DormitorioService {
    public List<Dormitorio> listar();

    public Dormitorio guardar(Dormitorio dormitorio);

    public Dormitorio actualizar(Dormitorio dormitorio);

    public Optional<Dormitorio> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
