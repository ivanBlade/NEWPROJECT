package com.example.electricidad.service.serviceImpl;

import com.example.electricidad.entity.Electricidad;
import com.example.electricidad.repository.ElectricidadRepository;
import com.example.electricidad.service.ElectricidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElectricidadServiceImpl implements ElectricidadService {
    @Autowired
    private ElectricidadRepository electricidadRepository;

    @Override
    public List<Electricidad> listar() {
        return electricidadRepository.findAll();
    }

    @Override
    public Electricidad guardar(Electricidad electricidad) {
        return electricidadRepository.save(electricidad);
    }

    @Override
    public Electricidad actualizar(Electricidad electricidad) {
        return electricidadRepository.save(electricidad);
    }

    @Override
    public Optional<Electricidad> listarPorId(Integer id) {
        return electricidadRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        electricidadRepository.deleteById(id);
    }
}
