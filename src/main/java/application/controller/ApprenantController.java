package application.controller;

import application.dao.ApprenantDAO;
import application.dao.ApprenantZombieDAO;
import application.model.Apprenant;
import application.model.ApprenantZombie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApprenantController {

    @Autowired
    private ApprenantDAO apprenantDAO;
    @Autowired
    private ApprenantZombieDAO apprenantZombieDAO;

    @GetMapping("/apprenants")
    public List<Apprenant> getApprenants() { return this.apprenantDAO.findAll(); }

    @GetMapping("/apprenants/{id}")
    public Apprenant getApprenantById(@PathVariable int id) {
        return this.apprenantDAO.findById(id);
    }

    @GetMapping("/apprenantsG/{id}")
    public List<Apprenant> getApprenantsByGroupe(@PathVariable int id) { return this.apprenantDAO.findByIdGroupe(id); }

    @GetMapping("/apprenantsExist/{nom}/{prenom}")
    public boolean exist(@PathVariable String nom, @PathVariable String prenom){
        List<Apprenant> apprenants = this.apprenantDAO.findByNom(nom);
        boolean result = false;
        if(apprenants != null) {
            for (Apprenant a : apprenants) {
                if(a.getPrenom().toLowerCase().equals(prenom.toLowerCase())){
                    result = true;
                }
            }
        }
        return result;
    }

    @PostMapping("/apprenants")
    public void postApprenant(@RequestBody Apprenant apprenant) {
        this.apprenantDAO.save(apprenant);
    }

    @PutMapping("/apprenants")
    public Apprenant updateApprenant(@RequestBody Apprenant apprenant) {
        return this.apprenantDAO.save(apprenant);
    }

    @DeleteMapping("/apprenants/{id}")
    public void deleteApprenant(@PathVariable int id) {
        Apprenant apprenant = getApprenantById(id);
        this.apprenantDAO.deleteById(id);
        ApprenantZombie apprenantZombie = new ApprenantZombie(
                apprenant.getId(),
                apprenant.getNom(),
                apprenant.getPrenom(),
                apprenant.getTelephone(),
                apprenant.getAdresse(),
                apprenant.getcodePostal(),
                apprenant.getCommune(),
                apprenant.getIdGroupe(),
                apprenant.getDateInscription(),
                apprenant.getAuteurDossier(),
                apprenant.getPrimoArrivant(),
                apprenant.getMajeur(),
                apprenant.getDateNaissance(),
                apprenant.getGenre(),
                apprenant.getPaysOrigine(),
                apprenant.getNationalite(),
                apprenant.getDateArrivee(),
                apprenant.getQuartierPrioritaire(),
                apprenant.getSituationPersonnelle(),
                apprenant.getPriseCharge(),
                apprenant.isRsa(),
                apprenant.getTempsScolarisation(),
                apprenant.getDiplome(),
                apprenant.isMilieuScolaire(),
                apprenant.getNiveauLangue(),
                apprenant.isLireLangue(),
                apprenant.isEcrireLangue(),
                apprenant.isLireAlphaLatin(),
                apprenant.isEcrireAlphaLatin(),
                apprenant.isCotisationPayee(),
                apprenant.getRemarques(),
                apprenant.getStatutSejour(),
                apprenant.getDateCarteSejour(),
                apprenant.getDateFinCarteSejour(),
                apprenant.getStatutPro(),
                apprenant.getTypeContrat());
        this.apprenantZombieDAO.save(apprenantZombie);
    }
}
