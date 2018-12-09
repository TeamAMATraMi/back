package application.dao;

import application.model.Enfant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnfantDAO extends JpaRepository<Enfant, Integer> {
    public List<Enfant> findAll();
    public Enfant findById(int id);
    public Enfant save(Enfant enfant);
    public void deleteById(int id);
}
