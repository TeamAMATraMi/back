package application.dao;

import application.model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeanceDAO extends JpaRepository<Seance, Integer> {
    public List<Seance> findAll();
    public Seance findById(int id);
    public Seance save(Seance seance);
    public void deleteById(int id);
    public List<Seance> findByIdCours(int id);
}
