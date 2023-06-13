package com.example.construccion.service.serviceImpl;

import com.example.construccion.entity.Construccion;
import com.example.construccion.repository.ConstruccionRepository;
import com.example.construccion.service.ConstruccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstruccionServiceImpl implements ConstruccionService {
    @Autowired
    private ConstruccionRepository construccionRepository;

    @Override
    public List<Construccion> listar() {
        return construccionRepository.findAll();
    }

    @Override
    public Construccion guardar(Construccion construccion) {
        return construccionRepository.save(construccion);
    }

    @Override
    public Construccion actualizar(Construccion construccion) {
        return construccionRepository.save(construccion);
    }

    @Override
    public Optional<Construccion> listarPorId(Integer id) {
        return construccionRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        construccionRepository.deleteById(id);
    }
}
