package com.example.dormitorio.service.serviceImpl;

import com.example.dormitorio.entity.Dormitorio;
import com.example.dormitorio.repository.DormitorioRepository;
import com.example.dormitorio.service.DormitorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DormitorioServiceImpl implements DormitorioService {
    @Autowired
    private DormitorioRepository dormitorioRepository;

    @Override
    public List<Dormitorio> listar() {
        return dormitorioRepository.findAll();
    }

    @Override
    public Dormitorio guardar(Dormitorio dormitorio) {
        return dormitorioRepository.save(dormitorio);
    }

    @Override
    public Dormitorio actualizar(Dormitorio dormitorio) {
        return dormitorioRepository.save(dormitorio);
    }

    @Override
    public Optional<Dormitorio> listarPorId(Integer id) {
        return dormitorioRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        dormitorioRepository.deleteById(id);
    }
}
