package application.controller;

import application.dao.PresenceDAO;
import application.model.Presence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
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
        this.presenceDAO.save(presence);
    }

    @PutMapping("/presences")
    public Presence updatePresence(@RequestBody Presence presence) {
        return this.presenceDAO.save(presence);
    }

    @DeleteMapping("/presences/{id}")
    public void deletePresence(@PathVariable int id) {
        this.presenceDAO.deleteById(id);
    }

    @GetMapping("/presencesC/{id}")
    public List<Presence> getPresencesByIdSeance(@PathVariable int id) {
        return this.presenceDAO.findByIdSeance(id);
    }

    @GetMapping("/presencesD/{id}")
    public List<Presence> getPresencesByDate(@PathVariable int id) {
        return this.presenceDAO.findByDate(id);
    }

    @GetMapping("/presencesIDDate/{idSeance}/{date}")
    public List<Presence> getPresencesByIdSeanceDate(@PathVariable int idSeance, @PathVariable int date){
        List<Presence> byDate = this.presenceDAO.findByDate(date);
        List<Presence> result = new ArrayList<Presence>();

        if(byDate != null && byDate.size() > 0) {
            for (Presence p : byDate) {
                if(p.getIdSeance() == idSeance){
                    result.add(p);
                }
            }
        }

        return result;
    }

}
