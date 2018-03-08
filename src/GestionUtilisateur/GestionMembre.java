/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionUtilisateur;
import Domaine.*;
import GestionDomaine.GestionSalle;
import Gestion.Généralités;
import java.util.ArrayList;
/**
 *
 * @author Maximilien
 */
public class GestionMembre {
    private GestionSalle gs;
    private ArrayList<Membre>listMembre;
    private Généralités g;
    private Salle s;
    
    
    public GestionMembre()
    {   
        
        listMembre=new ArrayList ();
        gs=new GestionSalle ();
    }

    public void setListMembre(ArrayList<Membre> listMembre) {
        this.listMembre = listMembre;
    }

    public ArrayList<Membre> getListMembre() {
        return listMembre;
    }
    
    public GestionSalle getGs() {
        return gs;
    }

    public void setGs(GestionSalle gs) {
        this.gs = gs;
    }

    public void setG(Généralités g) {
        this.g = g;
    }

    public Généralités getG() {
        return g;
    }

   

   
    
 
    
  
    
    
    public void menuMembre ()
    {
        int i;
        System.out.println("Bonjour, que voulez-vous faire ?");
        System.out.println("1 - Créer une salle :");
        System.out.println("2 - Modifier une salle :");
        System.out.println("3 - Supprimer une salle :");
        System.out.println("4 - Validation des évènements");
        i=Clavier.lireInt();
        switch (i)
                {
            case 1 : 
                créationSalle();
                menuMembre ();
            break;
            case 2 : 
                AfficherSalle();
                ModifierSalle();
                menuMembre();
            break;
            case 3 :
                gs.SupprimerSalle();
                menuMembre();
            break;
            case 4: g.MenuGénéral();
             
                      
        }
    }
    public Salle créationSalle()
    {   
        Salle s;
        String n=null,v,r,a;
        int nbp;
        System.out.println("Nom de la salle :");
        n=Clavier.lireString();
        s=gs.RechercheSalle(n);
        if (s!= null) {
            System.out.println("Cette salle existe déjà !"); }
        else
        {
        System.out.println("Veuillez saisir la ville :");
        v=Clavier.lireString();
        System.out.println("Veuillez saisir sa région :");
        r=Clavier.lireString();
        System.out.println("Veuillez saisir son adresse :");
        a=Clavier.lireString();
        System.out.println("Veuillez saisir sa capacité :");
        nbp=Clavier.lireInt();
        s=gs.créerSalle(n, v, r, a, nbp);
        }
        return s;
    }

    public Salle ModifierSalle()
    {
        Salle s;
        String n,v,r,a,ne,ve,re,ae;
        int nbp,i,nbpe;
         System.out.println("Nom de la salle :");
        n=Clavier.lireString();
        s=gs.RechercheSalle(n);
        if (s== null) 
        {
            System.out.println("Salle non trouvée, réessayez");
        }
        else 
        {
            System.out.println("Que voulez-vous modifier ?");
            System.out.println("1 - Modifier la ville :");
            System.out.println("2 - Modifier la région :");
            System.out.println("3 - Modifier l'adresse de la salle :");
            System.out.println("4 - Modifier le nombre de places :");
            i=Clavier.lireInt();
            switch (i)
            {
              
                case 1 : 
                    System.out.println("Saisissez le nom de la ville :");
                    v=Clavier.lireString();
                    s.setVille(v);
                break;
                case 2 : 
                    System.out.println("Saisissez le nom de la région :");
                    r=Clavier.lireString();
                    s.setRegion(r);
                break;
                case 3 :
                    System.out.println("Saisissez le nom de l'adresse :");
                    a=Clavier.lireString();
                    s.setAdresse(a);
                break;
                case 4 : 
                    System.out.println("Saisissez le nombre de la place :");
                    nbp=Clavier.lireInt();
                    s.setNombrePlaces(nbp);
                break;
                    
        }
                    
            }
            
            return s;
        }
    
    
       public void créerMembre()  
       {
          Membre m;
          String lm,nm,pre,tel,em,mdpm;
          System.out.println("Veuillez saisir un login :");
          lm=Clavier.lireString();     
          m=RechercheMembre();
        if (m!= null) {
            System.out.println("Ce login est déjà utilisé !"); 
        }
        else
        {
        System.out.println("Veuillez saisir un mot de passe :");
        mdpm=Clavier.lireString();
        System.out.println("Veuillez saisir un nom :");
        nm=Clavier.lireString();
        System.out.println("Veuillez saisir un prénom :");
        pre=Clavier.lireString();
        System.out.println("Veuillez saisir un téléphone :");
        tel=Clavier.lireString();
        System.out.println("Veuillez saisir un mail :");
        em=Clavier.lireString();
        m=new Membre(nm,pre,tel,em,lm,mdpm);
        }
       }
    
    public Membre RechercheMembre ()
    {
        Membre m=null;
        String lm,nm;
        System.out.println("Veuillez saisir le login du membre:");
        lm=Clavier.lireString();
        if (!listMembre.isEmpty())
        {
          for (int i=0; i<listMembre.size(); i++)
            {
               if (listMembre.get(i).getNom().equalsIgnoreCase(lm))
                {
                    m = listMembre.get(i);
                }
            }
        }
        return m;
    }
    
    public Membre RechercherMembre ()
    {
        Membre m=null;
        String lm,nm,mdpm;
        System.out.println("Veuillez saisir le login du membre:");
        lm=Clavier.lireString();
        System.out.println("Veuillez saisir votre mot de passe :");
        mdpm=Clavier.lireString();
        if (!listMembre.isEmpty())
        {
          for (int i=0; i<listMembre.size(); i++)
            {
               if ((listMembre.get(i).getLoginMembre().equalsIgnoreCase(lm))&& (listMembre.get(i).getMotDePasseMembre().equalsIgnoreCase(mdpm)));
                {
                    m = listMembre.get(i);
                }
            }
        }
        return m;
    }
          public void AfficherSalle()
 {
 String n;
 ArrayList<Salle> list;
 System.out.println("Donner le nom de la salle ");
 n = Clavier.lireString();
 list = gs.recherchelistSalle(n);
 if (!list.isEmpty()) {
 for (int i = 0; i<list.size();i++)
 {
 System.out.println("ville :" + list.get(i).getVille());
 System.out.println("région :" + list.get(i).getRegion());
 System.out.println("adresse :" + list.get(i).getAdresse());
 System.out.println("Nombre de places :" + list.get(i).getNombrePlaces());
 }
 }}







}
 
    
   
            
    
    
            
            
            
            
            
            
            
            
            
            

