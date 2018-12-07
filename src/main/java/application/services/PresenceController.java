package application.services;

import application.dao.PresenceDAO;
import application.model.Presence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PresenceController {

    @Autowired
    private PresenceDAO presenceDAO;

    @GetMapping("/presences")
    public List<Presence> getPresences() {
        return this.presenceDAO.findAll();
    }

    @GetMapping("/presences/{id}")
    public Presence getPresenceById(@PathVariable int id) {
        return this.presenceDAO.findById(id);
    }

    @PostMapping("/presences")
    public void postPresence(@RequestBody Presence presence) {
        this.presenceDAO.add(presence);
    }

    @PutMapping("/presences/{id}")
    public Presence updatePresenceById(@PathVariable int id, @RequestBody Presence presence) {
        return this.presenceDAO.updateById(id, presence);
    }

    @DeleteMapping("/presences/{id}")
    public void deletePresence(@PathVariable int id) {
        this.presenceDAO.deleteById(id);
    }
}
