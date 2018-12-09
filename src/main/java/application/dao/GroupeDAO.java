package application.dao;

import application.model.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupeDAO extends JpaRepository<Groupe, Integer> {
    public List<Groupe> findAll();
    public Groupe findById(int id);
    public Groupe save(Groupe groupe);
    public void deleteById(int id);
}
