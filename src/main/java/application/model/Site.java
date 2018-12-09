package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Site {

    @Id
    @GeneratedValue
    private int idSite;

    private String ville;

    public Site() {}

    public Site(int idSite, String ville) {
        this.idSite = idSite;
        this.ville = ville;
    }

    public int getIdSite() { return idSite; }

    public String getVille() { return ville; }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}

