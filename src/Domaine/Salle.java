
package Domaine;


public class Salle {
    private String nomSalle;
    private String ville;
    private String region;
    private String adresse; 
    private int NombrePlaces;
    public Salle(String n, String v, String r, String a, int nbp)
    {
        nomSalle=n;
        ville=v;
        region=r;
        adresse=a;
        NombrePlaces=nbp;
        
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public String getVille() {
        return ville;
    }

    public String getRegion() {
        return region;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNombrePlaces() {
        return NombrePlaces;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNombrePlaces(int NombrePlaces) {
        this.NombrePlaces = NombrePlaces;
    }
  
}
