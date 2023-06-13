package com.example.tecnologia.service.serviceImpl;

import com.example.tecnologia.entity.Tecnologia;
import com.example.tecnologia.repository.TecnologiaRepository;
import com.example.tecnologia.service.TecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnologiaServiceImpl implements TecnologiaService {
    @Autowired
    private TecnologiaRepository tecnologiaRepository;

    @Override
    public List<Tecnologia> listar() {
        return tecnologiaRepository.findAll();
    }

    @Override
    public Tecnologia guardar(Tecnologia tecnologia) {
        return tecnologiaRepository.save(tecnologia);
    }

    @Override
    public Tecnologia actualizar(Tecnologia tecnologia) {
        return tecnologiaRepository.save(tecnologia);
    }

    @Override
    public Optional<Tecnologia> listarPorId(Integer id) {
        return tecnologiaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        tecnologiaRepository.deleteById(id);
    }
}
