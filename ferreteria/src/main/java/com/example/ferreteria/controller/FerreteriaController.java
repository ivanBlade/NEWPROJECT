package com.example.ferreteria.controller;

import com.example.ferreteria.entity.Ferreteria;
import com.example.ferreteria.service.FerreteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ferreteria")
public class FerreteriaController {
    @Autowired
    private FerreteriaService ferreteriaService;

    @GetMapping()
    public ResponseEntity<List<Ferreteria>> list() {
        return ResponseEntity.ok().body(ferreteriaService.listar());
    }

    @PostMapping()
    public ResponseEntity<Ferreteria> save(@RequestBody Ferreteria ferreteria) {
        return ResponseEntity.ok(ferreteriaService.guardar(ferreteria));
    }

    @PutMapping()
    public ResponseEntity<Ferreteria> update(@RequestBody Ferreteria ferreteria) {
        return ResponseEntity.ok(ferreteriaService.actualizar(ferreteria));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ferreteria> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(ferreteriaService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        ferreteriaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
