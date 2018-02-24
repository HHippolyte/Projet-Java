/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author Maximilien
 */
public class Organisateur {
    private String numOrga;
     private String nomOrga;
    private String telephoneOrga;
    private String emailorga;
    private String loginOrga;
    private String motDePasseOrga;
    public Organisateur (String numorga,String nomo,String prenomo, String telo, String mailo, String logo, String mdpo)
    {   
        numOrga=numorga;
        nomOrga=nomo;
        telephoneOrga=telo;
        emailorga=mailo;
        loginOrga=logo;
        motDePasseOrga=mdpo;
    }

    public void setNumOrga(String numOrga) {
        this.numOrga = numOrga;
    }
    
    
    
    
    public void setNomOrga(String nomOrga) {
        this.nomOrga = nomOrga;
    }


    public void setTelephoneOrga(String telephoneOrga) {
        this.telephoneOrga = telephoneOrga;
    }

    public void setEmailorga(String emailorga) {
        this.emailorga = emailorga;
    }

    public void setLoginOrga(String loginOrga) {
        this.loginOrga = loginOrga;
    }

    public void setMotDePasseOrga(String motDePasseOrga) {
        this.motDePasseOrga = motDePasseOrga;
    }

    public String getNumOrga() {
        return numOrga;
    }
    
    public String getNomOrga() {
        return nomOrga;
    }


    public String getTelephoneOrga() {
        return telephoneOrga;
    }

    public String getEmailorga() {
        return emailorga;
    }

    public String getLoginOrga() {
        return loginOrga;
    }

    public String getMotDePasseOrga() {
        return motDePasseOrga;
    }
    
}
