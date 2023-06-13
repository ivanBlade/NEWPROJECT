package com.example.iluminacion.controller;

import com.example.iluminacion.entity.Iluminacion;
import com.example.iluminacion.service.IluminacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/iluminacion")
public class IluminacionController {
    @Autowired
    private IluminacionService iluminacionService;

    @GetMapping()
    public ResponseEntity<List<Iluminacion>> list() {
        return ResponseEntity.ok().body(iluminacionService.listar());
    }

    @PostMapping()
    public ResponseEntity<Iluminacion> save(@RequestBody Iluminacion iluminacion) {
        return ResponseEntity.ok(iluminacionService.guardar(iluminacion));
    }

    @PutMapping()
    public ResponseEntity<Iluminacion> update(@RequestBody Iluminacion iluminacion) {
        return ResponseEntity.ok(iluminacionService.actualizar(iluminacion));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Iluminacion> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(iluminacionService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        iluminacionService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
