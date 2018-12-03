package application.model;

public class Formateur {
    private int id;
    private int idSite;
    private boolean salarie;
    private String nom,prenom,telephone,adresse,commune;
    private int codePostal;

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

    public boolean isSalarie() {
        return salarie;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCommune() {
        return commune;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public void setSalarie(boolean salarie) {
        this.salarie = salarie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }
}
