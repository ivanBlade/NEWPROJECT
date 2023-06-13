package com.example.jardineria.service;

import com.example.jardineria.entity.Jardineria;

import java.util.List;
import java.util.Optional;
public interface JardineriaService {
    public List<Jardineria> listar();

    public Jardineria guardar(Jardineria jardineria);

    public Jardineria actualizar(Jardineria jardineria);

    public Optional<Jardineria> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
