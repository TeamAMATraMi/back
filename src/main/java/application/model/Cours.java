package application.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cours {

    @Id
    @GeneratedValue
    private int id;

    @JsonManagedReference
    @OneToMany(mappedBy = "cours")
    private List<Seance> seances;

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

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }
}
