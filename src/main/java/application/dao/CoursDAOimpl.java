package application.dao;

import application.model.Cours;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CoursDAOimpl implements CoursDAO {

    private List<Cours> listeCours = new ArrayList<>();

    @Override
    public List<Cours> findAll() {
        return this.listeCours;
    }

    @Override
    public Cours findById(int id) {
        for (Cours a : listeCours) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void add(Cours cours) {
        this.listeCours.add(cours);
    }

    @Override
    public Cours updateById(int id, Cours cours) {
        for (int i = 0; i < this.listeCours.size(); i++) {
            if (this.listeCours.get(i).getId() == id) {
                this.listeCours.set(i, cours);
                return this.listeCours.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listeCours.size(); i++) {
            if (this.listeCours.get(i).getId() == id) {
                this.listeCours.remove(i);
            }
        }
    }
}
