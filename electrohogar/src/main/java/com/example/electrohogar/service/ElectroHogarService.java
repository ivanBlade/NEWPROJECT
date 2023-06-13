package com.example.electrohogar.service;

import com.example.electrohogar.entity.ElectroHogar;

import java.util.List;
import java.util.Optional;
public interface ElectroHogarService {
    public List<ElectroHogar> listar();

    public ElectroHogar guardar(ElectroHogar electroHogar);

    public ElectroHogar actualizar(ElectroHogar electroHogar);

    public Optional<ElectroHogar> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
