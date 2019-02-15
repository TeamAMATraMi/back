package application.services;

import application.dao.ApprenantDAO;
import application.model.Apprenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StatistiqueController {

    @Autowired
    private ApprenantDAO apprenantDAO;

    @GetMapping("/statistiques/sexe")
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
        res.put("F", (tmp.size() - cmpF));

        return res;
    }
}
