package application.controller;

import application.dao.ApprenantDAO;
import application.dao.GroupeDAO;
import application.model.Apprenant;
import application.model.Groupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GroupeController {

    @Autowired
    private GroupeDAO groupeDAO;
    @Autowired
    private ApprenantDAO apprenantDAO;

    @GetMapping("/groupes")
    public List<Groupe> getGroupes() {
        return this.groupeDAO.findAll();
    }

    @GetMapping("/groupes/{id}")
    public Groupe getGroupeById(@PathVariable int id) {
        return this.groupeDAO.findById(id);
    }

    @GetMapping("/groupesClear/{id}")
    public String clearGroupe(@PathVariable int id) {
        List<Apprenant> app = this.apprenantDAO.findAll();
        Apprenant atmp;
        List<Groupe> gr = this.groupeDAO.findByNom("NouveauxArrivants");
        Groupe oneGr = this.groupeDAO.findById(id);
        int i = 0;

        for(Groupe g : gr){
            if(g.getIdSite() == oneGr.getIdSite()){
                i = g.getId();
            }
        }

        for(Apprenant a : app){
            if(a.getIdGroupe() == id){
                atmp = a;
                atmp.setIdGroupe(i);
                this.apprenantDAO.save(atmp);
            }
        }
        return "ok";
    }

    //Recuperer l'id du groupe par le nom du groupe
    @GetMapping("/groupeByNom/{nom}")
    public Integer getIdByNom(@PathVariable String nom){
        List<Groupe> groupe = this.groupeDAO.findAll();
        Integer result=null;
        if(groupe != null) {
            for (Groupe g : groupe) {
                if(g.getNom().toLowerCase().equals(nom.toLowerCase())){
                    return result = g.getId();
                }
            }
        }
        return result;
    }

//Fonction qui check si le groupe existe deja

    @GetMapping("/groupExist/{nom}")
    public boolean exist(@PathVariable String nom){
        List<Groupe> groupe = this.groupeDAO.findAll();
        boolean result = false;
        if(groupe != null) {
            for (Groupe g : groupe) {
                if(g.getNom().toLowerCase().equals(nom.toLowerCase())){
                    result = true;
                }
            }
        }
        return result;
    }



    @PostMapping("/groupes")
    public void postGroupe(@RequestBody Groupe groupe) {
        this.groupeDAO.save(groupe);
    }

    @DeleteMapping("/groupes/{id}")
    public void deleteGroupe(@PathVariable int id) {
        this.groupeDAO.deleteById(id);
    }

    @PutMapping("/groupes/{id}")
    public Groupe updateGroupe(@RequestBody Groupe groupe) {
        return this.groupeDAO.save(groupe);
    }

    @GetMapping("/groupesS/{id}")
    public List<Groupe> getGroupesBySite(@PathVariable int id) {
        return this.groupeDAO.findByIdSite(id);
    }
}
