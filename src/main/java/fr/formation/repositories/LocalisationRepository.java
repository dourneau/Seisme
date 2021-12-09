package fr.formation.repositories;

import fr.formation.entities.Localisation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface LocalisationRepository extends MongoRepository<Localisation,String> {

}
