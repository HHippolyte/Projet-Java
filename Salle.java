
package projetjava;


public class Salle {
    private String nom;
    private String ville;
    private String region;
    private String adresse; 
    private int NombrePlaces;
    public Salle(String n, String v, String r, String a, int nbp)
    {
        nom=n;
        ville=v;
        region=r;
        adresse=a;
        NombrePlaces=nbp;
        
    }

    public String getNom() {
        return nom;
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

    public void setNom(String nom) {
        this.nom = nom;
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
