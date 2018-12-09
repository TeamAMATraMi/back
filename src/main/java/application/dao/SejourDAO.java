package application.dao;

import application.model.Sejour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SejourDAO extends JpaRepository<Sejour, Integer> {
    public List<Sejour> findAll();
    public Sejour findById(int id);
    public Sejour save(Sejour sejour);
    public void deleteById(int id);
}
