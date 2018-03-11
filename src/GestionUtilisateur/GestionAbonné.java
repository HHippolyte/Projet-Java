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
 * @author Maximilien
 */
public class GestionAbonne {
   private ArrayList<Abonne>listAbonne;
   private GestionEvenement ge;
   private Généralités g;
    
    
    
    public  GestionAbonne()
    {
    listAbonne= new ArrayList();
    ge= new GestionEvenement();
    g= new Généralités();
    }

   public ArrayList<Abonne> getListAbonne() {
       return listAbonne;
   }

   public void setListAbonne(ArrayList<Abonne> listAbonne) {
        this.listAbonne = listAbonne;
    }

    public GestionEvenement getGe() {        return ge;
    }

    public void setGe(GestionEvenement ge) {
        this.ge = ge;
    }

    public Généralités getG() {
        return g;
    }

    public void setG(Généralités g) {
        this.g = g;
    }

public void menuAbonne()
    {
        int i;       
        System.out.println("Bonjour, que voulez-vous faire ?");
        System.out.println("1 - Modifier mes informations abonné:");
        System.out.println("2 - Créer une réservation:");
        System.out.println("3 - Modifier une réservation:");
        System.out.println("4 - Annuler une réservation:");
        System.out.println("5 - Supprimer mon compte organisateur:");
        System.out.println("6 - Revenir au menu général");
     i=Clavier.lireInt();        switch (i)              
     {            case 1 : 
                ModifierAbonne();
                menuAbonne();
            break;          
           case 2 : 
               ge.AfficherEvenement();
                creationReservation();
                menuAbonne();
            break;

             case 3 :               
               modifierReservation();
                menuAbonne();
            break;
             case 4 :
                annulerReservation();
              menuAbonne();
            break;
            case 5 :
                supprimerAbonne();
                menuAbonne();
            break;
            
            case 6: g.MenuGénéral();          
            break;
            default: menuAbonne();              
     }   
    }     

        public void créerAbonne()     
        {
         Abonne a;          
         String nm,pre,tel,em,la,mdpa;        
         System.out.println("Veuillez saisir un login :");
         la=Clavier.lireString();     
         a=RechercherAbonne();
                if (a!= null) 
                {
            System.out.println("Ce login est déjà utilisé !"); 
                }
        else
        {
        System.out.println("Veuillez saisir un mot de passe :");
        mdpa=Clavier.lireString();      
        System.out.println("Veuillez saisir un nom :");
        nm=Clavier.lireString();
        System.out.println("Veuillez saisir un prénom :");
        pre=Clavier.lireString();
        System.out.println("Veuillez saisir un téléphone :");
        tel=Clavier.lireString();
        System.out.println("Veuillez saisir un mail :");
        em=Clavier.lireString();
        a=new Abonne(nm, pre,tel,em,la,mdpa);
        
        }
       }
public Abonne RechercherAbonne()
    {   
        Abonne a=null;
        String la, mdpa;
        System.out.println("Veuillez saisir le login du membre:");
        la=Clavier.lireString();
        System.out.println("Veuillez saisir votre mot de passe :");
        mdpa=Clavier.lireString();       
        if (!listAbonne.isEmpty())
        {
          for (int i=0; i<listAbonne.size(); i++)
            {
               if ((listAbonne.get(i).getLoginAbonne().equalsIgnoreCase(la))&& (listAbonne.get(i).getMotDePasseAbonne().equalsIgnoreCase(mdpa)));
                {
                    a= listAbonne.get(i);
                }
            }
        }
        return a;
    }
public Abonne ModifierAbonne()
{
   Abonne a;
        String nm, pre,tel,em,la,mdpa;
        int i;
        System.out.println("Confirmation de la modification");
        a=RechercherAbonne();
        if (a== null) 
        {
            System.out.println("Annulation de la modification");
        }
        else 
        {
            System.out.println("Que voulez-vous modifier ?");
            System.out.println("1 - Modifier le nom:");
            System.out.println("2 - Modifier le prénom:");
            System.out.println("3 - Modifier le téléphone:");
            System.out.println("4 - Modifier le mail:");
            System.out.println("5 - Modifier le mot de passe");
            i=Clavier.lireInt();
            switch (i)
            {
                
                case 1 : 
                    System.out.println("Saisissez le nouveau nom:");
                    nm=Clavier.lireString();
                    a.setNom(nm);
                break;
                case 2 : 
                    System.out.println("Saisissez le nouveau prénom :");
                    pre=Clavier.lireString();
                    a.setPrenom(pre);
                break;
                case 3 :
                    System.out.println("Saisissez un numéro de téléphone :");
                    tel=Clavier.lireString();
                    a.setTelephone(tel);
                break;
                case 4 : 
                    System.out.println("Saisissez un nouveau mail:");
                    em=Clavier.lireString();
                    a.setEmail(em);
                break; 
                case 5 :
                      System.out.println("Modifier votre mot de passe:");
                    mdpa=Clavier.lireString();
                    a.setMotDePasseAbonne(mdpa);
                break;
}
        }
        return a;
}

public void creationReservation()
{
    Reservation r;
    Evenement e;
    int nbplaces,numres=0;
    Date daterés;
    Abonne proc;
    Evenement reser;
    String  ti,t,d,vilcon,et,numeve,nomres;
    int nbs,an,m,j;    Date dp;
    Salle rea;    Membre vali=null;
    Organisateur orga=null;
    System.out.println("Quel est le numéro de l'évènement voulu : ");
    numeve=Clavier.lireString();
    reser=ge.RechercheEvenement(numeve);

    System.out.println("Veuillez saisir le nombre de places voulues :");
    nbplaces=Clavier.lireInt();
    System.out.println("Quel est le nom personnalisé de votre réservation : ");
    nomres=Clavier.lireString();
   
    an = new Date().getYear();
    
    m = new Date().getDate();
    
    j = new Date().getDay();
    daterés = new Date(an-1900,m-1,j);
    if (r.getNbspectateurs()>rea.getNombrePlaces())
    {
        System.out.println("Réservation impossible, nombre de places insuffisantes il reste");
    }
    else 
    {
    System.out.println("Veuillez confirmer votre réservation :");
    proc=RechercherAbonne();
    r=new Reservation (numres,nomres,nbplaces,daterés,proc,reser);
    }
    if (r.
            {
                
            }
}
   
public void modifierReservation()
{
    
}
public void annulerReservation()
{
    }
public void supprimerAbonne()
{    
     Abonne a;
        String logo,mdpo;
        System.out.println("Veuillez confirmer votre suppression");
        a=RechercherAbonne();
        if (a!=null)
        {   
            listAbonne.remove(a);
            System.out.println("Compte supprimé");
            g.MenuGénéral(); 
        }
        else 
        {
            System.out.println("Annulation de la suppression du compte");
           
        }
}
}

    }

public void menuAbonne()
    {
        int i;       
        System.out.println("Bonjour, que voulez-vous faire ?");
        System.out.println("1 - Modifier mes informations abonné:");
        System.out.println("2 - Créer une réservation:");
        System.out.println("3 - Modifier une réservation:");
        System.out.println("4 - Annuler une réservation:");
        System.out.println("5 - Supprimer mon compte organisateur:");
        System.out.println("6 - Revenir au menu général");
     i=Clavier.lireInt();        switch (i)              
     {            case 1 : 
                ModifierAbonne();
                menuAbonne();
            break;          
           case 2 : 
               ge.AfficherEvenement();
                creationReservation();
                menuAbonne();
            break;

             case 3 :               
               modifierReservation();
                menuAbonne();
            break;
             case 4 :
                annulerReservation();
              menuAbonne();
            break;
            case 5 :
                supprimerAbonne();
                menuAbonne();
            break;
            
            case 6: g.MenuGénéral();          
            break;
            default: menuAbonne();              
     }   
    }     

        public void créerAbonne()     
        {
         Abonne a;          
         String nm,pre,tel,em,la,mdpa;        
         System.out.println("Veuillez saisir un login :");
         la=Clavier.lireString();     
         a=RechercherAbonne();
                if (a!= null) 
                {
            System.out.println("Ce login est déjà utilisé !"); 
                }
        else
        {
        System.out.println("Veuillez saisir un mot de passe :");
        mdpa=Clavier.lireString();      
        System.out.println("Veuillez saisir un nom :");
        nm=Clavier.lireString();
        System.out.println("Veuillez saisir un prénom :");
        pre=Clavier.lireString();
        System.out.println("Veuillez saisir un téléphone :");
        tel=Clavier.lireString();
        System.out.println("Veuillez saisir un mail :");
        em=Clavier.lireString();
        a=new Abonne(nm, pre,tel,em,la,mdpa);
        
        }
       }
public Abonne RechercherAbonne()
    {   
        Abonne a=null;
        String la, mdpa;
        System.out.println("Veuillez saisir le login du membre:");
        la=Clavier.lireString();
        System.out.println("Veuillez saisir votre mot de passe :");
        mdpa=Clavier.lireString();       
        if (!listAbonne.isEmpty())
        {
          for (int i=0; i<listAbonne.size(); i++)
            {
               if ((listAbonne.get(i).getLoginAbonne().equalsIgnoreCase(la))&& (listAbonne.get(i).getMotDePasseAbonne().equalsIgnoreCase(mdpa)));
                {
                    a= listAbonne.get(i);
                }
            }
        }
        return a;
    }
public Abonne ModifierAbonne()
{
   Abonne a;
        String nm, pre,tel,em,la,mdpa;
        int i;
        System.out.println("Confirmation de la modification");
        a=RechercherAbonne();
        if (a== null) 
        {
            System.out.println("Annulation de la modification");
        }
        else 
        {
            System.out.println("Que voulez-vous modifier ?");
            System.out.println("1 - Modifier le nom:");
            System.out.println("2 - Modifier le prénom:");
            System.out.println("3 - Modifier le téléphone:");
            System.out.println("4 - Modifier le mail:");
            System.out.println("5 - Modifier le mot de passe");
            i=Clavier.lireInt();
            switch (i)
            {
                
                case 1 : 
                    System.out.println("Saisissez le nouveau nom:");
                    nm=Clavier.lireString();
                    a.setNom(nm);
                break;
                case 2 : 
                    System.out.println("Saisissez le nouveau prénom :");
                    pre=Clavier.lireString();
                    a.setPrenom(pre);
                break;
                case 3 :
                    System.out.println("Saisissez un numéro de téléphone :");
                    tel=Clavier.lireString();
                    a.setTelephone(tel);
                break;
                case 4 : 
                    System.out.println("Saisissez un nouveau mail:");
                    em=Clavier.lireString();
                    a.setEmail(em);
                break; 
                case 5 :
                      System.out.println("Modifier votre mot de passe:");
                    mdpa=Clavier.lireString();
                    a.setMotDePasseAbonne(mdpa);
                break;
}
        }
        return a;
}

public void creationReservation()
{
    Reservation r= null;
    Evenement e;
    
    int nbplaces,numres;
    Date daterés;
    Abonne proc;
    Evenement reser;
    String  ti,t,d,vilcon,et,numeve,nomres;
    int nbs,an,m,j;    Date dp;
    Salle rea;    Membre vali=null;
    Organisateur orga=null;
    System.out.println("Quel est le numéro de l'évènement voulu : ");
    numeve=Clavier.lireString();
    reser=ge.RechercheEvenement(numeve);
    numres=r.getNumreserv();
    System.out.println("Veuillez saisir le nombre de places voulues :");
    nbplaces=Clavier.lireInt();
    System.out.println("Quel est le nom personnalisé de votre réservation : ");
    nomres=Clavier.lireString();
    System.out.println("Donner l'année prévue de l'évènement: ");
    an = Clavier.lireInt();
    System.out.println("Donner le mois prévu de l'évènement: ");
    m = Clavier.lireInt();
    System.out.println("Donner le jour prévu : ");
    j = Clavier.lireInt();
    daterés = new Date(an-1900,m-1,j);
    if (r.getNbspectateurs()>rea.getNombrePlaces())
    {
        System.out.println("Réservation impossible, nombre de places insuffisantes il reste");
    }
    else 
    {
    System.out.println("Veuillez confirmer votre réservation :");
    proc=RechercherAbonne();
    r=new Reservation (numres,nomres,nbplaces,daterés,proc,reser);
    }
    if (r.
            {
                
            }
}
   
public void modifierReservation()
{
    
}
public void annulerReservation()
{
    }
public void supprimerAbonne()
{    
     Abonne a;
        String logo,mdpo;
        System.out.println("Veuillez confirmer votre suppression");
        a=RechercherAbonne();
        if (a!=null)
        {   
            listAbonne.remove(a);
            System.out.println("Compte supprimé");
            g.MenuGénéral(); 
        }
        else 
        {
            System.out.println("Annulation de la suppression du compte");
           
        }
}
}
