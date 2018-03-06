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
    public ArrayList<Salle> recherchesalle (String n)
    {
        ArrayList<Salle> list;
        list= new ArrayList();
        if(!listSalle.isEmpty()){
            for (int i=0; i<listSalle.size();i++)
            {
                if (listSalle.get(i).getNomSalle().equalsIgnoreCase(n))
                {
                    list.add(listSalle.get(i));
                }
            }
           }
    return list; 
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
    
    void suplistSalle ()
    {
        Salle s;
        String n = null;
        s=RechercheSalle(n);
        if (n!=null)
        {   
            listSalle.remove(n);
        }
        else 
        {
            System.out.println("Salle inexistante");
        }
    }
            
        
    
    
}
