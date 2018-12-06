package application.dao;

import application.model.Formateur;

import java.util.List;

public interface FormateurDAO {
    public List<Formateur> findAll();
    public Formateur findById(int id);
    public void add(Formateur formateur);
    public Formateur updateById(int id, Formateur formateur);
    public void deleteById(int id);
}
