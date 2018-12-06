package application.model;

public class Cours {

    private int id;
    private int idFormateur;
    private int idGroupe;
    private String horaire;
    private String matiere;
    private int duree;

    public Cours(int id, int idFormateur, int idGroupe, String horaire, String matiere, int duree) {
        this.id = id;
        this.idFormateur = idFormateur;
        this.idGroupe = idGroupe;
        this.horaire = horaire;
        this.matiere = matiere;
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public int getIdFormateur() {
        return idFormateur;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public String getHoraire() {
        return horaire;
    }

    public String getMatiere() {
        return matiere;
    }

    public int getDuree() {
        return duree;
    }

    public void setIdFormateur(int idFormateur) {
        this.idFormateur = idFormateur;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
