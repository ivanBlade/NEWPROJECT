package com.example.mueble.controller;

import com.example.mueble.entity.Mueble;
import com.example.mueble.service.MuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mueble")
public class MuebleController {
    @Autowired
    private MuebleService muebleService;

    @GetMapping()
    public ResponseEntity<List<Mueble>> list() {
        return ResponseEntity.ok().body(muebleService.listar());
    }

    @PostMapping()
    public ResponseEntity<Mueble> save(@RequestBody Mueble mueble) {
        return ResponseEntity.ok(muebleService.guardar(mueble));
    }

    @PutMapping()
    public ResponseEntity<Mueble> update(@RequestBody Mueble mueble) {
        return ResponseEntity.ok(muebleService.actualizar(mueble));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mueble> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(muebleService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        muebleService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
