package application.services;

import application.dao.CoursDAO;
import application.model.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursController {

    @Autowired
    private CoursDAO coursDAO;

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
        this.coursDAO.add(cours);
    }

    @PutMapping("/cours/{id}")
    public Cours updateCoursById(@PathVariable int id, @RequestBody Cours cours) {
        return this.coursDAO.updateById(id, cours);
    }

    @DeleteMapping("/cours/{id}")
    public void deleteCours(@PathVariable int id) {
        this.coursDAO.deleteById(id);
    }
}
