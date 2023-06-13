package com.example.electricidad.controller;

import com.example.electricidad.entity.Electricidad;
import com.example.electricidad.service.ElectricidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/electricidad")
public class ElectricidadController {
    @Autowired
    private ElectricidadService electricidadService;

    @GetMapping()
    public ResponseEntity<List<Electricidad>> list() {
        return ResponseEntity.ok().body(electricidadService.listar());
    }

    @PostMapping()
    public ResponseEntity<Electricidad> save(@RequestBody Electricidad electricidad) {
        return ResponseEntity.ok(electricidadService.guardar(electricidad));
    }

    @PutMapping()
    public ResponseEntity<Electricidad> update(@RequestBody Electricidad electricidad) {
        return ResponseEntity.ok(electricidadService.actualizar(electricidad));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Electricidad> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(electricidadService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        electricidadService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
