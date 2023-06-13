package com.example.iluminacion.service.serviceImpl;

import com.example.iluminacion.entity.Iluminacion;
import com.example.iluminacion.repository.IluminacionRepository;
import com.example.iluminacion.service.IluminacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IluminacionServiceImpl implements IluminacionService {
    @Autowired
    private IluminacionRepository iluminacionRepository;

    @Override
    public List<Iluminacion> listar() {
        return iluminacionRepository.findAll();
    }

    @Override
    public Iluminacion guardar(Iluminacion iluminacion) {
        return iluminacionRepository.save(iluminacion);
    }

    @Override
    public Iluminacion actualizar(Iluminacion iluminacion) {
        return iluminacionRepository.save(iluminacion);
    }

    @Override
    public Optional<Iluminacion> listarPorId(Integer id) {
        return iluminacionRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        iluminacionRepository.deleteById(id);
    }
}
