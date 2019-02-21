package application.dao;

import application.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur, Integer> {
    public Utilisateur findById(int id);
    public Utilisateur findByUsername(String nom);
}
