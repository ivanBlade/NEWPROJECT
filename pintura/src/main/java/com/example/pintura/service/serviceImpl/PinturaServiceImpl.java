package com.example.pintura.service.serviceImpl;

import com.example.pintura.entity.Pintura;
import com.example.pintura.repository.PinturaRepository;
import com.example.pintura.service.PinturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PinturaServiceImpl implements PinturaService {
    @Autowired
    private PinturaRepository pinturaRepository;

    @Override
    public List<Pintura> listar() {
        return pinturaRepository.findAll();
    }

    @Override
    public Pintura guardar(Pintura tecnologia) {
        return pinturaRepository.save(tecnologia);
    }

    @Override
    public Pintura actualizar(Pintura tecnologia) {
        return pinturaRepository.save(tecnologia);
    }

    @Override
    public Optional<Pintura> listarPorId(Integer id) {
        return pinturaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        pinturaRepository.deleteById(id);
    }
}
