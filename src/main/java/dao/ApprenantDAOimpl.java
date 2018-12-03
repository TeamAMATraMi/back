package dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ApprenantDAOimpl implements ApprenantDAO {

    private List<Apprenant> listeApprenants = new ArrayList<Apprenant>();

    @Override
    public List<Apprenant> findAll() {
        return this.listeApprenants;
    }

    @Override
    public Apprenant findById(int id) {
        for (Apprenant appr : listeApprenants) {
            if (appr.getId().equals(id)) {
                return appr;
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
        return null;
    }

    @Override
    public void deleteById(int id) {
        this.listeApprenants
    }
}
