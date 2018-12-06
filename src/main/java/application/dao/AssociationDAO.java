package application.dao;

import application.model.Association;

import java.util.List;

public interface AssociationDAO {
    public List<Association> findAll();
    public Association findById(int id);
    public void add(Association association);
    public Association updateById(int id, Association association);
    public void deleteById(int id);
}
