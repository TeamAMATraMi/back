package application.controller;

import application.dao.SiteDAO;
import application.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
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
        this.siteDAO.save(site);
    }

    @PutMapping("/sites")
    public Site updateSite(@RequestBody Site site) {
        return this.siteDAO.save(site);
    }

    @DeleteMapping("/sites/{id}")
    public void deleteSite(@PathVariable int id) {
        this.siteDAO.deleteById(id);
    }
}
