package application.dao;

import application.model.Site;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SiteDAOimpl implements SiteDAO {

    private static List<Site> listeSites = new ArrayList<>();
    static {
        listeSites.add(new Site(1, "Paris"));
        listeSites.add(new Site(2, "Lyon"));
    }

    @Override
    public List<Site> findAll() {
        return this.listeSites;
    }

    @Override
    public Site findById(int id) {
        for (Site s : listeSites) {
            if (s.getIdSite() == id) {
                return s;
            }
        }

        return null;
    }

    @Override
    public void add(Site site) {
        this.listeSites.add(site);
    }

    @Override
    public Site updateById(int id, Site site) {
        for (int i = 0; i < this.listeSites.size(); i++) {
            if (this.listeSites.get(i).getIdSite() == id) {
                this.listeSites.set(i, site);
                return this.listeSites.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.listeSites.size(); i++) {
            if (this.listeSites.get(i).getIdSite() == id) {
                this.listeSites.remove(i);
            }
        }
    }
}
