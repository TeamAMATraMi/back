package application.dao;

import application.model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursDAO extends JpaRepository<Cours, Integer> {
    public List<Cours> findAll();
    public Cours findById(int id);
    public Cours save(Cours cours);
    public void deleteById(int id);
}
