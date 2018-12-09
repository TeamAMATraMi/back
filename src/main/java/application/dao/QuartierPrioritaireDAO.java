package application.dao;

import application.model.QuartierPrioritaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuartierPrioritaireDAO extends JpaRepository<QuartierPrioritaire, Integer> {
    public List<QuartierPrioritaire> findAll();
    public QuartierPrioritaire findById(int id);
    public QuartierPrioritaire save(QuartierPrioritaire formateur);
    public void deleteById(int id);
}
