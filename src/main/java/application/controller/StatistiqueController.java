package application.controller;

import application.dao.ApprenantDAO;
import application.dao.PresenceDAO;
import application.dao.GroupeDAO;
import application.dao.QuartierPrioritaireDAO;
import application.dao.SiteDAO;
import application.model.Apprenant;
import application.model.Presence;
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
    @Autowired
    private PresenceDAO presenceDAO;


    
    /*
     * return a Map<String, int> with two keys : "F", "M" 
     * and the number of the people in the category
     * 
     */
    @GetMapping("/sexe/{nom}")
public Map<String, Integer> getBySexe(@PathVariable String nom) {
    Map<String, Integer> res = new HashMap<>();
    int cmpF = 0;
    int cmpH = 0;
    List<Apprenant> atmp = this.apprenantDAO.findAll();
    List<Site> stmp = this.siteDAO.findAll();
    List<Groupe> gtmp = this.groupeDAO.findAll();
    for(Apprenant a : atmp) {
        for (Site s : stmp) {
            for (Groupe g : gtmp) {
                if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                    if (a.getGenre() == 'F') {
                        cmpF++;
                    } 
		else{
                        cmpH++;
                    }


                }
            }
        }
    }
                res.put("F", cmpF);
                res.put("M", (cmpH));
                
                
                return res;
            
        
    }

/*
 * return a Map<String, int> with two keys : "F", "M"
 * and the number of the people in the category
 *
 */
@GetMapping("/presence/{nom}")
public Map<String, Integer> getByPresence(@PathVariable Integer nom) {
    Map<String, Integer> res = new HashMap<>();
    List<Presence> stmp = this.presenceDAO.findAll();
    int cmpP = 0;
    int cmpA=0;
    
        for (Presence s : stmp) {
            if ( nom ==s.getIdApprenant() && s.isPresent()) {
                cmpP++;
            }
            if ( nom==s.getIdApprenant() && s.isPresent()==false){
                cmpA++;
            }
        
    }
    res.put("Present", cmpP);
    res.put("Absent", cmpA);
    return res;
}

    
    /*
     * return a Map<String, int> where the keys are the age of the people
     * and the number of the people who are this age
     */
  
   @GetMapping("/age/{nom}")
public Map<String, Integer> getByAge(@PathVariable String nom) {
    Map<String, Integer> res = new HashMap<>();
    List<Apprenant> atmp = this.apprenantDAO.findAll();
    List<Site> stmp = this.siteDAO.findAll();
    List<Groupe> gtmp = this.groupeDAO.findAll();
    for(Apprenant a : atmp) {
        for (Site s : stmp) {
            for (Groupe g : gtmp) {
                if(!a.getDateNaissance().isEmpty() && (s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                    String[] date = a.getDateNaissance().split("-");
                    if(res.containsKey(date[0])){
                        res.put(date[0], res.get(date[0]) + 1);
                    }else{
                        res.put(date[0], 1);
                    }
                }
            }
        }}
    return res;
}
    
    /*
     * return a Map<String, int> where the keys are the site
     * and the number of the people who are in the site
     */
    @GetMapping("/site/{nom}")
    public Map<String, Integer> getBySite(@PathVariable String nom) {
        Map<String, Integer> res = new HashMap<>();
        List<Apprenant> atmp = this.apprenantDAO.findAll();
        List<Site> stmp = this.siteDAO.findAll();
        List<Groupe> gtmp = this.groupeDAO.findAll();
        for(Apprenant a : atmp) {
            for (Site s : stmp) {
                for (Groupe g : gtmp) {
                    if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
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



    /*
     * @Param :
     * String nom : Site name (nom = "all" to get all the sites)
     *
     * return a Map<String, int> where the keys are the nationality
     * and the number of the people who have this nationality
     */
    @GetMapping("/nationalite/{nom}")
    public Map<String, Integer> getByNationalite(@PathVariable String nom) {
        Map<String, Integer> res = new HashMap<>();
        List<Apprenant> atmp = this.apprenantDAO.findAll();
        List<Site> stmp = this.siteDAO.findAll();
        List<Groupe> gtmp = this.groupeDAO.findAll();
        for(Apprenant a : atmp){
            for (Site s : stmp) {
                for (Groupe g : gtmp) {
                    if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
			if(a.getPaysOrigine() != null){
                        if (res.containsKey(a.getPaysOrigine())) {
                            res.put(a.getPaysOrigine(), res.get(a.getPaysOrigine()) + 1);
                        } else {
                            res.put(a.getPaysOrigine(), 1);
                        }
}
			else {
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

    
    /*
     * @Param : 
     * String nom : Site name (nom = "all" to get all the sites)
     * 
     * return a Map<String, int> where the keys are the type of the residence permit 
     * and the number of the people who have this one
     */
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
    
    
    /*
     * @Param : 
     * String nom : Site name (nom = "all" to get all the sites)
     * 
     * return a Map<String, int> where the keys are the "priority area"
     * and the number of the people who are this category
     */
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

    
    /*
     * @Param :
     * String nom : Site name (nom = "all" to get all the sites)
     * 
     * return a Map<int, int> where the keys are the school level 
     * and the number of the people in each category
     */
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

    
    /*
     * @Param : 
     * String nom : Site name (nom = "all" to get all the sites)
     * 
     * return a Map<String, int> where the keys are the professional status
     * and the number of the people who are this category
     */
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

    
    /*
     * @Param : 
     * String nom : Site name (nom = "all" to get all the sites)
     * 
     * return a Map<int, int> where the keys are the professional status
     * and the number of the people who are this category
     */
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

    /*
     * @Param : 
     * String nom : Site name (nom = "all" to get all the sites)
     * 
     * return a Map<String, int> where the keys are the language level
     * and the number of the people who are this category
     */
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
    
    
    

   @GetMapping("/primoArrivant/{nom}")
public Map<String, Integer> getByPrimoArrivant(@PathVariable String nom) {
    Map<String, Integer> res = new HashMap<>();
    int cmpPrimoArrivant = 0;
    int cmpNonPrimo = 0;
    List<Apprenant> atmp = this.apprenantDAO.findAll();
    List<Site> stmp = this.siteDAO.findAll();
    List<Groupe> gtmp = this.groupeDAO.findAll();
    for (Apprenant a : atmp) {
        for (Site s : stmp) {
            for (Groupe g : gtmp) {
                if ((s.getVille().equals(nom) || nom.equals("all")) && a.getIdGroupe() == g.getId() && a.getIdGroupe() == g.getId() && g.getIdSite() == s.getId()) {
                    if (a.getPrimoArrivant()) {
                        cmpPrimoArrivant++;
                    } else {
                        cmpNonPrimo++;
                    }

                }

               
            }
        }
    }
    res.put("Primo", cmpPrimoArrivant);
    res.put("Non primo", cmpNonPrimo);
    return res;
}
}
