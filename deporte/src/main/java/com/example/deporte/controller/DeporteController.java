package com.example.deporte.controller;

import com.example.deporte.entity.Deporte;
import com.example.deporte.service.DeporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deporte")
public class DeporteController {
    @Autowired
    private DeporteService deporteService;

    @GetMapping()
    public ResponseEntity<List<Deporte>> list() {
        return ResponseEntity.ok().body(deporteService.listar());
    }

    @PostMapping()
    public ResponseEntity<Deporte> save(@RequestBody Deporte deporte) {
        return ResponseEntity.ok(deporteService.guardar(deporte));
    }

    @PutMapping()
    public ResponseEntity<Deporte> update(@RequestBody Deporte deporte) {
        return ResponseEntity.ok(deporteService.actualizar(deporte));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Deporte> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(deporteService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        deporteService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
