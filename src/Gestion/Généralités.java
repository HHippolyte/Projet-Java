/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;
import Domaine.*;
import GestionUtilisateur.*;
import GestionDomaine.GestionEvenement;
import java.util.ArrayList;
/**
 *
 * @author Maximilien
 */
public class Généralités {
    private GestionMembre gm;
    private GestionOrganisateur go;
    private GestionAbonné ga;
    private GestionEvenement ge;
    public Généralités ()
    {
        gm= new GestionMembre();
        go=new GestionOrganisateur();
        ga=new GestionAbonné();
    }

    public GestionMembre getGm() {
        return gm;
    }

    public void setGm(GestionMembre gm) {
        this.gm = gm;
    }

    public GestionOrganisateur getGo() {
        return go;
    }

    public void setGo(GestionOrganisateur go) {
        this.go = go;
    }
    
    
    public void MenuGénéral()
    {
        int i;
        System.out.println("Bienvenue, que voulez-vous faire ?");
        System.out.println("1 - S'authentifier en tant que membre de l'organisme");
        System.out.println("2- Créer un compte en tant que membre");
        System.out.println("3 - S'authentifier en tant qu'organisateur");
        System.out.println("4- Créer un compte organisateur");
        System.out.println("5- S'authentifier en tant qu'abonné");
        System.out.println("6 - Créer un compte abonné");
        System.out.println("7 - Afficher l'ensemble des évènements proposés");
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
            case 5: AuthentificationAbonné();
            break;
            case 6: ga.créerAbonne();
                    ga.menuAbonne();  
            break;
            case 7 : 
                    ge.AfficherEvenement();    
                }
        
    }
    
    public void AuthentificationMembre()
    {
        Membre m;
        int i;
        String lm,mdpm;
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
     public void AuthentificationAbonné()
     {
        Abonne a;
        a=ga.RechercherAbonne();
        if (a!=null)
        {
            System.out.println("Bienvenue");
            ga.menuAbonne();
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
