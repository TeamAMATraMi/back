package application.dao;

import application.model.QuartierPrioritaire;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuartierPrioritaireDAOimpl implements QuartierPrioritaireDAO {

    private List<QuartierPrioritaire> listeQuartierPrioritaire = new ArrayList<>();

    @Override
    public List<QuartierPrioritaire> findAll() {
        return this.listeQuartierPrioritaire;
    }

    @Override
    public QuartierPrioritaire findById(int id) {
        for (QuartierPrioritaire a : this.listeQuartierPrioritaire) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void add(QuartierPrioritaire quartier) {
        this.listeQuartierPrioritaire.add(quartier);
    }

    @Override
    public QuartierPrioritaire updateById(int id, QuartierPrioritaire quartier) {
        for (int i = 0; i < this.listeQuartierPrioritaire.size(); i++) {
            if (this.listeQuartierPrioritaire.get(i).getId() == id) {
                this.listeQuartierPrioritaire.set(i, quartier);
                return this.listeQuartierPrioritaire.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listeQuartierPrioritaire.size(); i++) {
            if (this.listeQuartierPrioritaire.get(i).getId() == id) {
                this.listeQuartierPrioritaire.remove(i);
            }
        }
    }
}
