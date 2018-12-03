package application.dao;

import application.model.Groupe;

import java.util.List;

public interface GroupeDAO {
    public List<Groupe> findAll();
    public Groupe findById(int id);
    public void add(Groupe groupe);
    public Groupe updateById(int id, Groupe groupe);
    public void deleteById(int id);
}
