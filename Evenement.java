

package projetjava;
import java.util.Date;
/**
 *
 * @author Maximilien
 */
public class Evenement {
    private String type;
    private String titre; 
    private String detail;
    private int NombreSpectateurs; 
    private Date DatePrévue;
    private String etat;
    private Reservation reserve;
    public Evenement (String t, String ti, String d, int nbs, Date dp,String e, Reservation res)
    {
        type=t;
        titre=ti;
        detail=d;
        NombreSpectateurs=nbs;
        DatePrévue=dp;
        etat=e;
        reserve=res;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setNombreSpectateurs(int NombreSpectateurs) {
        this.NombreSpectateurs = NombreSpectateurs;
    }

    public void setDatePrévue(Date DatePrévue) {
        this.DatePrévue = DatePrévue;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    

    public String getType() {
        return type;
    }

    public String getTitre() {
        return titre;
    }

    public String getDetail() {
        return detail;
    }

    public int getNombreSpectateurs() {
        return NombreSpectateurs;
    }

    public Date getDatePrévue() {
        return DatePrévue;
    }

    public String getEtat() {
        return etat;
    }

    public Reservation getReserve() {
        return reserve;
    }

    public void setReserve(Reservation reserve) {
        this.reserve = reserve;
    }
    
    
    
}
