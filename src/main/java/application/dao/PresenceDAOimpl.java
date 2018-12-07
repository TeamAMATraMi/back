package application.dao;

import application.model.Presence;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PresenceDAOimpl implements PresenceDAO {

    private List<Presence> listePresence = new ArrayList<>();

    @Override
    public List<Presence> findAll() {
        return this.listePresence;
    }

    @Override
    public Presence findById(int id) {
        for (Presence a : this.listePresence) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void add(Presence presence) {
        this.listePresence.add(presence);
    }

    @Override
    public Presence updateById(int id, Presence presence) {
        for (int i = 0; i < this.listePresence.size(); i++) {
            if (this.listePresence.get(i).getId() == id) {
                this.listePresence.set(i, presence);
                return this.listePresence.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listePresence.size(); i++) {
            if (this.listePresence.get(i).getId() == id) {
                this.listePresence.remove(i);
            }
        }
    }
}
