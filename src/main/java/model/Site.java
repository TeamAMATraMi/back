package model;

public class Site {
    private int idSite;
    private String ville;

    public Site(int idSite, String ville) {
        this.idSite = idSite;
        this.ville = ville;
    }

    public int getIdSite() { return idSite; }

    public String getVille() { return ville; }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}

