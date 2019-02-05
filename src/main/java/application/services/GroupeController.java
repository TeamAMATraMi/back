package application.services;

import application.dao.GroupeDAO;
import application.model.Groupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupeController {

    @Autowired
    private GroupeDAO groupeDAO;

    @GetMapping("/groupes")
    public List<Groupe> getGroupes() {
        return this.groupeDAO.findAll();
    }

    @GetMapping("/groupes/{id}")
    public Groupe getGroupeById(@PathVariable int id) {
        return this.groupeDAO.findById(id);
    }

    @PostMapping("/groupes")
    public void postGroupe(@RequestBody Groupe groupe) {
        this.groupeDAO.save(groupe);
    }

    @PutMapping("/groupes")
    public Groupe updateGroupe(@RequestBody Groupe groupe) {
        return this.groupeDAO.save(groupe);
    }

    @DeleteMapping("/groupes/{id}")
    public void deleteGroupe(@PathVariable int id) {
        this.groupeDAO.deleteById(id);
    }

    @GetMapping("/groupesS/{id}")
    public List<Groupe> getGroupesBySite(@PathVariable int id) {
        return this.groupeDAO.findByIdSite(id);
    }

}
