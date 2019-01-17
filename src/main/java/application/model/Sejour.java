package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sejour {

    @Id
    @GeneratedValue
    @Column(name ="idapprenant")
    private int idApprenant;

    private String statut;

    @Column(name = "datecartesejour")
    private String dateCarteSejour;

    @Column(name = "datefincartesejour")
    private String dateFinCarteSejour;

    @Column(name = "titresejour")
    private String titreSejour;

    @Column(name = "typecontrat")
    private String typeContrat;

    public Sejour(int idApprenant, String statut, String dateCarteSejour, String dateFinCarteSejour, String titreSejour, String typeContrat) {
        this.idApprenant = idApprenant;
        this.statut = statut;
        this.dateCarteSejour = dateCarteSejour;
        this.dateFinCarteSejour = dateFinCarteSejour;
        this.titreSejour = titreSejour;
        this.typeContrat = typeContrat;
    }

    public int getIdApprenant() {
        return idApprenant;
    }

    public void setIdApprenant(int idApprenant) {
        this.idApprenant = idApprenant;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDateCarteSejour() {
        return dateCarteSejour;
    }

    public void setDateCarteSejour(String dateCarteSejour) {
        this.dateCarteSejour = dateCarteSejour;
    }

    public String getDateFinCarteSejour() {
        return dateFinCarteSejour;
    }

    public void setDateFinCarteSejour(String dateFinCarteSejour) {
        this.dateFinCarteSejour = dateFinCarteSejour;
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
