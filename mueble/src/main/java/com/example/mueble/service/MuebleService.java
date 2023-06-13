package com.example.mueble.service;

import com.example.mueble.entity.Mueble;

import java.util.List;
import java.util.Optional;
public interface MuebleService {
    public List<Mueble> listar();

    public Mueble guardar(Mueble mueble);

    public Mueble actualizar(Mueble mueble);

    public Optional<Mueble> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
