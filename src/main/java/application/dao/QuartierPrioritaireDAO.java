package application.dao;

import application.model.QuartierPrioritaire;

import java.util.List;

public interface QuartierPrioritaireDAO {
    public List<QuartierPrioritaire> findAll();
    public QuartierPrioritaire findById(int id);
    public void add(QuartierPrioritaire formateur);
    public QuartierPrioritaire updateById(int id, QuartierPrioritaire formateur);
    public void deleteById(int id);
}
