package fr.formation.controllers;

import fr.formation.dtos.LocalisationDTO;
import fr.formation.services.LocalisationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/localisations")
public class LocalisationController {

    LocalisationService service;
    public LocalisationController(LocalisationService service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public ResponseEntity<LocalisationDTO> getPost(@PathVariable String id) {
        // J'appelle mon service pour récupérer mon article
        // L'article peut être NULL ou Rempli
        LocalisationDTO localisationDTO = service.findById(id);
        // Je verifie si mon article est null
        if (localisationDTO == null) {
            // SI il est null
            // Je construit une RESPONSE de type 404
            return ResponseEntity.notFound().build();
        }
        // SI il est plein
        // Je construit une RESPONSE de type 200
        // AVEC l'article récupéré
        return ResponseEntity.ok().body(localisationDTO);
    }


    @GetMapping()
    public List<LocalisationDTO> getPosts() {
        return service.findAll();
    }



}
