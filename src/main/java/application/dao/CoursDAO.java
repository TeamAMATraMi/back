package application.dao;

import application.model.Cours;

import java.util.List;

public interface CoursDAO {
    public List<Cours> findAll();
    public Cours findById(int id);
    public void add(Cours cours);
    public Cours updateById(int id, Cours cours);
    public void deleteById(int id);
}
