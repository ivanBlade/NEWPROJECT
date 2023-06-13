package com.example.herramienta.service.serviceImpl;

import com.example.herramienta.entity.Herramienta;
import com.example.herramienta.repository.HerramientaRepository;
import com.example.herramienta.service.HerramientaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HerramientaServiceImpl implements HerramientaService {
    @Autowired
    private HerramientaRepository herramientaRepository;

    @Override
    public List<Herramienta> listar() {
        return herramientaRepository.findAll();
    }

    @Override
    public Herramienta guardar(Herramienta herramienta) {
        return herramientaRepository.save(herramienta);
    }

    @Override
    public Herramienta actualizar(Herramienta herramienta) {
        return herramientaRepository.save(herramienta);
    }

    @Override
    public Optional<Herramienta> listarPorId(Integer id) {
        return herramientaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        herramientaRepository.deleteById(id);
    }
}
