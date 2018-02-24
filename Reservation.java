/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;
import java.util.Date;

/**
 *
 * @author Maximilien
 */
public class Reservation {
    private String numreserv;
    private int nombreplaces;
    private Date dateréservation;
    private Evenement reserve;
    private Abonne procede
    public Reservation (String numres, int nbplaces,Date daterés, Abonne pro, Evenement reser, abonne proc)
    {   
        numreserv=numres;
        nombreplaces=nbplaces;
        dateréservation=daterés;
        reserve=reser;
        procede=proc;
    }

    public String getNumreserv() {
        return numreserv;
    }
    

    public int getNombreplaces() {
        return nombreplaces;
    }

    public Date getDateréservation() {
        return dateréservation;
    }

    public void setNumreserv(String numreserv) {
        this.numreserv = numreserv;
    }
    
    
    public void setNombreplaces(int nombreplaces) {
        this.nombreplaces = nombreplaces;
    }

    public void setDateréservation(Date dateréservation) {
        this.dateréservation = dateréservation;
    }

    public void setReserve(Evenement reserve) {
        this.reserve = reserve;
    }

    public Evenement getReserve() {
        return reserve;
    }
    
     public void setProcede(Abonne procede) {
        this.procede = procede;
    }

    public Abonne getProcede() {
        return procede;
    }
   
    
}
