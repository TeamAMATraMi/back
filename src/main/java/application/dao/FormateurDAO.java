package application.dao;

import application.model.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormateurDAO extends JpaRepository<Formateur, Integer> {
    public List<Formateur> findAll();
    public Formateur findById(int id);
    public Formateur save(Formateur formateur);
    public void deleteById(int id);
}
