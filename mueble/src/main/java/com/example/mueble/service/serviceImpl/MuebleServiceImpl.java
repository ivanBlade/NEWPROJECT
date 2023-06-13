package com.example.mueble.service.serviceImpl;

import com.example.mueble.entity.Mueble;
import com.example.mueble.repository.MuebleRepository;
import com.example.mueble.service.MuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MuebleServiceImpl implements MuebleService {
    @Autowired
    private MuebleRepository muebleRepository;

    @Override
    public List<Mueble> listar() {
        return muebleRepository.findAll();
    }

    @Override
    public Mueble guardar(Mueble mueble) {
        return muebleRepository.save(mueble);
    }

    @Override
    public Mueble actualizar(Mueble mueble) {
        return muebleRepository.save(mueble);
    }

    @Override
    public Optional<Mueble> listarPorId(Integer id) {
        return muebleRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        muebleRepository.deleteById(id);
    }
}
