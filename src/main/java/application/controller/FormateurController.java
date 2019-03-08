package application.controller;

import application.dao.FormateurDAO;
import application.model.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FormateurController {

    @Autowired
    private FormateurDAO formateurDAO;

    @GetMapping("/formateurs")
    public List<Formateur> getFormateurs() {
        return this.formateurDAO.findAll();
    }

    @GetMapping("/formateurs/{id}")
    public Formateur getFormateurById(@PathVariable int id) {
        return this.formateurDAO.findById(id);
    }

    @GetMapping("/formateursSite/{id}")
    public  List<Formateur> getFormateurBySite(@PathVariable int id) {
        return this.formateurDAO.findByIdSite(id);
    }

    @GetMapping("/formateursExist/{nom}/{prenom}")
    public boolean exist(@PathVariable String nom, @PathVariable String prenom){
        List<Formateur> formateurs = this.formateurDAO.findByNom(nom);
        boolean result = false;
        if(formateurs != null) {
            for (Formateur f : formateurs) {
                if(f.getPrenom().toLowerCase().equals(prenom.toLowerCase())){
                    result = true;
                }
            }
        }
        return result;
    }

    @PostMapping("/formateurs")
    public void postFormateur(@RequestBody Formateur formateur) {
        this.formateurDAO.save(formateur);
    }

    @PutMapping("/formateurs/{id}")
    public Formateur updateFormateur(@RequestBody Formateur formateur) {
        return this.formateurDAO.save(formateur);
    }

    @DeleteMapping("/formateurs/{id}")
    public void deleteFormateur(@PathVariable int id) {
        this.formateurDAO.deleteById(id);
    }
}
