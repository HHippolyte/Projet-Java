/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDomaine;
import Domaine.*; 
import java.util.*;
/**
 *
 * @author Maximilien
 */
public class GestionReservation {
    private ArrayList<Reservation> listReservation;
    
    public GestionReservation()
    {       
        listReservation=new ArrayList();
    }

    public ArrayList<Reservation> getListReservation() {     
        return listReservation;
    }  
    public void setListReservation(ArrayList<Reservation> listReservation)
            {        this.listReservation = listReservation;    }
    
public Reservation créerReservation (int numres, String nomres,  int nbplaces,Date daterés, Abonne proc, Evenement reser)     
    {
        Reservation r;
        r=new Reservation (numres,nomres,nbplaces,daterés,proc,reser);
        listReservation.add(r);        
        return r;
    }


 public Reservation RechercheRéservation (String nomres)  
    {
            Reservation r = null;
        if (!listReservation.isEmpty()) 
{
        for (int i=0; i<listReservation.size(); i++)
    {
 if (listReservation.get(i).getNomreserv().equalsIgnoreCase(nomres))
 {
 r = listReservation.get(i);
 }
 }
 }
 return r;

    }
}
 
