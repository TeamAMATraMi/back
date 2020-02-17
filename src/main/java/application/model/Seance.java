package application.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
public class Seance {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "cours", nullable = false)
    private Cours cours;

    @Column(name = "presence")
    private int idPresence;

    @Column(name = "horaire")
    private String horaire;

    @Column(name = "date")
    private String date;

    public Seance(int id, Cours cours, int idPresence, String horaire, String date) {
        this.id = id;
        this.cours = cours;
        this.idPresence = idPresence;
        this.horaire = horaire;
        this.date = date;
    }

    public Seance(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public int getIdPresence() {
        return idPresence;
    }

    public void setIdPresence(int idPresence) {
        this.idPresence = idPresence;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
