package application.dao;

import application.model.Association;

import java.util.ArrayList;
import java.util.List;

public class AssociationDAOimpl implements AssociationDAO {

    private List<Association> listeAssociations = new ArrayList<>();

    @Override
    public List<Association> findAll() {
        return this.listeAssociations;
    }

    @Override
    public Association findById(int id) {
        for (Association a : listeAssociations) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void add(Association association) {
        this.listeAssociations.add(association);
    }

    @Override
    public Association updateById(int id, Association association) {
        for (int i = 0; i < this.listeAssociations.size(); i++) {
            if (this.listeAssociations.get(i).getId() == id) {
                this.listeAssociations.set(i, association);
                return this.listeAssociations.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listeAssociations.size(); i++) {
            if (this.listeAssociations.get(i).getId() == id) {
                this.listeAssociations.remove(i);
            }
        }
    }
}
