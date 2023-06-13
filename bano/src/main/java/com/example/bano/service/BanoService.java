package com.example.bano.service;

import com.example.bano.entity.Bano;

import java.util.List;
import java.util.Optional;
public interface BanoService {
    public List<Bano> listar();

    public Bano guardar(Bano bano);

    public Bano actualizar(Bano bano);

    public Optional<Bano> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
