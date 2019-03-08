package application.controller;

import application.dao.ApprenantZombieDAO;
import application.model.Apprenant;
import application.model.ApprenantZombie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApprenantZombieController {

    @Autowired
    private ApprenantZombieDAO apprenantZombieDAO;

    @GetMapping("/apprenantsZombie")
    public List<ApprenantZombie> getApprenantsZombie() { return this.apprenantZombieDAO.findAll(); }

    @GetMapping("/apprenantsZombie/{id}")
    public ApprenantZombie getApprenantZombieById(@PathVariable int id) {
        return this.apprenantZombieDAO.findById(id);
    }

    @GetMapping("/apprenantsGZombie/{id}")
    public List<ApprenantZombie> getApprenantsZombieByGroupe(@PathVariable int id) { return this.apprenantZombieDAO.findByIdGroupe(id); }

    @GetMapping("/apprenantsZombieExist/{nom}/{prenom}")
    public boolean exist(@PathVariable String nom, @PathVariable String prenom){
        List<ApprenantZombie> apprenants = this.apprenantZombieDAO.findByNom(nom);
        boolean result = false;
        if(apprenants != null) {
            for (ApprenantZombie a : apprenants) {
                if(a.getPrenom().toLowerCase().equals(prenom.toLowerCase())){
                    result = true;
                }
            }
        }
        return result;
    }

    @PostMapping("/apprenantsZombie")
    public void postApprenantZombie(@RequestBody ApprenantZombie apprenant) {
        this.apprenantZombieDAO.save(apprenant);
    }

    @PutMapping("/apprenantsZombie")
    public ApprenantZombie updateApprenantZombie(@RequestBody ApprenantZombie apprenant) {
        return this.apprenantZombieDAO.save(apprenant);
    }

    @DeleteMapping("/apprenantsZombie/{id}")
    public void deleteApprenantZombie(@PathVariable int id) {
        this.apprenantZombieDAO.deleteById(id);
    }
}
