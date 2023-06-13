package com.example.automotriz.service.serviceImpl;

import com.example.automotriz.entity.Automotriz;
import com.example.automotriz.repository.AutomotrizRepository;
import com.example.automotriz.service.AutomotrizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutomotrizServiceImpl implements AutomotrizService {
    @Autowired
    private AutomotrizRepository automotrizRepository;

    @Override
    public List<Automotriz> listar() {
        return automotrizRepository.findAll();
    }

    @Override
    public Automotriz guardar(Automotriz automotriz) {
        return automotrizRepository.save(automotriz);
    }

    @Override
    public Automotriz actualizar(Automotriz automotriz) {
        return automotrizRepository.save(automotriz);
    }

    @Override
    public Optional<Automotriz> listarPorId(Integer id) {
        return automotrizRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        automotrizRepository.deleteById(id);
    }
}
