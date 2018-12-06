package application.services;

import application.dao.ApprenantDAO;
import application.model.Apprenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApprenantController {

    @Autowired
    private ApprenantDAO apprenantDAO;

    @GetMapping("/apprenants")
    public List<Apprenant> getApprenants() {
        return this.apprenantDAO.findAll();
    }

    @GetMapping("/apprenants/{id}")
    public Apprenant getApprenantById(@PathVariable int id) {
        return this.apprenantDAO.findById(id);
    }

    @PostMapping("/apprenants")
    public void postApprenant(@RequestBody Apprenant apprenant) {
        this.apprenantDAO.add(apprenant);
    }

    @PutMapping("/apprenants/{id}")
    public Apprenant updateApprenantById(@PathVariable int id, @RequestBody Apprenant apprenant) {
        return this.apprenantDAO.updateById(id, apprenant);
    }

    @DeleteMapping("/apprenants/{id}")
    public void deleteApprenant(@PathVariable int id) {
        this.apprenantDAO.deleteById(id);
    }
}
