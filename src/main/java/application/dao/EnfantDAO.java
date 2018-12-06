package application.dao;

import application.model.Enfant;

import java.util.List;

public interface EnfantDAO {
    public List<Enfant> findAll();
    public Enfant findById(int id);
    public void add(Enfant enfant);
    public Enfant updateById(int id, Enfant enfant);
    public void deleteById(int id);
}
