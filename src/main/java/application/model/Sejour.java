package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sejour {

    @Id
    @GeneratedValue
    private int id;

    private String status;

    @Column(name = "datetitresejour")
    private String dateTitreSejour;

    @Column(name = "datefintitresejour")
    private String dateFinTitreSejour;

    @Column(name = "titresejour")
    private String titreSejour;

    @Column(name = "typecontrat")
    private String typeContrat;

    public Sejour(int id, String status, String dateTitreSejour, String dateFinTitreSejour, String titreSejour, String typeContrat) {
        this.id = id;
        this.status = status;
        this.dateTitreSejour = dateTitreSejour;
        this.dateFinTitreSejour = dateFinTitreSejour;
        this.titreSejour = titreSejour;
        this.typeContrat = typeContrat;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateTitreSejour() {
        return dateTitreSejour;
    }

    public void setDateTitreSejour(String dateTitreSejour) {
        this.dateTitreSejour = dateTitreSejour;
    }

    public String getDateFinTitreSejour() {
        return dateFinTitreSejour;
    }

    public void setDateFinTitreSejour(String dateFinTitreSejour) {
        this.dateFinTitreSejour = dateFinTitreSejour;
    }

    public String getTitreSejour() {
        return titreSejour;
    }

    public void setTitreSejour(String titreSejour) {
        this.titreSejour = titreSejour;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }
}
