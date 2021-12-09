package fr.formation.configuration;

import fr.formation.repositories.LocalisationRepository;
import fr.formation.services.LocalisationService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalisationConfiguration {

    @Bean
    public LocalisationService localisationService(
            LocalisationRepository repository,
            ModelMapper mapper
    ) {
        return new LocalisationService(mapper, repository);
    }
}
