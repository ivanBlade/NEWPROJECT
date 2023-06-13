package com.example.tecnologia.service;

import com.example.tecnologia.entity.Tecnologia;

import java.util.List;
import java.util.Optional;
public interface TecnologiaService {
    public List<Tecnologia> listar();

    public Tecnologia guardar(Tecnologia cliente);

    public Tecnologia actualizar(Tecnologia cliente);

    public Optional<Tecnologia> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
