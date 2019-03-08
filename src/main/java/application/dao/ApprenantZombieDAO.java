package application.dao;

import application.model.Apprenant;
import application.model.ApprenantZombie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApprenantZombieDAO extends JpaRepository<ApprenantZombie, Integer> {
    public List<ApprenantZombie> findAll();
    public ApprenantZombie findById(int id);
    public List<ApprenantZombie> findByIdGroupe(int id);
    public List<ApprenantZombie> findByNom(String nom);
    public ApprenantZombie save(ApprenantZombie apprenant);
    public void deleteById(int id);
}
