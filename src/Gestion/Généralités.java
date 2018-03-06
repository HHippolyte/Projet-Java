/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;
import Domaine.*;
import GestionUtilisateur.*;
import java.util.ArrayList;
/**
 *
 * @author Maximilien
 */
public class Généralités {
    private GestionMembre gm;
    public Généralités ()
    {
        gm= new GestionMembre();
    }

    public GestionMembre getGm() {
        return gm;
    }

    public void setGm(GestionMembre gm) {
        this.gm = gm;
    }
    
    public void MenuGénéral()
    {
        int i;
        System.out.println("Bienvenue, que voulez-vous faire ?");
        System.out.println("1 - S'authentifier en tant que membre de l'organisme");
        i=Clavier.lireInt();
        switch (i)
                {
            case 1 : AuthentificationMembre() ;
                     gm.menuMembre();
            break;
                }
    }
    
    public void AuthentificationMembre()
    {
        Membre m;
        int i;
        String lm,mdpm;
        System.out.println("Saisissez le login :");
        lm=Clavier.lireString();
        m=gm.RechercherMembre();
        if (m== null) 
        {
            System.out.println("Saisie incorrecte, réessayez");
        }
        System.out.println("Membre trouvé");
       
           
    }
    public static void main(String[] args) {
        Généralités g;
        g= new Généralités();
        g.MenuGénéral();
    }
    
}
