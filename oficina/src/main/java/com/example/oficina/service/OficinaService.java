package com.example.oficina.service;

import com.example.oficina.entity.Oficina;

import java.util.List;
import java.util.Optional;
public interface OficinaService {
    public List<Oficina> listar();

    public Oficina guardar(Oficina oficina);

    public Oficina actualizar(Oficina oficina);

    public Optional<Oficina> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
