package application.dao;

import application.model.Formateur;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FormateurDAOimpl implements FormateurDAO {

    private List<Formateur> listeFormateurs = new ArrayList<>();

    @Override
    public List<Formateur> findAll() {
        return listeFormateurs;
    }

    @Override
    public Formateur findById(int id) {
        for (Formateur a : listeFormateurs) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void add(Formateur formateur) {
        this.listeFormateurs.add(formateur);
    }

    @Override
    public Formateur updateById(int id, Formateur formateur) {
        for (int i = 0; i < this.listeFormateurs.size(); i++) {
            if (this.listeFormateurs.get(i).getId() == id) {
                this.listeFormateurs.set(i, formateur);
                return this.listeFormateurs.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listeFormateurs.size(); i++) {
            if (this.listeFormateurs.get(i).getId() == id) {
                this.listeFormateurs.remove(i);
            }
        }
    }
}
