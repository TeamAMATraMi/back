package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Presence {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "idcours")
    private int idCours;

    @Column(name = "idapprenant")
    private int idApprenant;

    @Column(name = "present")
    private boolean present;

    @Column(name = "date")
    private int date;

    public Presence(){

    }

    public Presence(int id, int idCours, int idApprenant, boolean present, int date) {
        this.id = id;
        this.idCours = idCours;
        this.idApprenant = idApprenant;
        this.present = present;
        this.date = date;
    }

    public int getId() { return id; }

    public int getIdCours(){ return idCours; }

    public void setIdCours(int idCours){ this.idCours = idCours; }

    public int getIdApprenant() { return idApprenant; }

    public void setIdApprenant(int idApprenant) { this.idApprenant = idApprenant; }

    public boolean isPresent() { return present; }

    public void setPresent(boolean present) { this.present = present; }

    public int getDate() {
        return date;
    }

}
