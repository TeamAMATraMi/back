package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Groupe {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "idsite")
    private int idSite;

    @Column(name = "idFormateur")
    private int idFormateur;


	@Column(nullable = false)
    private String nom;

    public Groupe() {

    }

    public Groupe(int id, int idSite, String nom) {
        this.id = id;
        this.idSite = idSite;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }
    
    public int getIdFormateur() {
		return idFormateur;
	}

	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

