package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Presence {

    @Id
    @GeneratedValue
    private int id;

    private int idApprenant;
    private boolean present;

    public Presence(int id, int idApprenant, boolean present) {
        this.id = id;
        this.idApprenant = idApprenant;
        this.present = present;
    }

    public int getId() {
        return id;
    }

    public int getIdApprenant() {
        return idApprenant;
    }

    public boolean isPresent() {
        return present;
    }

    public void setIdApprenant(int idApprenant) {
        this.idApprenant = idApprenant;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}
