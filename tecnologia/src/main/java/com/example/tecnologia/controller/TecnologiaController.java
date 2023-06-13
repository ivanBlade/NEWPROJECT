package com.example.tecnologia.controller;

import com.example.tecnologia.entity.Tecnologia;
import com.example.tecnologia.service.TecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tecnologia")
public class TecnologiaController {
    @Autowired
    private TecnologiaService tecnologiaService;

    @GetMapping()
    public ResponseEntity<List<Tecnologia>> list() {
        return ResponseEntity.ok().body(tecnologiaService.listar());
    }

    @PostMapping()
    public ResponseEntity<Tecnologia> save(@RequestBody Tecnologia tecnologia) {
        return ResponseEntity.ok(tecnologiaService.guardar(tecnologia));
    }

    @PutMapping()
    public ResponseEntity<Tecnologia> update(@RequestBody Tecnologia tecnologia) {
        return ResponseEntity.ok(tecnologiaService.actualizar(tecnologia));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tecnologia> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(tecnologiaService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        tecnologiaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
