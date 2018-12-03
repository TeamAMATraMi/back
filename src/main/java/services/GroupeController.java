package services;

import dao.GroupeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        this.groupeDAO.add(groupe);
    }

    @PutMapping("/groupes/{id}")
    public Groupe updateGroupeById(@PathVariable int id, @RequestBody Groupe groupe) {
        return this.groupeDAO.updateById(id, groupe);
    }

    @DeleteMapping("/groupes/{id}")
    public void deleteGroupe(@PathVariable int id) {
        this.groupeDAO.deleteById(id);
    }
}
