package com.example.cocina.controller;

import com.example.cocina.entity.Cocina;
import com.example.cocina.service.CocinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cocina")
public class CocinaController {
    @Autowired
    private CocinaService cocinaService;

    @GetMapping()
    public ResponseEntity<List<Cocina>> list() {
        return ResponseEntity.ok().body(cocinaService.listar());
    }

    @PostMapping()
    public ResponseEntity<Cocina> save(@RequestBody Cocina cocina) {
        return ResponseEntity.ok(cocinaService.guardar(cocina));
    }

    @PutMapping()
    public ResponseEntity<Cocina> update(@RequestBody Cocina cocina) {
        return ResponseEntity.ok(cocinaService.actualizar(cocina));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cocina> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(cocinaService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        cocinaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
