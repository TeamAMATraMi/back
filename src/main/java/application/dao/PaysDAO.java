package application.dao;

import application.model.Pays;

import java.util.List;

public interface PaysDAO {
    public List<Pays> findAll();
    public Pays findById(int id);
    public void add(Pays formateur);
    public Pays updateById(int id, Pays formateur);
    public void deleteById(int id);
}
