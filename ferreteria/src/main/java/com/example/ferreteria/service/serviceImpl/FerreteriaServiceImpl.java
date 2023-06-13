package com.example.ferreteria.service.serviceImpl;

import com.example.ferreteria.entity.Ferreteria;
import com.example.ferreteria.repository.FerreteriaRepository;
import com.example.ferreteria.service.FerreteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FerreteriaServiceImpl implements FerreteriaService {
    @Autowired
    private FerreteriaRepository ferreteriaRepository;

    @Override
    public List<Ferreteria> listar() {
        return ferreteriaRepository.findAll();
    }

    @Override
    public Ferreteria guardar(Ferreteria ferreteria) {
        return ferreteriaRepository.save(ferreteria);
    }

    @Override
    public Ferreteria actualizar(Ferreteria ferreteria) {
        return ferreteriaRepository.save(ferreteria);
    }

    @Override
    public Optional<Ferreteria> listarPorId(Integer id) {
        return ferreteriaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        ferreteriaRepository.deleteById(id);
    }
}
