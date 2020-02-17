package application.controller;

import application.dao.ApprenantDAO;
import application.dao.GroupeDAO;
import application.dao.QuartierPrioritaireDAO;
import application.dao.SiteDAO;
import application.model.Apprenant;
import application.model.Groupe;
import application.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")

public class StatistiqueController {

    @Autowired
    private ApprenantDAO apprenantDAO;
    @Autowired
    private SiteDAO siteDAO;
    @Autowired
    private GroupeDAO groupeDAO;
    @Autowired
    private QuartierPrioritaireDAO quartierDAO;

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

    @GetMapping("/nationalite/{nom}")
    public Map<String, Integer> getByNationalite(@PathVariable String nom) {
        Map<String, Integer> res = new HashMap<>();
        List<Apprenant> atmp = this.apprenantDAO.findAll();
        List<Site> stmp = this.siteDAO.findAll();
        List<Groupe> gtmp = this.groupeDAO.findAll();
        for(Apprenant a : atmp){
            for (Site s : stmp) {
                for (Groupe g : gtmp) {
                    if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                        if (res.containsKey(a.getPaysOrigine())) {
                            res.put(a.getPaysOrigine(), res.get(a.getPaysOrigine()) + 1);
                        } else {
                            res.put(a.getPaysOrigine(), 1);
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
                    if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                        if(a.getStatutSejour() != null){
                            if (res.containsKey(a.getStatutSejour())) {
                                res.put(a.getStatutSejour(), res.get(a.getStatutSejour()) + 1);
                            } else {
                                res.put(a.getStatutSejour(), 1);
                            }
                        } else {
                            if (res.containsKey("autre")) {
                                res.put("autre", res.get("autre") + 1);
                            } else {
                                res.put("autre", 1);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    @GetMapping("/quartierPrio/{nom}")
    public Map<String, Integer> getByQuartierPrio(@PathVariable String nom){
        Map<String, Integer> res = new HashMap<>();
        List<Apprenant> atmp = this.apprenantDAO.findAll();
        List<Site> stmp = this.siteDAO.findAll();
        List<Groupe> gtmp = this.groupeDAO.findAll();
        for(Apprenant a : atmp) {
            for (Site s : stmp) {
                for (Groupe g : gtmp) {
                    if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                        if(a.getQuartierPrioritaire() != null){
                            if (res.containsKey(this.quartierDAO.findById(a.getQuartierPrioritaire()).get().getNom())) {
                                res.put(this.quartierDAO.findById(a.getQuartierPrioritaire()).get().getNom(), res.get(this.quartierDAO.findById(a.getQuartierPrioritaire()).get().getNom()) + 1);
                            } else {
                                res.put(this.quartierDAO.findById(a.getQuartierPrioritaire()).get().getNom(), 1);
                            }
                        } else {
                            if (res.containsKey("autre")) {
                                res.put("autre", res.get("autre") + 1);
                            } else {
                                res.put("autre", 1);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    @GetMapping("/niveauScol/{nom}")
    public Map<Integer, Integer> getByNiveauScol(@PathVariable String nom){
        Map<Integer, Integer> res = new HashMap<>();
        List<Apprenant> atmp = this.apprenantDAO.findAll();
        List<Site> stmp = this.siteDAO.findAll();
        List<Groupe> gtmp = this.groupeDAO.findAll();
        for(Apprenant a : atmp) {
            for (Site s : stmp) {
                for (Groupe g : gtmp) {
                    if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                        if (res.containsKey(a.getTempsScolarisation())) {
                            res.put(a.getTempsScolarisation(), res.get(a.getTempsScolarisation()) + 1);
                        } else {
                            res.put(a.getTempsScolarisation(), 1);
                        }
                    }
                }
            }
        }
        return res;
    }

    @GetMapping("/statutPro/{nom}")
    public Map<String, Integer> getByStatutPro(@PathVariable String nom){
        Map<String, Integer> res = new HashMap<>();
        List<Apprenant> atmp = this.apprenantDAO.findAll();
        List<Site> stmp = this.siteDAO.findAll();
        List<Groupe> gtmp = this.groupeDAO.findAll();
        for(Apprenant a : atmp) {
            for (Site s : stmp) {
                for (Groupe g : gtmp) {
                    if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                        if (a.getStatutPro() != null) {
                            if (res.containsKey(this.quartierDAO.findById(a.getQuartierPrioritaire()).get().getNom())) {
                                res.put(a.getStatutPro(), res.get(a.getStatutPro()) + 1);
                            } else {
                                res.put(a.getStatutPro(), 1);
                            }
                        } else {
                            if (res.containsKey("autre")) {
                                res.put("autre", res.get("autre") + 1);
                            } else {
                                res.put("autre", 1);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    @GetMapping("/priseCharge/{nom}")
    public Map<Integer, Integer> getByPriseCharge(@PathVariable String nom){
        Map<Integer, Integer> res = new HashMap<>();
        List<Apprenant> atmp = this.apprenantDAO.findAll();
        List<Site> stmp = this.siteDAO.findAll();
        List<Groupe> gtmp = this.groupeDAO.findAll();
        for(Apprenant a : atmp) {
            for (Site s : stmp) {
                for (Groupe g : gtmp) {
                    if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                        if (res.containsKey(a.getPriseCharge())) {
                            res.put(a.getPriseCharge(), res.get(a.getPriseCharge()) + 1);
                        } else {
                            res.put(a.getPriseCharge(), 1);
                        }
                    }
                }
            }
        }
        return res;
    }

    @GetMapping("/niveauLangue/{nom}")
    public Map<String, Integer> getByNiveauLangue(@PathVariable String nom){
        Map<String, Integer> res = new HashMap<>();
        List<Apprenant> atmp = this.apprenantDAO.findAll();
        List<Site> stmp = this.siteDAO.findAll();
        List<Groupe> gtmp = this.groupeDAO.findAll();
        for(Apprenant a : atmp) {
            for (Site s : stmp) {
                for (Groupe g : gtmp) {
                    if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                        if (a.getNiveauLangue() != null) {
                            if (res.containsKey(a.getNiveauLangue())) {
                                res.put(a.getNiveauLangue(), res.get(a.getNiveauLangue()) + 1);
                            } else {
                                res.put(a.getNiveauLangue(), 1);
                            }
                        } else {
                            if (res.containsKey("autre")) {
                                res.put("autre", res.get("autre") + 1);
                            } else {
                                res.put("autre", 1);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    @GetMapping("/primoArrivant")
    public Map<String, Integer> getByPrimoArrivant() {
        Map<String, Integer> res = new HashMap<>();
        int cmpPrimoArrivant = 0;
        List<Apprenant> tmp = this.apprenantDAO.findAll();

        for(Apprenant a : tmp){
            if(a.getPrimoArrivant()){
                cmpPrimoArrivant++;
            }
        }
        res.put("Primo", cmpPrimoArrivant);
        res.put("Non primo", (tmp.size() - cmpPrimoArrivant));
        return res;
    }
}
