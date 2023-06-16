package com.example.automotriz.controller;

import com.example.automotriz.entity.Automotriz;
import com.example.automotriz.service.AutomotrizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/automotriz")
public class AutomotrizController {
    @Autowired
    private AutomotrizService automotrizService;

    @GetMapping()
    public ResponseEntity<List<Automotriz>> list() {
        return ResponseEntity.ok().body(automotrizService.listar());
    }

    @PostMapping()
    public ResponseEntity<Automotriz> save(@RequestBody Automotriz automotriz) {
        return ResponseEntity.ok(automotrizService.guardar(automotriz));
    }

    @PutMapping()
    public ResponseEntity<Automotriz> update(@RequestBody Automotriz automotriz) {
        return ResponseEntity.ok(automotrizService.actualizar(automotriz));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Automotriz> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(automotrizService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        automotrizService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
