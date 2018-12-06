package application.services;

import application.dao.SiteDAO;
import application.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SiteController {

    @Autowired
    private SiteDAO siteDAO;

    @GetMapping("/sites")
    public List<Site> getSites() {
        return this.siteDAO.findAll();
    }

    @GetMapping("/sites/{id}")
    public Site getSiteById(@PathVariable int id) {
        return this.siteDAO.findById(id);
    }

    @PostMapping("/sites")
    public void postSite(@RequestBody Site site) {
        this.siteDAO.add(site);
    }

    @PutMapping("/sites/{id}")
    public Site updateSiteById(@PathVariable int id, @RequestBody Site site) {
        return this.siteDAO.updateById(id, site);
    }

    @DeleteMapping("/sites/{id}")
    public void deleteSite(@PathVariable int id) {
        this.siteDAO.deleteById(id);
    }
}
