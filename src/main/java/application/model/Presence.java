package application.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Presence {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "idseance")
    private int idSeance;

    @Column(name = "idapprenant")
    private int idApprenant;

    @Column(name = "present")
    private boolean present;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Presence(){

    }

    public Presence(int id, int idSeance, int idApprenant, boolean present, Date date) {
        this.id = id;
        this.idSeance = idSeance;
        this.idApprenant = idApprenant;
        this.present = present;
        this.date = date;
    }

    public int getId() { return id; }

    public int getIdSeance(){ return idSeance; }

    public void setIdSeance(int idSeance){ this.idSeance = idSeance; }

    public int getIdApprenant() { return idApprenant; }

    public void setIdApprenant(int idApprenant) { this.idApprenant = idApprenant; }

    public boolean isPresent() { return present; }

    public void setPresent(boolean present) { this.present = present; }

    public Date getDate() {
        return date;
    }

}
