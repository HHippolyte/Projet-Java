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
    private int nombreplaces;
    private Date dateréservation;
    private Abonne procede;
    public Reservation (int nbplaces,Date daterés, Abonne pro)
    {
        nombreplaces=nbplaces;
        dateréservation=daterés;
        procede=pro;
    }

    public int getNombreplaces() {
        return nombreplaces;
    }

    public Date getDateréservation() {
        return dateréservation;
    }

    public void setNombreplaces(int nombreplaces) {
        this.nombreplaces = nombreplaces;
    }

    public void setDateréservation(Date dateréservation) {
        this.dateréservation = dateréservation;
    }

    public void setProcede(Abonne procede) {
        this.procede = procede;
    }

    public Abonne getProcede() {
        return procede;
    }
    
}
