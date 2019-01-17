package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pays {

    @Id
    @GeneratedValue
    private int id;

    private String nationalite, langue;

    public Pays(int id, String nationalite, String langue) {
        this.id = id;
        this.nationalite = nationalite;
        this.langue = langue;
    }

    public int getId() {
        return id;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getLangue() {
        return langue;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }
}
