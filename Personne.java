
package projetjava;


public class Personne {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    public Personne (String nm, String pre,String tel, String em)
    {
        nom=nm;
        prenom=pre;
        telephone=tel;
        email=em;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
