package com.example.herramienta.controller;

import com.example.herramienta.entity.Herramienta;
import com.example.herramienta.service.HerramientaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/herramienta")
public class HerramientaController {
    @Autowired
    private HerramientaService herramientaService;

    @GetMapping()
    public ResponseEntity<List<Herramienta>> list() {
        return ResponseEntity.ok().body(herramientaService.listar());
    }

    @PostMapping()
    public ResponseEntity<Herramienta> save(@RequestBody Herramienta herramienta) {
        return ResponseEntity.ok(herramientaService.guardar(herramienta));
    }

    @PutMapping()
    public ResponseEntity<Herramienta> update(@RequestBody Herramienta herramienta) {
        return ResponseEntity.ok(herramientaService.actualizar(herramienta));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Herramienta> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(herramientaService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        herramientaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
