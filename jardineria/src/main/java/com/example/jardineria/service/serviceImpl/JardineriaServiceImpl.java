package com.example.jardineria.service.serviceImpl;

import com.example.jardineria.entity.Jardineria;
import com.example.jardineria.repository.JardineriaRepository;
import com.example.jardineria.service.JardineriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JardineriaServiceImpl implements JardineriaService {
    @Autowired
    private JardineriaRepository jardineriaRepository;

    @Override
    public List<Jardineria> listar() {
        return jardineriaRepository.findAll();
    }

    @Override
    public Jardineria guardar(Jardineria jardineria) {
        return jardineriaRepository.save(jardineria);
    }

    @Override
    public Jardineria actualizar(Jardineria jardineria) {
        return jardineriaRepository.save(jardineria);
    }

    @Override
    public Optional<Jardineria> listarPorId(Integer id) {
        return jardineriaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        jardineriaRepository.deleteById(id);
    }
}
