package com.example.oficina.service.serviceImpl;

import com.example.oficina.entity.Oficina;
import com.example.oficina.repository.OficinaRepository;
import com.example.oficina.service.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OficinaServiceImpl implements OficinaService {
    @Autowired
    private OficinaRepository oficinaRepository;

    @Override
    public List<Oficina> listar() {
        return oficinaRepository.findAll();
    }

    @Override
    public Oficina guardar(Oficina oficina) {
        return oficinaRepository.save(oficina);
    }

    @Override
    public Oficina actualizar(Oficina oficina) {
        return oficinaRepository.save(oficina);
    }

    @Override
    public Optional<Oficina> listarPorId(Integer id) {
        return oficinaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        oficinaRepository.deleteById(id);
    }
}
