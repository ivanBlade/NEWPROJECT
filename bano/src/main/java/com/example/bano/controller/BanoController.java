package com.example.bano.controller;

import com.example.bano.entity.Bano;
import com.example.bano.service.BanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bano")
public class BanoController {
    @Autowired
    private BanoService banoService;

    @GetMapping()
    public ResponseEntity<List<Bano>> list() {
        return ResponseEntity.ok().body(banoService.listar());
    }

    @PostMapping()
    public ResponseEntity<Bano> save(@RequestBody Bano bano) {
        return ResponseEntity.ok(banoService.guardar(bano));
    }

    @PutMapping()
    public ResponseEntity<Bano> update(@RequestBody Bano bano) {
        return ResponseEntity.ok(banoService.actualizar(bano));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bano> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(banoService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        banoService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
