/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionUtilisateur;

import Domaine.*;
import Gestion.Généralités;
import GestionDomaine.GestionEvenement;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author humbe
 */
public class GestionOrganisateur {
    private ArrayList<Organisateur>listOrganisateur;
    private GestionEvenement ge;
    private Généralités g;
    
    
public GestionOrganisateur()
    {
    listOrganisateur= new ArrayList();
    ge= new GestionEvenement();
    
    }

    public ArrayList<Organisateur> getListOrganisateur() {
        return listOrganisateur;
    }

    public void setListOrganisateur(ArrayList<Organisateur> listOrganisateur) {
        this.listOrganisateur = listOrganisateur;
    }

    public GestionEvenement getGe() {
        return ge;
    }

    public void setGe(GestionEvenement ge) {
        this.ge = ge;
    }
    
  

public void menuOrganisateur()
    {
        int i;
        System.out.println("Bonjour, que voulez-vous faire ?");
        System.out.println("1 - Modifier mes informations Organisateur:");
        System.out.println("2 - Créer un événement:");
        System.out.println("3 - Annuler un evenement:");
        System.out.println("4 - Supprimer mon compte organisateur:");
        System.out.println("5 - Revenir au menu général");
        i=Clavier.lireInt();
        switch (i)
                {
            case 1 : 
                modifierOrganisateur();
                menuOrganisateur();
            break;
            case 2 : 
                creationEvenement();
                menuOrganisateur();
            break;

             case 3 :
                annulationEvenement();
                menuOrganisateur();
            break;
             case 4 :
                supprimerOrganisateur();
                menuOrganisateur();
            break;
            case 5: g.MenuGénéral();
            break;
            default: menuOrganisateur();
                }
    }     
    
    
public void créerOrganisateur()  
       {
          Organisateur o;
          String nomo, prenomo,telo,mailo,logo, mdpo;
          System.out.println("Veuillez saisir un login :");
          logo=Clavier.lireString();     
          o=RechercheOrganisateur(logo);
        if (o!= null) {
            System.out.println("Ce login est déjà utilisé !"); 
        }
        else
        {
        System.out.println("Veuillez saisir un mot de passe :");
        mdpo=Clavier.lireString();
        System.out.println("Veuillez saisir un nom :");
        nomo=Clavier.lireString();
        System.out.println("Veuillez saisir un prénom :");
        prenomo=Clavier.lireString();
        System.out.println("Veuillez saisir un téléphone :");
        telo=Clavier.lireString();
        System.out.println("Veuillez saisir un mail :");
        mailo=Clavier.lireString();
        o=new Organisateur(nomo, prenomo,telo,mailo,logo, mdpo);
        
        }
       }

 public Organisateur RechercherOrganisateur()
    {   
        Organisateur o=null;
        String logo, mdpo;
        System.out.println("Veuillez saisir le login de l'organisateur:");
        logo=Clavier.lireString();
        System.out.println("Veuillez saisir votre mot de passe :");
        mdpo=Clavier.lireString();
        if (!listOrganisateur.isEmpty())
        {
          for (int i=0; i<listOrganisateur.size(); i++)
            {
               if ((listOrganisateur.get(i).getLoginOrga().equalsIgnoreCase(logo))&& (listOrganisateur.get(i).getMotDePasseOrga().equalsIgnoreCase(mdpo)));
                {
                    o = listOrganisateur.get(i);
                }
            }
        }
        return o;
    }
 
 public Organisateur RechercheOrganisateur(String logo)
{
     Organisateur o=null;
     if (logo!=null)
     {
      if (!listOrganisateur.isEmpty())
        {
          for (int i=0; i<listOrganisateur.size(); i++)
            {
               if (listOrganisateur.get(i).getNomOrga().equalsIgnoreCase(logo))
                {
                    o = listOrganisateur.get(i);
                }
            }
        } 
      return o;
     }
     else
     {
        System.out.println("Veuillez saisir le login de l'organisateur:");
        logo=Clavier.lireString();
        if (!listOrganisateur.isEmpty())
        {
          for (int i=0; i<listOrganisateur.size(); i++)
            {
               if (listOrganisateur.get(i).getNomOrga().equalsIgnoreCase(logo))
                {
                    o = listOrganisateur.get(i);
                }
            }
        }
        return o;
     }
}
public Organisateur modifierOrganisateur()
{
     Organisateur o;
        String nomo,telo,mailo, mdpo;
        int i;
        System.out.println("Confirmation de la modification");
        o=RechercherOrganisateur();
        if (o== null) 
        {
            System.out.println("Annulation de la modification");
        }
        else 
        {
            System.out.println("Que voulez-vous modifier ?");
            System.out.println("1 - Modifier le nom:");
            System.out.println("3 - Modifier le téléphone:");
            System.out.println("4 - Modifier le mail:");
            System.out.println("5 - Modifier le mot de passe");
            i=Clavier.lireInt();
            switch (i)
            {
                
                case 1 : 
                    System.out.println("Saisissez le nouveau nom:");
                    nomo=Clavier.lireString();
                    o.setNomOrga(nomo);
                break;
                case 2 : 
                    System.out.println("Saisissez le nouveau numéro de téléphone:");
                    telo=Clavier.lireString();
                    o.getTelephoneOrga();
                break;
                case 3 : 
                    System.out.println("Saisissez un nouveau mail:");
                    mailo=Clavier.lireString();
                    o.setEmailorga(mailo);
                break; 
                case 4 :
                      System.out.println("Modifier votre mot de passe:");
                    mdpo=Clavier.lireString();
                    o.setMotDePasseOrga(mdpo);
                break;
}
        }
        return o;
}
public void supprimerOrganisateur()
{
    
        Organisateur o;
        String logo,mdpo;
        System.out.println("Veuillez confirmer votre suppression");
        o=RechercherOrganisateur();
        if (o!=null)
        {   
            listOrganisateur.remove(o);
            System.out.println("Compte supprimé");
            g.MenuGénéral(); 
        }
        else 
        {
            System.out.println("Annulation de la suppression du compte");
            
        }
}
public void creationEvenement()
{
    Evenement e = null;
    String  ti,t,d,vilcon,et,numeve;
    int nbs,an,m,j;
    Date dp;
    Salle rea=null;
    Membre vali=null;
    Organisateur orga=null;
    System.out.println("Veuillez rentrer le nom de l'événement");
    numeve=Clavier.lireString();
    System.out.println("Veuillez rentrer le nom de l'événement");
    ti=Clavier.lireString();
    System.out.println("Veuillez rentrer le type d'évenement");
    t=Clavier.lireString();
    System.out.println("Donner l'année prévue du spectacle ");
    an = Clavier.lireInt();
    System.out.println("Donner le mois prévu du spectacle ");
    m = Clavier.lireInt();
    System.out.println("Donner le jour prévu du spectacle ");
    j = Clavier.lireInt();
    dp = new Date(an-1900,m-1,j);
    System.out.println("Veuillez rentrer la ville concernée par l'événement");
    vilcon=Clavier.lireString();
    System.out.println("Veuillez rentrer le nombre de spectateurs prévu pour l'événement");
    nbs=Clavier.lireInt();
    System.out.println("Veuillez rentrer le détail de l'événement");
    d=Clavier.lireString();
    et="EN COURS";
    e=ge.créerEvenement(numeve, t, ti, d, vilcon, nbs, dp, et, rea, vali, orga);
}


public void annulationEvenement()
{
    Evenement e;
    String numeve;
    System.out.println("Saisissez le numéro de l'événement à annuler");
    numeve=Clavier.lireString();
    e=ge.RechercheEvenement(numeve);
    if (e!=null)
    {
     ge.annulerEvenement();
     System.out.println("Evenement annulé");
    }
    else
    {
    System.out.println("Evénement inexistant");
    }   
}


}
