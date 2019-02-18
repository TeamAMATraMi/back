package application.controller;

import application.dao.AssociationDAO;
import application.model.Association;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssociationController {

    @Autowired
    private AssociationDAO associationDAO;

    @GetMapping("/associations")
    public List<Association> getAssociations() {
        return this.associationDAO.findAll();
    }

    @GetMapping("/associations/{id}")
    public Association getAssociationById(@PathVariable int id) {
        return this.associationDAO.findById(id);
    }

    @PostMapping("/associations")
    public void postAssociation(@RequestBody Association association) {
        this.associationDAO.save(association);
    }

    @PutMapping("/associations")
    public Association updateAssociation(@RequestBody Association association) {
        return this.associationDAO.save(association);
    }

    @DeleteMapping("/associations/{id}")
    public void deleteAssociation(@PathVariable int id) {
        this.associationDAO.deleteById(id);
    }
}
