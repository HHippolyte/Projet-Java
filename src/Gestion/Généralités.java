/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;
import Domaine.*;
import GestionUtilisateur.*;
import java.util.ArrayList;
import projetjava.GestionUtilisateur.GestionOrganisateur;
/**
 *
 * @author Maximilien
 */
public class Généralités {
    private GestionMembre gm;
    private GestionOrganisateur go;
    public Généralités ()
    {
        gm= new GestionMembre();
        go= new GestionOrganisateur();
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
        System.out.println("2- Créer un compte en tant que membre");
        System.out.println("3 - S'authentifier en tant qu'organisateur");
        System.out.println("4- Créer un compte organisateur");
        i=Clavier.lireInt();
        switch (i)
                {
            case 1 : AuthentificationMembre() ;
            break;
            case 2 : gm.créerMembre();
                     gm.menuMembre();
            break;
            case 3 : AuthentificationOrganisateur() ;
            break;
            case 4 : go.créerOrganisateur();
                     go.menuOrganisateur();
                }
        
    }
    
    public void AuthentificationMembre()
    {
        Membre m;
        m=gm.RechercherMembre();
        if (m!= null) 
        {
            System.out.println("Bienvenue");
            gm.menuMembre();
        }
        System.out.println("Saisie incorrecte"); 
        MenuGénéral();
                
    }
    public void AuthentificationOrganisateur()
    {
        Organisateur o;
        o=go.RechercherOrganisateur();
        if (o!=null)
        {
            System.out.println("Bienvenue");
            go.menuOrganisateur();
        }
        System.out.println("Saisie incorrecte"); 
        MenuGénéral();
        }
    public static void main(String[] args) {
        Généralités g;
        g= new Généralités();
        g.MenuGénéral();
    }



}
