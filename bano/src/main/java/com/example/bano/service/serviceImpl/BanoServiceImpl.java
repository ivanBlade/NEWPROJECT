package com.example.bano.service.serviceImpl;

import com.example.bano.entity.Bano;
import com.example.bano.repository.BanoRepository;
import com.example.bano.service.BanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BanoServiceImpl implements BanoService {
    @Autowired
    private BanoRepository banoRepository;

    @Override
    public List<Bano> listar() {
        return banoRepository.findAll();
    }

    @Override
    public Bano guardar(Bano bano) {
        return banoRepository.save(bano);
    }

    @Override
    public Bano actualizar(Bano bano) {
        return banoRepository.save(bano);
    }

    @Override
    public Optional<Bano> listarPorId(Integer id) {
        return banoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        banoRepository.deleteById(id);
    }
}
