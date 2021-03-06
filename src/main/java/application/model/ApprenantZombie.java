package application.model;

import javax.persistence.*;

@Entity
@Table(name = "apprenantzombie")
public class ApprenantZombie {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    private String telephone;
    private String adresse;

    @Column(name = "codepostal")
    private String codePostal;
    private String commune;

    @Column(name = "idgroupe")
    private int idGroupe;

    @Column(name = "dateinscription",nullable = false)
    private String dateInscription; // a parser in/out

    @Column(name = "auteurdossier", nullable = false)
    private String auteurDossier;

    @Column(name = "primoarrivant")
    private boolean primoArrivant;
    private boolean majeur;

    @Column(name = "datenaissance")
    private String dateNaissance; // a parser in/out
    private char genre;

    @Column(name = "paysorigine", nullable = false)
    private String paysOrigine;
    private String nationalite;

    @Column(name = "datearrivee")
    private String dateArrivee; // a parser in/out

    @Column(name = "quartierprioritaire")
    private Integer quartierPrioritaire; // clef étrangère

    @Column(name = "situationpersonnelle")
    private String situationPersonnelle;

    @Column(name = "prisecharge")
    private int priseCharge;

    private boolean rsa;

    @Column(name = "tempsscolarisation")
    private int tempsScolarisation;
    private String diplome;

    @Column(name = "milieuscolaire")
    private boolean milieuScolaire;

    @Column(name = "niveaulangue")
    private String niveauLangue;

    @Column(name = "lirelangue")
    private boolean lireLangue;

    @Column(name = "ecrirelangue")
    private boolean ecrireLangue;

    @Column(name = "lirealphalatin")
    private boolean lireAlphaLatin;

    @Column(name = "ecrirealphalatin")
    private boolean ecrireAlphaLatin;

    @Column(name = "cotisationpayee")
    private boolean cotisationPayee;
    private String remarques;

    @Column(name = "statutsejour")
    private String statutSejour;

    @Column(name = "datecartesejour")
    private String dateCarteSejour;

    @Column(name = "datefincartesejour")
    private String dateFinCarteSejour;

    @Column(name = "statutpro")
    private String statutPro;

    @Column(name = "typecontrat")
    private String typeContrat;

    public ApprenantZombie() {

    }

    public ApprenantZombie(
            int id,
            String nom,
            String prenom,
            String telephone,
            String adresse,
            String codePostal,
            String commune,
            int idGroupe,
            String dateInscription,
            String auteurDossier,
            boolean primoArrivant,
            boolean majeur,
            String dateNaissance,
            char genre,
            String paysOrigine,
            String nationalite,
            String dateArrivee,
            int quartierPrioritaire,
            String situationPersonelle,
            int priseCharge,
            boolean rsa,
            int tempsScolarisation,
            String diplome,
            boolean milieuScolaire,
            String niveauLangue,
            boolean lireLangue,
            boolean ecrireLangue,
            boolean lireAlphaLatin,
            boolean ecrireAlphaLatin,
            boolean cotisationPayee,
            String remarques,
            String statutSejour,
            String dateCarteSejour,
            String dateFinCarteSejour,
            String statutPro,
            String typeContrat) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.commune = commune;
        this.idGroupe = idGroupe;
        this.dateInscription = dateInscription;
        this.auteurDossier = auteurDossier;
        this.primoArrivant = primoArrivant;
        this.majeur = majeur;
        this.dateNaissance = dateNaissance;
        this.genre = genre;
        this.paysOrigine = paysOrigine;
        this.nationalite = nationalite;
        this.dateArrivee = dateArrivee;
        this.quartierPrioritaire = quartierPrioritaire;
        this.situationPersonnelle = situationPersonelle;
        this.priseCharge = priseCharge;
        this.rsa = rsa;
        this.tempsScolarisation = tempsScolarisation;
        this.diplome = diplome;
        this.milieuScolaire = milieuScolaire;
        this.niveauLangue = niveauLangue;
        this.lireLangue = lireLangue;
        this.ecrireLangue = ecrireLangue;
        this.lireAlphaLatin = lireAlphaLatin;
        this.ecrireAlphaLatin = ecrireAlphaLatin;
        this.cotisationPayee = cotisationPayee;
        this.remarques = remarques;
        this.statutSejour = statutSejour;
        this.dateCarteSejour = dateCarteSejour;
        this.dateFinCarteSejour = dateFinCarteSejour;
        this.statutPro = statutPro;
        this.typeContrat = typeContrat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getcodePostal() {
        return codePostal;
    }

    public void setcodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getAuteurDossier() {
        return auteurDossier;
    }

    public void setAuteurDossier(String auteurDossier) {
        this.auteurDossier = auteurDossier;
    }

    public boolean getPrimoArrivant() {
        return primoArrivant;
    }

    public void setPrimoArrivant(boolean primoArrivant) {
        this.primoArrivant = primoArrivant;
    }

    public boolean getMajeur() {
        return majeur;
    }

    public void setMajeur(boolean majeur) {
        this.majeur = majeur;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public String getPaysOrigine() {
        return paysOrigine;
    }

    public void setPaysOrigine(String paysOrigine) {
        this.paysOrigine = paysOrigine;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Integer getQuartierPrioritaire() {
        return quartierPrioritaire;
    }

    public void setQuartierPrioritaire(Integer quartierPrioritaire) {
        this.quartierPrioritaire = quartierPrioritaire;
    }

    public String getSituationPersonnelle() {
        return situationPersonnelle;
    }

    public void setSituationPersonelle(String situationPersonelle) {
        this.situationPersonnelle = situationPersonelle;
    }

    public int getPriseCharge() {
        return priseCharge;
    }

    public void setPriseCharge(int priseCharge) {
        this.priseCharge = priseCharge;
    }

    public boolean isRsa() {
        return rsa;
    }

    public void setRsa(boolean rsa) {
        this.rsa = rsa;
    }

    public int getTempsScolarisation() {
        return tempsScolarisation;
    }

    public void setTempsScolarisation(int tempsScolarisation) {
        this.tempsScolarisation = tempsScolarisation;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public boolean isMilieuScolaire() {
        return milieuScolaire;
    }

    public void setMilieuScolaire(boolean milieuScolaire) {
        this.milieuScolaire = milieuScolaire;
    }

    public String getNiveauLangue() {
        return niveauLangue;
    }

    public void setNiveauLangue(String niveauLangue) {
        this.niveauLangue = niveauLangue;
    }

    public boolean isLireLangue() {
        return lireLangue;
    }

    public void setLireLangue(boolean lireLangue) {
        this.lireLangue = lireLangue;
    }

    public boolean isEcrireLangue() {
        return ecrireLangue;
    }

    public void setEcrireLangue(boolean ecrireLangue) {
        this.ecrireLangue = ecrireLangue;
    }

    public boolean isLireAlphaLatin() {
        return lireAlphaLatin;
    }

    public void setLireAlphaLatin(boolean lireAlphaLatin) {
        this.lireAlphaLatin = lireAlphaLatin;
    }

    public boolean isEcrireAlphaLatin() {
        return ecrireAlphaLatin;
    }

    public void setEcrireAlphaLatin(boolean ecrireAlphaLatin) {
        this.ecrireAlphaLatin = ecrireAlphaLatin;
    }

    public boolean isCotisationPayee() {
        return cotisationPayee;
    }

    public void setCotisationPayee(boolean cotisationPayee) {
        this.cotisationPayee = cotisationPayee;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public String getStatutSejour() {
        return statutSejour;
    }

    public void setStatutSejour(String statutSejour) {
        this.statutSejour = statutSejour;
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

    public String getStatutPro() {
        return statutPro;
    }

    public void setStatutPro(String statutPro) {
        this.statutPro = statutPro;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }
}
