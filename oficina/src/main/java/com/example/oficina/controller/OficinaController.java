package com.example.oficina.controller;

import com.example.oficina.entity.Oficina;
import com.example.oficina.service.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/oficina")
public class OficinaController {
    @Autowired
    private OficinaService oficinaService;

    @GetMapping()
    public ResponseEntity<List<Oficina>> list() {
        return ResponseEntity.ok().body(oficinaService.listar());
    }

    @PostMapping()
    public ResponseEntity<Oficina> save(@RequestBody Oficina oficina) {
        return ResponseEntity.ok(oficinaService.guardar(oficina));
    }

    @PutMapping()
    public ResponseEntity<Oficina> update(@RequestBody Oficina oficina) {
        return ResponseEntity.ok(oficinaService.actualizar(oficina));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Oficina> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(oficinaService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        oficinaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
