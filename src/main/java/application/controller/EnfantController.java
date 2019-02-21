package application.controller;

import application.dao.EnfantDAO;
import application.model.Enfant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnfantController {

    @Autowired
    private EnfantDAO enfantDAO;

    @GetMapping("/api/enfants")
    public List<Enfant> getEnfants() {
        return this.enfantDAO.findAll();
    }

    @GetMapping("/api/enfants/{id}")
    public Enfant getEnfantById(@PathVariable int id) {
        return this.enfantDAO.findById(id);
    }

    @PostMapping("/api/enfants")
    public void postEnfant(@RequestBody Enfant enfant) {
        this.enfantDAO.save(enfant);
    }

    @PutMapping("/api/enfants")
    public Enfant updateEnfant(@RequestBody Enfant enfant) {
        return this.enfantDAO.save(enfant);
    }

    @DeleteMapping("/api/enfants/{id}")
    public void deleteEnfant(@PathVariable int id) {
        this.enfantDAO.deleteById(id);
    }
}
