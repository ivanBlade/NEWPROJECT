package com.example.electrohogar.service.serviceImpl;

import com.example.electrohogar.entity.ElectroHogar;
import com.example.electrohogar.repository.ElectroHogarRepository;
import com.example.electrohogar.service.ElectroHogarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElectroHogarServiceImpl implements ElectroHogarService {
    @Autowired
    private ElectroHogarRepository electroHogarRepository;

    @Override
    public List<ElectroHogar> listar() {
        return electroHogarRepository.findAll();
    }

    @Override
    public ElectroHogar guardar(ElectroHogar electroHogar) {
        return electroHogarRepository.save(electroHogar);
    }

    @Override
    public ElectroHogar actualizar(ElectroHogar electroHogar) {
        return electroHogarRepository.save(electroHogar);
    }

    @Override
    public Optional<ElectroHogar> listarPorId(Integer id) {
        return electroHogarRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        electroHogarRepository.deleteById(id);
    }
}
