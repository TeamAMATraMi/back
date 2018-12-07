package application.dao;

import application.model.Enfant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EnfantDAOimpl implements EnfantDAO {

    private List<Enfant> listeEnfants = new ArrayList<>();

    @Override
    public List<Enfant> findAll() {
        return listeEnfants;
    }

    @Override
    public Enfant findById(int id) {
        for (Enfant a : listeEnfants) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void add(Enfant enfant) {
        this.listeEnfants.add(enfant);
    }

    @Override
    public Enfant updateById(int id, Enfant enfant) {
        for (int i = 0; i < this.listeEnfants.size(); i++) {
            if (this.listeEnfants.get(i).getId() == id) {
                this.listeEnfants.set(i, enfant);
                return this.listeEnfants.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listeEnfants.size(); i++) {
            if (this.listeEnfants.get(i).getId() == id) {
                this.listeEnfants.remove(i);
            }
        }
    }
}
