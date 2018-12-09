package application.services;

import application.dao.EnfantDAO;
import application.model.Enfant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnfantController {

    @Autowired
    private EnfantDAO enfantDAO;

    @GetMapping("/enfants")
    public List<Enfant> getEnfants() {
        return this.enfantDAO.findAll();
    }

    @GetMapping("/enfants/{id}")
    public Enfant getEnfantById(@PathVariable int id) {
        return this.enfantDAO.findById(id);
    }

    @PostMapping("/enfants")
    public void postEnfant(@RequestBody Enfant enfant) {
        this.enfantDAO.save(enfant);
    }

    @PutMapping("/enfants")
    public Enfant updateEnfant(@RequestBody Enfant enfant) {
        return this.enfantDAO.save(enfant);
    }

    @DeleteMapping("/enfants/{id}")
    public void deleteEnfant(@PathVariable int id) {
        this.enfantDAO.deleteById(id);
    }
}
