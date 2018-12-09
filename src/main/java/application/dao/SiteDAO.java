package application.dao;

import application.model.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SiteDAO extends JpaRepository<Site, Integer> {
    public List<Site> findAll();
    public Site findById(int id);
    public Site save(Site site);
    public void deleteById(int id);
}
