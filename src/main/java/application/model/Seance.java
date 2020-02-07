package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Seance {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "idcours")
    private int idCours;

    @Column(name = "presence")
    private int idPresence;

    @Column(name = "horaire")
    private String horaire;

    @Column(name = "date")
    private String date;

    public Seance(int id, int idCours, int idPresence, String horaire, String date) {
        this.id = id;
        this.idCours = idCours;
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

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
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
