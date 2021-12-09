package fr.formation.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document // List dans mongo
public class Localisation {

    @Id
    private String id;
    private String nom;
    private String code;

    public Localisation() {
    }

    public Localisation(String id, String nom, String code) {
        this.id = id;
        this.nom = nom;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
