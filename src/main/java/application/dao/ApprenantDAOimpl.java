package application.dao;

import application.dao.ApprenantDAO;
import application.model.Apprenant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ApprenantDAOimpl implements ApprenantDAO {

    private List<Apprenant> listeApprenants = new ArrayList<>();

    @Override
    public List<Apprenant> findAll() {
        return this.listeApprenants;
    }

    @Override
    public Apprenant findById(int id) {
        for (Apprenant a : listeApprenants) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void add(Apprenant apprenant) {
        this.listeApprenants.add(apprenant);
    }

    @Override
    public Apprenant updateById(int id, Apprenant apprenant) {
        for (int i = 0; i < this.listeApprenants.size(); i++) {
            if (this.listeApprenants.get(i).getId() == id) {
                this.listeApprenants.set(i, apprenant);
                return this.listeApprenants.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listeApprenants.size(); i++) {
            if (this.listeApprenants.get(i).getId() == id) {
                this.listeApprenants.remove(i);
            }
        }
    }
}
