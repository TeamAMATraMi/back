package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Site {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String ville;

    public Site() {
    }

    public Site(int id, String ville) {
        this.id = id;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}

