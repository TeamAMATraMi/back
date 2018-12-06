package application.model;

public class Groupe {
    private int idGroupe;
    private int idSite;
    private String nom;

    public Groupe(int idGroupe, int idSite, String nom) {
        this.idGroupe = idGroupe;
        this.idSite = idSite;
        this.nom = nom;
    }

    public int getIdGroupe() { return idGroupe; }
    public int getIdSite() { return idSite; }
    public String getNom() { return nom; }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



}

