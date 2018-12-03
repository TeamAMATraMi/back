package application.dao;

import application.model.Apprenant;

import java.util.List;

public interface ApprenantDAO {
    public List<Apprenant> findAll();
    public Apprenant findById(int id);
    public void add(Apprenant apprenant);
    public Apprenant updateById(int id, Apprenant apprenant);
    public void deleteById(int id);
}
