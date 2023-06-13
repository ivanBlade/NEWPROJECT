package com.example.dormitorio.controller;

import com.example.dormitorio.entity.Dormitorio;
import com.example.dormitorio.service.DormitorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dormitorio")
public class DormitorioController {
    @Autowired
    private DormitorioService dormitorioService;

    @GetMapping()
    public ResponseEntity<List<Dormitorio>> list() {
        return ResponseEntity.ok().body(dormitorioService.listar());
    }

    @PostMapping()
    public ResponseEntity<Dormitorio> save(@RequestBody Dormitorio dormitorio) {
        return ResponseEntity.ok(dormitorioService.guardar(dormitorio));
    }

    @PutMapping()
    public ResponseEntity<Dormitorio> update(@RequestBody Dormitorio dormitorio) {
        return ResponseEntity.ok(dormitorioService.actualizar(dormitorio));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dormitorio> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(dormitorioService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        dormitorioService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
