package application.dao;

import application.model.Sejour;

import java.util.List;

public interface SejourDAO {
    public List<Sejour> findAll();
    public Sejour findById(int id);
    public void add(Sejour sejour);
    public Sejour updateById(int id, Sejour sejour);
    public void deleteById(int id);
}
