package application.controller;

import application.dao.PaysDAO;
import application.model.Pays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaysController {

    @Autowired
    private PaysDAO paysDAO;

    @GetMapping("/api/pays")
    public List<Pays> getPays() {
        return this.paysDAO.findAll();
    }

    @GetMapping("/api/pays/{id}")
    public Pays getPaysById(@PathVariable int id) {
        return this.paysDAO.findById(id);
    }

    @PostMapping("/api/pays")
    public void postPays(@RequestBody Pays pays) {
        this.paysDAO.save(pays);
    }

    @PutMapping("/api/pays")
    public Pays updatePays(@RequestBody Pays pays) {
        return this.paysDAO.save(pays);
    }

    @DeleteMapping("/api/pays/{id}")
    public void deletePays(@PathVariable int id) {
        this.paysDAO.deleteById(id);
    }
}
