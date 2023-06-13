package com.example.electrohogar.controller;

import com.example.electrohogar.entity.ElectroHogar;
import com.example.electrohogar.service.ElectroHogarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/electrohogar")
public class ElectroHogarController {
    @Autowired
    private ElectroHogarService electroHogarService;

    @GetMapping()
    public ResponseEntity<List<ElectroHogar>> list() {
        return ResponseEntity.ok().body(electroHogarService.listar());
    }

    @PostMapping()
    public ResponseEntity<ElectroHogar> save(@RequestBody ElectroHogar electroHogar) {
        return ResponseEntity.ok(electroHogarService.guardar(electroHogar));
    }

    @PutMapping()
    public ResponseEntity<ElectroHogar> update(@RequestBody ElectroHogar electroHogar) {
        return ResponseEntity.ok(electroHogarService.actualizar(electroHogar));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ElectroHogar> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(electroHogarService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        electroHogarService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
