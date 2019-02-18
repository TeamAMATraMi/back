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

    @GetMapping("/pays")
    public List<Pays> getPays() {
        return this.paysDAO.findAll();
    }

    @GetMapping("/pays/{id}")
    public Pays getPaysById(@PathVariable int id) {
        return this.paysDAO.findById(id);
    }

    @PostMapping("/pays")
    public void postPays(@RequestBody Pays pays) {
        this.paysDAO.save(pays);
    }

    @PutMapping("/pays")
    public Pays updatePays(@RequestBody Pays pays) {
        return this.paysDAO.save(pays);
    }

    @DeleteMapping("/pays/{id}")
    public void deletePays(@PathVariable int id) {
        this.paysDAO.deleteById(id);
    }
}
