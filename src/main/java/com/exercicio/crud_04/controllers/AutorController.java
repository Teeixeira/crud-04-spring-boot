package com.exercicio.crud_04.controllers;

import com.exercicio.crud_04.models.AutorModel;
import com.exercicio.crud_04.services.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/autor")
public class AutorController {

    public final AutorService autorService;


    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping
    public ResponseEntity<AutorModel> save(@RequestBody AutorModel autorModel){
        AutorModel autor = autorService.save(autorModel);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(autor.getId())
                .toUri();

        return ResponseEntity.ok().body(autor);
    }

    @GetMapping
    public ResponseEntity<List<AutorModel>> findAll(){
        List<AutorModel> autors = autorService.findAll();

        return ResponseEntity.ok().body(autors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorModel> findById(@PathVariable Long id){
        AutorModel autor = autorService.findById(id);

        return ResponseEntity.ok().body(autor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        autorService.delete(id);

        return ResponseEntity.noContent().build();
    }


}
