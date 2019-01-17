package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Apprenant {

    @Id
    @GeneratedValue
    private int id;

  private String nom;
  private String prenom;
  private String telephone;
  private String adresse;
  private int code_postal;
  private String commune;
  private int id_groupe;
  private String date_inscription; // a parser in/out
  private int auteur_dossier;
  private int majeur;
  private String date_naissance; // a parser in/out
  private char genre;
  private String pays_origine;
  private String nationalite;
  private String date_arrivee; // a parser in/out
  private int quartier_prioritaire; // clef étrangère
  private String situation_personelle;
  private int prise_charge;
  private boolean rsa;
  private int temps_scolarisation;
  private String diplome;
  private boolean milieu_scolaire;
  private String niveau_langue;
  private boolean lire_langue;
  private boolean ecrire_langue;
  private boolean lire_alpha_latin;
  private boolean ecrire_alpha_latin;
  private boolean cotisation_payee;
  private String remarques;

  public Apprenant(){

  }

  public Apprenant(
           int id,
           String nom,
           String prenom,
           String telephone,
           String adresse,
           int code_postal,
           String commune,
           int id_groupe,
           String date_inscription,
           int auteur_dossier,
           int majeur,
           String date_naissance,
           char genre,
           String pays_origine,
           String nationalite,
           String date_arrivee,
           int quartier_prioritaire,
           String situation_personelle,
           int prise_charge,
           boolean rsa,
           int temps_scolarisation,
           String diplome,
           boolean milieu_scolaire,
           String niveau_langue,
           boolean lire_langue,
           boolean ecrire_langue,
           boolean lire_alpha_latin,
           boolean ecrire_alpha_latin,
           boolean cotisation_payee,
           String remarques){

      this.id = id;
      this.nom = nom;
      this.prenom = prenom;
      this.telephone = telephone;
      this.adresse = adresse;
      this.code_postal = code_postal;
      this.commune = commune;
      this.id_groupe = id_groupe;
      this.date_inscription = date_inscription;
      this.auteur_dossier = auteur_dossier;
      this.majeur = majeur;
      this.date_naissance = date_naissance;
      this.genre = genre;
      this.pays_origine = pays_origine;
      this.nationalite = nationalite;
      this.date_arrivee = date_arrivee;
      this.quartier_prioritaire = quartier_prioritaire;
      this.situation_personelle = situation_personelle;
      this.prise_charge = prise_charge;
      this.rsa = rsa;
      this.temps_scolarisation = temps_scolarisation;
      this.diplome = diplome;
      this.milieu_scolaire = milieu_scolaire;
      this.niveau_langue = niveau_langue;
      this.lire_langue = lire_langue;
      this.ecrire_langue = ecrire_langue;
      this.lire_alpha_latin = lire_alpha_latin;
      this.ecrire_alpha_latin = ecrire_alpha_latin;
      this.cotisation_payee = cotisation_payee;
      this.remarques = remarques;
  }

    /* ----------------------------PARTIE DES GETTERS ------------------------------*/

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getTelephone() { return telephone; }
    public String getAdresse() { return adresse; }
    public int getCodePostal() { return code_postal; }
    public String getCommune() { return commune; }
    public int getIdGroupe() { return id_groupe; }
    public String getDateInscription() { return date_inscription; }
    public int getAuteurDossier() { return auteur_dossier; }
    public int getMajeur() { return majeur; }
    public String getDateNaissance() { return date_naissance; }
    public char getGenre() { return genre; }
    public String getPaysOrigine() { return pays_origine; }
    public String getNationalite() { return nationalite; }
    public String getDateArrivee() { return date_arrivee; }
    public int getQuartierPrioritaire() { return quartier_prioritaire; }
    public String getSituationPersonelle() { return situation_personelle; }
    public int getPriseCharge() { return prise_charge; }
    public boolean isRsa() { return rsa; }
    public int getTempsScolarisation() { return temps_scolarisation; }
    public String getDiplome() { return diplome; }
    public boolean isMilieuScolaire() { return milieu_scolaire; }
    public String getNiveauLangue() { return niveau_langue; }
    public boolean isLireLangue() { return lire_langue; }
    public boolean isEcrireLangue() { return ecrire_langue; }
    public boolean isLireAlphaLatin() { return lire_alpha_latin; }
    public boolean isEcrireAlphaLatin() { return ecrire_alpha_latin; }
    public boolean isCotisationPayee() { return cotisation_payee; }
    public String getRemarques() { return remarques; }
    /* ---------------------- FIN DES GETTERS --------------------------------*/

    /* ---------------------- PARTIE DES SETTERS ---------------------------- */
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

    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public void setId_groupe(int id_groupe) {
        this.id_groupe = id_groupe;
    }

    public void setDate_inscription(String date_inscription) {
        this.date_inscription = date_inscription;
    }

    public void setAuteur_dossier(int auteur_dossier) {
        this.auteur_dossier = auteur_dossier;
    }

    public void setMajeur(int majeur) {
        this.majeur = majeur;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public void setPays_origine(String pays_origine) {
        this.pays_origine = pays_origine;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setDate_arrivee(String date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public void setQuartier_prioritaire(int quartier_prioritaire) {
        this.quartier_prioritaire = quartier_prioritaire;
    }

    public void setSituation_personelle(String situation_personelle) {
        this.situation_personelle = situation_personelle;
    }

    public void setPrise_charge(int prise_charge) {
        this.prise_charge = prise_charge;
    }

    public void setRsa(boolean rsa) {
        this.rsa = rsa;
    }

    public void setTemps_scolarisation(int temps_scolarisation) {
        this.temps_scolarisation = temps_scolarisation;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public void setMilieu_scolaire(boolean milieu_scolaire) {
        this.milieu_scolaire = milieu_scolaire;
    }

    public void setNiveau_langue(String niveau_langue) {
        this.niveau_langue = niveau_langue;
    }

    public void setLire_langue(boolean lire_langue) {
        this.lire_langue = lire_langue;
    }

    public void setEcrire_langue(boolean ecrire_langue) {
        this.ecrire_langue = ecrire_langue;
    }

    public void setLire_alpha_latin(boolean lire_alpha_latin) {
        this.lire_alpha_latin = lire_alpha_latin;
    }

    public void setEcrire_alpha_latin(boolean ecrire_alpha_latin) {
        this.ecrire_alpha_latin = ecrire_alpha_latin;
    }

    public void setCotisation_payee(boolean cotisation_payee) {
        this.cotisation_payee = cotisation_payee;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    /* ---------------------- FIN DES SETTERS ----------------------- */

}
