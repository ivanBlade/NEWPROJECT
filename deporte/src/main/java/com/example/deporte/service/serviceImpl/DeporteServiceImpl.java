package com.example.deporte.service.serviceImpl;

import com.example.deporte.entity.Deporte;
import com.example.deporte.repository.DeporteRepository;
import com.example.deporte.service.DeporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeporteServiceImpl implements DeporteService {
    @Autowired
    private DeporteRepository deporteRepository;

    @Override
    public List<Deporte> listar() {
        return deporteRepository.findAll();
    }

    @Override
    public Deporte guardar(Deporte deporte) {
        return deporteRepository.save(deporte);
    }

    @Override
    public Deporte actualizar(Deporte deporte) {
        return deporteRepository.save(deporte);
    }

    @Override
    public Optional<Deporte> listarPorId(Integer id) {
        return deporteRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        deporteRepository.deleteById(id);
    }
}
