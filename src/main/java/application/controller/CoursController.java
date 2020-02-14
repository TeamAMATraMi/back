package application.controller;

import application.dao.CoursDAO;
import application.dao.SeanceDAO;
import application.model.Cours;

import application.model.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoursController {

    @Autowired
    private CoursDAO coursDAO;

    @Autowired
    private SeanceDAO seanceDAO;

    @GetMapping("/cours")
    public List<Cours> getCours() {
        return this.coursDAO.findAll();
    }

    @GetMapping("/cours/{id}")
    public Cours getCoursById(@PathVariable int id) {
        return this.coursDAO.findById(id);
    }

    @PostMapping("/cours")
    public void postCours(@RequestBody Cours cours) {
        this.coursDAO.save(cours);
    }

    @PutMapping("/cours/{id}")
    public Cours updateCours(@RequestBody Cours cours) {
        return this.coursDAO.save(cours);
    }

    @DeleteMapping("/cours/{id}")
    public void deleteCours(@PathVariable int id) {
        this.coursDAO.deleteById(id);
    }

    @PutMapping("/cours/{id}/addSeance")
    public void addSeance(@PathVariable int id, @RequestBody Seance seance){
        this.seanceDAO.save(seance);

        Cours c = this.coursDAO.findById(id);
        List<Seance> seances = c.getSeances();
        seances.add(seance);
        c.setSeances(seances);

        this.coursDAO.save(c);
    }
}
