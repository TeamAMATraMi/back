package application.controller;

import application.dao.PresenceDAO;
import application.model.Presence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PresenceController {

    @Autowired
    private PresenceDAO presenceDAO;

    @GetMapping("/api/presences")
    public List<Presence> getPresences() {
        return this.presenceDAO.findAll();
    }

    @GetMapping("/api/presences/{id}")
    public Presence getPresenceById(@PathVariable int id) {
        return this.presenceDAO.findById(id);
    }

    @PostMapping("/api/presences")
    public void postPresence(@RequestBody Presence presence) {
        this.presenceDAO.save(presence);
    }

    @PutMapping("/api/presences")
    public Presence updatePresence(@RequestBody Presence presence) {
        return this.presenceDAO.save(presence);
    }

    @DeleteMapping("/api/presences/{id}")
    public void deletePresence(@PathVariable int id) {
        this.presenceDAO.deleteById(id);
    }

    @GetMapping("/api/presencesC/{id}")
    public List<Presence> getPresencesByIdCours(@PathVariable int id) {
        return this.presenceDAO.findByIdCours(id);
    }
}
