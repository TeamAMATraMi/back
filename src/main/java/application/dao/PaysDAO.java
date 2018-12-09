package application.dao;

import application.model.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaysDAO extends JpaRepository<Pays, Integer> {
    public List<Pays> findAll();
    public Pays findById(int id);
    public Pays save(Pays formateur);
    public void deleteById(int id);
}
