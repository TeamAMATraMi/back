package application.controller;

import application.dao.SeanceDAO;
import application.model.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SeanceController {

    @Autowired
    private SeanceDAO seanceDAO;

    @GetMapping("/seances")
    public List<Seance> getSeances() {
        return this.seanceDAO.findAll();
    }

    @GetMapping("/seances/{id}")
    public Seance getSeanceById(@PathVariable int id) {
        return this.seanceDAO.findById(id);
    }

    @PostMapping("/seances")
    public void postSeance(@RequestBody Seance seance) {
        this.seanceDAO.save(seance);
    }

    @PutMapping("/seances/{id}")
    public Seance updateSeance(@RequestBody Seance seance) {
        return this.seanceDAO.save(seance);
    }

    @DeleteMapping("/seances/{id}")
    public void deleteSeance(@PathVariable int id) {
        this.seanceDAO.deleteById(id);
    }
}
