package com.example.lab15.classes;

/**
 * Modèle Etudiant personnalisé
 * REALISE PAR CHARRAJ Mouad aka ZERO-XR7
 */
public class Etudiant {
    private int id_mouad;
    private String nom_mouad;
    private String prenom_mouad;

    public Etudiant(String nom_mouad, String prenom_mouad) {
        this.nom_mouad = nom_mouad;
        this.prenom_mouad = prenom_mouad;
    }

    public Etudiant() { }

    public int getId() {
        return id_mouad;
    }

    public void setId(int id_mouad) {
        this.id_mouad = id_mouad;
    }

    public String getNom() {
        return nom_mouad;
    }

    public void setNom(String nom_mouad) {
        this.nom_mouad = nom_mouad;
    }

    public String getPrenom() {
        return prenom_mouad;
    }

    public void setPrenom(String prenom_mouad) {
        this.prenom_mouad = prenom_mouad;
    }
}
// REALISE PAR CHARRAJ Mouad aka ZERO-XR7
