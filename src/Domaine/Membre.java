/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaine;

/**
 *
 * @author Maximilien
 */
public class Membre extends Personne{
    private String loginMembre;
    private String motDePasseMembre;
    
    public Membre (String nm, String pre,String tel, String em, String lm, String mdpm)
    {
        super(nm,pre,tel,em);
        loginMembre=lm;
        motDePasseMembre=mdpm;
        
    }

    public String getLoginMembre() {
        return loginMembre;
    }

    public String getMotDePasseMembre() {
        return motDePasseMembre;
    }

    public void setLoginMembre(String loginMembre) {
        this.loginMembre = loginMembre;
    }

    public void setMotDePasseMembre(String motDePasseMembre) {
        this.motDePasseMembre = motDePasseMembre;
    }
    
}
