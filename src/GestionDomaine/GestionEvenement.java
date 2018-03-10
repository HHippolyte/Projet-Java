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
public class GestionEvenement {
    private ArrayList<Evenement> listEvenement;
    public GestionEvenement()
    {
        listEvenement=new ArrayList();
    }
    
    public void setListEvenement(ArrayList<Evenement> listEvenement) {
        this.listEvenement = listEvenement;
    }

    public ArrayList<Evenement> getListEvenement() {
        return listEvenement;
    }
    
     public Evenement créerEvenement (String numeve, String t, String ti, String d,String vilcon, int nbs, Date dp,String et, Salle rea, Membre vali, Organisateur orga) 
    {  
    try{
        Evenement eve;
        eve=new Evenement (numeve,t,ti,d,vilcon,nbs,dp,et,rea,vali,orga);
        listEvenement.add(eve);
        return eve;
    }
    catch (Erreur e){
        System.out.println(e.getMessage());
        
    }
        return null;
    } 
     
      public Evenement RechercheEvenement (String numeve)  
    {
            Evenement eve = null;
        if (!listEvenement.isEmpty()) {
        for (int i=0; i<listEvenement.size(); i++)
    {
 if (listEvenement.get(i).getNumeven().equalsIgnoreCase(numeve))
 {
 eve = listEvenement.get(i);
 }
 }
 }
 return eve;

    }
      
        public ArrayList<Evenement> recherchelistEvenement(String numeve)
 {
 ArrayList<Evenement> list;
 list = new ArrayList();
 if (!listEvenement.isEmpty()) {
 for (int i=0; i<listEvenement.size(); i++)
 {
 if (listEvenement.get(i).getNumeven().equalsIgnoreCase(numeve))
 {
 list.add(listEvenement.get(i));
 }
 }
 }
return list;      
}
        public Evenement annulerEvenement()
{
    Evenement eve=null;
  return eve;  
}
         public void AfficherEvenement()
 {
        int i;
        Evenement eve;
        Reservation r;
        if (!listEvenement.isEmpty()) {
            for (i=0; i<listEvenement.size();i++)
         {
                System.out.println("Numéro de l'évènement:" + listEvenement.get(i).getNumeven());
                System.out.println("Titre de l'évènement :"+ listEvenement.get(i).getTitre());
                System.out.println("Type d'évènement :" + listEvenement.get(i).getType());
                System.out.println("Détails de l'évènement:" + listEvenement.get(i).getDetail());
                System.out.println("Ville où l'évènement a lieu :" + listEvenement.get(i).getVilleConcerne());
                System.out.println("Nombres de spectateurs prévus:" + listEvenement.get(i).getNombreSpectateursPotentiels());
                System.out.println("Date prévue:" + listEvenement.get(i).getDatePrévue());
                System.out.println("Etat del'évènement:" + listEvenement.get(i).getEtat());
                
                
         }
      
}
 }
  
}


