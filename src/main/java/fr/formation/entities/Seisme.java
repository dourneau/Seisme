package fr.formation.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document // List dans mongo
public class Seisme {

    @Id
    private String id;
    private String nom;
    private String localisation;
    private int magnitude;
    private String date;
}
