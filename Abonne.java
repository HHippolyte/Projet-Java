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
public class Abonne extends Personne{
    private String loginAbonne;
    private String motDePasseAbonne;
    public Abonne (String nm, String pre,String tel, String em, String la, String mdpa)
    {
        super(nm,pre,tel,em);
        loginAbonne=la;
        motDePasseAbonne=mdpa;
    }

    public String getLoginAbonne() {
        return loginAbonne;
    }

    public String getMotDePasseAbonne() {
        return motDePasseAbonne;
    }

    public void setLoginAbonne(String loginAbonne) {
        this.loginAbonne = loginAbonne;
    }

    public void setMotDePasseAbonne(String motDePasseAbonne) {
        this.motDePasseAbonne = motDePasseAbonne;
    }
}
    
    

