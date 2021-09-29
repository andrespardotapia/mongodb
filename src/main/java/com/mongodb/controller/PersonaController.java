package com.mongodb.controller;


import com.mongodb.model.Personas;
import com.mongodb.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private PersonaRepository repo;

    @PostMapping("/crear")
    public String crear(@RequestBody Personas model) {
        try {
            repo.save(model);
            return "Producto creada";
        } catch (Exception e) {
            throw e;
        }
    }
}
