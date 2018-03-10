/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDomaine;
import Domaine.*; 
import java.util.*;


public class GestionSalle {
    private ArrayList<Salle>listSalle;
    
    public GestionSalle ()
    {
        listSalle=new ArrayList ();
        
    }

    public ArrayList<Salle> getListSalle() {
        return listSalle;
    }

    public void setListSalle(ArrayList<Salle> listSalle) {
        this.listSalle = listSalle;
    }
    public Salle créerSalle (String n, String v, String r, String a, int nbp)
    {
        Salle s;
        s=new Salle (n,v,r,a,nbp);
        listSalle.add(s);
        return s;
    }
  public Salle RechercherSalle (String n)  
    {
 Salle s = null;
 System.out.println("Nom de la salle :");
 n=Clavier.lireString();
 if (!listSalle.isEmpty()) {
 for (int i=0; i<listSalle.size(); i++)
 {
 if (listSalle.get(i).getNomSalle().equalsIgnoreCase(n))
 {
 s = listSalle.get(i);
 }
 }
 }
 return s;

    }
    public Salle RechercheSalle (String n)  
    {
 Salle s = null;
 if (!listSalle.isEmpty()) {
 for (int i=0; i<listSalle.size(); i++)
 {
 if (listSalle.get(i).getNomSalle().equalsIgnoreCase(n))
 {
 s = listSalle.get(i);
 }
 }
 }
 return s;

    }

    public void SupprimerSalle ()
    {
        Salle s;
        String n;
        boolean bo;
        System.out.println("Nom de la salle à supprimer:");
        n=Clavier.lireString();
        s=RechercheSalle(n);
        if (s!=null)
        {   
            listSalle.remove(s);
            System.out.println("Salle supprimée");
        }
        else 
        {
            System.out.println("Salle inexistante");
        }}
    public ArrayList<Salle> recherchelistSalle(String n)
 {
 ArrayList<Salle> list;
 list = new ArrayList();
 if (!listSalle.isEmpty()) {
 for (int i=0; i<listSalle.size(); i++)
 {
 if (listSalle.get(i).getNomSalle().equalsIgnoreCase(n))
 {
 list.add(listSalle.get(i));
 }
 }
 }
return list;      
}

 public void AfficherSalle()
 {
        int i;
        Salle s;
        if (!listSalle.isEmpty()) {
            for (i=0; i<listSalle.size();i++)
         {
                System.out.println("ville :" + listSalle.get(i).getVille());
                System.out.println("région :" + listSalle.get(i).getRegion());
                System.out.println("adresse :" + listSalle.get(i).getAdresse());
                System.out.println("Nombre de places :" + listSalle.get(i).getNombrePlaces());
 }
        }}


}