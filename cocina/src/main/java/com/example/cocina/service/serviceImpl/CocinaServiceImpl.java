package com.example.cocina.service.serviceImpl;

import com.example.cocina.entity.Cocina;
import com.example.cocina.repository.CocinaRepository;
import com.example.cocina.service.CocinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CocinaServiceImpl implements CocinaService {
    @Autowired
    private CocinaRepository cocinaRepository;

    @Override
    public List<Cocina> listar() {
        return cocinaRepository.findAll();
    }

    @Override
    public Cocina guardar(Cocina cocina) {
        return cocinaRepository.save(cocina);
    }

    @Override
    public Cocina actualizar(Cocina cocina) {
        return cocinaRepository.save(cocina);
    }

    @Override
    public Optional<Cocina> listarPorId(Integer id) {
        return cocinaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        cocinaRepository.deleteById(id);
    }
}
