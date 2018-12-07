package application.dao;

import application.model.Sejour;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SejourDAOimpl implements SejourDAO {

    private List<Sejour> listeSejours = new ArrayList<>();

    @Override
    public List<Sejour> findAll() {
        return this.listeSejours;
    }

    @Override
    public Sejour findById(int id) {
        for (Sejour a : this.listeSejours) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void add(Sejour sejour) {

    }

    @Override
    public Sejour updateById(int id, Sejour sejour) {
        for (int i = 0; i < this.listeSejours.size(); i++) {
            if (this.listeSejours.get(i).getId() == id) {
                this.listeSejours.set(i, sejour);
                return this.listeSejours.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listeSejours.size(); i++) {
            if (this.listeSejours.get(i).getId() == id) {
                this.listeSejours.remove(i);
            }
        }
    }
}
