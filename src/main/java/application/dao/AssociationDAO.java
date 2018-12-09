package application.dao;

import application.model.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssociationDAO extends JpaRepository<Association, Integer> {
    public List<Association> findAll();
    public Association findById(int id);
    public Association save(Association association);
    public void deleteById(int id);
}
