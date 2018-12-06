package application.dao;

import application.model.Presence;

import java.util.List;

public interface PresenceDAO {
    public List<Presence> findAll();
    public Presence findById(int id);
    public void add(Presence formateur);
    public Presence updateById(int id, Presence formateur);
    public void deleteById(int id);
}
