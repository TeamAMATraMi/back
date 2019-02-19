package application.services;

import application.dao.ApprenantDAO;
import application.dao.GroupeDAO;
import application.dao.SiteDAO;
import application.model.Apprenant;
import application.model.Groupe;
import application.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StatistiqueController {

    @Autowired
    private ApprenantDAO apprenantDAO;
    @Autowired
    private SiteDAO siteDAO;
    @Autowired
    private GroupeDAO groupeDAO;

    @GetMapping("/sexe")
    public Map<String, Integer> getBySexe() {
        Map<String, Integer> res = new HashMap<>();
        int cmpF = 0;
        List<Apprenant> tmp = this.apprenantDAO.findAll();

        for(Apprenant a : tmp){
            if(a.getGenre() == 'F'){
                cmpF++;
            }
        }
        res.put("F", cmpF);
        res.put("M", (tmp.size() - cmpF));
        return res;
    }

    @GetMapping("/nationalite")
    public Map<String, Integer> getByNationalite() {
        Map<String, Integer> res = new HashMap<>();
        List<Apprenant> tmp = this.apprenantDAO.findAll();
        for(Apprenant a : tmp){
            if(res.containsKey(a.getPaysOrigine())){
                res.put(a.getPaysOrigine(), res.get(a.getPaysOrigine()) + 1);
            }else{
                res.put(a.getPaysOrigine(), 1);
            }
        }
        return res;
    }

    @GetMapping("/age")
    public Map<String, Integer> getByAge() {
        Map<String, Integer> res = new HashMap<>();
        List<Apprenant> tmp = this.apprenantDAO.findAll();
        for(Apprenant a : tmp){
            String[] stmp = a.getDateNaissance().split("-");
            if(res.containsKey(stmp[0])){
                res.put(stmp[0], res.get(stmp[0]) + 1);
            }else{
                res.put(stmp[0], 1);
            }
        }
        return res;
    }

    @GetMapping("/site")
    public Map<String, Integer> getBySite() {
        Map<String, Integer> res = new HashMap<>();
        List<Apprenant> atmp = this.apprenantDAO.findAll();
        List<Site> stmp = this.siteDAO.findAll();
        List<Groupe> gtmp = this.groupeDAO.findAll();
        for(Apprenant a : atmp) {
            for (Site s : stmp) {
                for (Groupe g : gtmp) {
                    if (a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                        if (res.containsKey(s.getVille())) {
                            res.put(s.getVille(), res.get(s.getVille()) + 1);
                        } else {
                            res.put(s.getVille(), 1);
                        }
                    }
                }
            }
        }
        return res;
    }

    @GetMapping("/titreSejour/{nom}")
    public Map<String, Integer> getByTitreSejour(@PathVariable String nom){
        Map<String, Integer> res = new HashMap<>();
        List<Apprenant> atmp = this.apprenantDAO.findAll();
        List<Site> stmp = this.siteDAO.findAll();
        List<Groupe> gtmp = this.groupeDAO.findAll();
        for(Apprenant a : atmp) {
            for (Site s : stmp) {
                for (Groupe g : gtmp) {
                    if (s.getVille().equals(nom) && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                        if(a.getStatutSejour() != null){
                            if (res.containsKey(a.getStatutSejour())) {
                                res.put(a.getStatutSejour(), res.get(a.getStatutSejour()) + 1);
                            } else {
                                res.put(a.getStatutSejour(), 1);
                            }
                        } else {
                            if (res.containsKey("autres")) {
                                res.put("autres", res.get("autres") + 1);
                            } else {
                                res.put("autres", 1);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }


}
