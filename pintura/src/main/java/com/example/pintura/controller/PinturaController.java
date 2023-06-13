package com.example.pintura.controller;

import com.example.pintura.entity.Pintura;
import com.example.pintura.service.PinturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pintura")
public class PinturaController {
    @Autowired
    private PinturaService pinturaService;

    @GetMapping()
    public ResponseEntity<List<Pintura>> list() {
        return ResponseEntity.ok().body(pinturaService.listar());
    }

    @PostMapping()
    public ResponseEntity<Pintura> save(@RequestBody Pintura pintura) {
        return ResponseEntity.ok(pinturaService.guardar(pintura));
    }

    @PutMapping()
    public ResponseEntity<Pintura> update(@RequestBody Pintura pintura) {
        return ResponseEntity.ok(pinturaService.actualizar(pintura));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pintura> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(pinturaService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        pinturaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
