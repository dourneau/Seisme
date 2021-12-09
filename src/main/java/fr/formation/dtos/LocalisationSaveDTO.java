package fr.formation.dtos;

public class LocalisationSaveDTO {

    private String nom;
    private String code;

    public LocalisationSaveDTO() {
    }

    public LocalisationSaveDTO(String nom, String code) {
        this.nom = nom;
        this.code = code;
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
