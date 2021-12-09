package fr.formation.services;

import fr.formation.dtos.LocalisationDTO;
import fr.formation.dtos.LocalisationSaveDTO;
import fr.formation.entities.Localisation;
import fr.formation.repositories.LocalisationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LocalisationService {

    private LocalisationRepository repository;
    private ModelMapper mapper;

    public LocalisationService(ModelMapper mapper,
                       LocalisationRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<LocalisationDTO> findAll() {
        List<LocalisationDTO> localisations  = new ArrayList<>();
        repository.findAll().forEach(post -> {
            localisations.add(mapper.map(localisations,LocalisationDTO.class));
        });
        return localisations;
    }

    public LocalisationDTO save(LocalisationSaveDTO localisation) {
        Localisation u = this.repository.save
                (this.mapper.map(localisation, Localisation.class));
        return (this.mapper.map(u, LocalisationDTO.class));
    }

    public LocalisationDTO findById(String id) {
        // Je crée ma variable qui va contenir mon DTO
        LocalisationDTO localisationDTO = null;
        // Me renvoi un article, mais on ne sait pas s'il existe
        Optional<Localisation> optionnalLocalisation = this.repository.findById(id);
        // On va vérifier si l'article existe
        if(optionnalLocalisation.isPresent()) {
            // Je récupère mon article
            Localisation localisation = optionnalLocalisation.get();
            // Je map mon entité User en DTO PostDTO
            localisationDTO = mapper.map(localisation, LocalisationDTO.class);
        }
        return localisationDTO;
    }

}
