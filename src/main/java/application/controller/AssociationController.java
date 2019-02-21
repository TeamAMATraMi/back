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

    @GetMapping("/api/associations")
    public List<Association> getAssociations() {
        return this.associationDAO.findAll();
    }

    @GetMapping("/api/associations/{id}")
    public Association getAssociationById(@PathVariable int id) {
        return this.associationDAO.findById(id);
    }

    @PostMapping("/api/associations")
    public void postAssociation(@RequestBody Association association) {
        this.associationDAO.save(association);
    }

    @PutMapping("/api/associations")
    public Association updateAssociation(@RequestBody Association association) {
        return this.associationDAO.save(association);
    }

    @DeleteMapping("/api/associations/{id}")
    public void deleteAssociation(@PathVariable int id) {
        this.associationDAO.deleteById(id);
    }
}
