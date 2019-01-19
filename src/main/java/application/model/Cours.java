package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cours {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "idformateur")
    private int idFormateur;

    @Column(name = "idgroupe")
    private int idGroupe;

    @Column(nullable = false)
    private String horaire;

    @Column(nullable = false)
    private String matiere;

    @Column(nullable = false)
    private int duree;

    public Cours(int id, int idFormateur, int idGroupe, String horaire, String matiere, int duree) {
        this.id = id;
        this.idFormateur = idFormateur;
        this.idGroupe = idGroupe;
        this.horaire = horaire;
        this.matiere = matiere;
        this.duree = duree;
    }

    public Cours() {
    }

    public int getId() {
        return id;
    }

    public int getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(int idFormateur) {
        this.idFormateur = idFormateur;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
