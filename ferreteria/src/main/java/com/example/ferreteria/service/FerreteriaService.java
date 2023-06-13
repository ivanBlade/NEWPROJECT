package com.example.ferreteria.service;

import com.example.ferreteria.entity.Ferreteria;

import java.util.List;
import java.util.Optional;
public interface FerreteriaService {
    public List<Ferreteria> listar();

    public Ferreteria guardar(Ferreteria ferreteria);

    public Ferreteria actualizar(Ferreteria ferreteria);

    public Optional<Ferreteria> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
