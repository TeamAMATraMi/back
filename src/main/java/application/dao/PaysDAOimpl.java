package application.dao;

import application.model.Pays;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PaysDAOimpl implements PaysDAO {

    private List<Pays> listePays = new ArrayList<>();

    @Override
    public List<Pays> findAll() {
        return this.listePays;
    }

    @Override
    public Pays findById(int id) {
        for (Pays a : this.listePays) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void add(Pays pays) {
        this.listePays.add(pays);
    }

    @Override
    public Pays updateById(int id, Pays pays) {
        for (int i = 0; i < this.listePays.size(); i++) {
            if (this.listePays.get(i).getId() == id) {
                this.listePays.set(i, pays);
                return this.listePays.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listePays.size(); i++) {
            if (this.listePays.get(i).getId() == id) {
                this.listePays.remove(i);
            }
        }
    }
}
