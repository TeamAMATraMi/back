package application.dao;

import application.model.Groupe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GroupeDAOimpl implements GroupeDAO {

    private List<Groupe> listeGroupes = new ArrayList<>();

    @Override
    public List<Groupe> findAll() {
        return this.listeGroupes;
    }

    @Override
    public Groupe findById(int id) {
        for (Groupe g : listeGroupes) {
            if (g.getIdGroupe() == id) {
                return g;
            }
        }
        return null;
    }

    @Override
    public void add(Groupe groupe) {
        this.listeGroupes.add(groupe);
    }

    @Override
    public Groupe updateById(int id, Groupe groupe) {
        for (int i = 0; i < this.listeGroupes.size(); i++) {
            if (this.listeGroupes.get(i).getIdSite() == id) {
                this.listeGroupes.set(i, groupe);
                return this.listeGroupes.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listeGroupes.size(); i++) {
            if (this.listeGroupes.get(i).getIdSite() == id) {
                this.listeGroupes.remove(i);
            }
        }
    }
}
