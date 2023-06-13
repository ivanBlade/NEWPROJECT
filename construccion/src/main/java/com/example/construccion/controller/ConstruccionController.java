package com.example.construccion.controller;

import com.example.construccion.entity.Construccion;
import com.example.construccion.service.ConstruccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/construccion")
public class ConstruccionController {
    @Autowired
    private ConstruccionService construccionService;

    @GetMapping()
    public ResponseEntity<List<Construccion>> list() {
        return ResponseEntity.ok().body(construccionService.listar());
    }

    @PostMapping()
    public ResponseEntity<Construccion> save(@RequestBody Construccion construccion) {
        return ResponseEntity.ok(construccionService.guardar(construccion));
    }

    @PutMapping()
    public ResponseEntity<Construccion> update(@RequestBody Construccion construccion) {
        return ResponseEntity.ok(construccionService.actualizar(construccion));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Construccion> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(construccionService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        construccionService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
