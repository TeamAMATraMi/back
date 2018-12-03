package dao;

public interface SiteDAO {
    public List<Site> findAll();
    public Site findById(int id);
    public void add(Site site);
    public Site updateById(int id, Site site);
    public void deleteById(int id);
}
