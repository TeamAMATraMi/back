package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Formateur {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "idsite")
    private int idSite;
    private boolean salarie;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;
    private String telephone;
    private String adresse;
    private String commune;

    @Column(name = "codepostal")
    private int codePostal;

    public Formateur() {
    }

    public Formateur(int id, int idSite, boolean salarie, String nom, String prenom, String telephone, String adresse, String commune, int codePostal) {
        this.id = id;
        this.idSite = idSite;
        this.salarie = salarie;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.commune = commune;
        this.codePostal = codePostal;
    }

    public int getId() {
        return id;
    }

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public boolean isSalarie() {
        return salarie;
    }

    public void setSalarie(boolean salarie) {
        this.salarie = salarie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }
}
