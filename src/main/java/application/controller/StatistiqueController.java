package application.controller;

import application.dao.ApprenantDAO;
import application.model.Apprenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
