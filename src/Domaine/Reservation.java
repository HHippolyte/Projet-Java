/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaine;
import java.util.Date;

/**
 *
 * @author Maximilien
 */
public class Reservation {
    static private int numreserv;
    private String nomreserv;
    private int nombreplaces;
    private Date dateréservation;
    private int nbspectateurs;
    private Evenement reserve;
    private Abonne procede;
    public Reservation (String numres, String nomres, int nbplaces,Date daterés, Abonne proc, Evenement reser)
    {   
        numreserv++;
        nomreserv=nomres;
        nombreplaces=nbplaces;
        dateréservation=daterés;
        reserve=reser;
        procede=proc;
        nbspectateurs=nbspectateurs;
    }

    public int getNbspectateurs() {
        return nbspectateurs=numreserv+nombreplaces;
    }
    public static int getNumreserv() {
        return numreserv;
    }

    public Reservation(int numres, String nomres, int nbplaces, Date daterés, Abonne proc, Evenement reser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNomreserv() {
        return nomreserv;
    }

    public void setNomreserv(String nomreserv) {
        this.nomreserv = nomreserv;
    }
    

    public int getNombreplaces() {
        return nombreplaces;
    }

    public Date getDateréservation() {
        return dateréservation;
    }

    public void setNumreserv(int numreserv) {
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
