package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class QuartierPrioritaire {

    @Id
    @GeneratedValue
    private int id;

    private String nomQuartier;

    public QuartierPrioritaire(int id, String nomQuartier) {
        this.id = id;
        this.nomQuartier = nomQuartier;
    }

    public int getId() {
        return id;
    }

    public String getNomQuartier() {
        return nomQuartier;
    }

    public void setNomQuartier(String nomQuartier) {
        this.nomQuartier = nomQuartier;
    }
}
