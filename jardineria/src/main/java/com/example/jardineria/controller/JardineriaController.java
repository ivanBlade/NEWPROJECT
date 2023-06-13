package com.example.jardineria.controller;

import com.example.jardineria.entity.Jardineria;
import com.example.jardineria.service.JardineriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jardineria")
public class JardineriaController {
    @Autowired
    private JardineriaService jardineriaService;

    @GetMapping()
    public ResponseEntity<List<Jardineria>> list() {
        return ResponseEntity.ok().body(jardineriaService.listar());
    }

    @PostMapping()
    public ResponseEntity<Jardineria> save(@RequestBody Jardineria jardineria) {
        return ResponseEntity.ok(jardineriaService.guardar(jardineria));
    }

    @PutMapping()
    public ResponseEntity<Jardineria> update(@RequestBody Jardineria jardineria) {
        return ResponseEntity.ok(jardineriaService.actualizar(jardineria));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jardineria> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(jardineriaService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        jardineriaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
