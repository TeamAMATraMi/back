package application.dao;

import application.model.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApprenantDAO extends JpaRepository<Apprenant, Integer> {
    public List<Apprenant> findAll();
    public Apprenant findById(int id);
    public List<Apprenant> findByIdGroupe(int id);
    public Apprenant save(Apprenant apprenant);
    public void deleteById(int id);
}
