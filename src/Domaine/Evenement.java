

package Domaine;
import java.util.Date;
/**
 *
 * @author Maximilien
 */
public class Evenement {
    private String numeven;
    private String type;
    private String titre; 
    private String detail;
    private String VilleConcerne;
    private int NombreSpectateursPotentiels; 
    private Date DatePrévue;
    private String etat;
    private Salle realise;
    private Membre valide;
    private Organisateur organ;
    public Evenement (String numeve, String t, String ti, String d,String vilcon, int nbs, Date dp,String et, Salle rea, Membre vali, Organisateur orga) throws Erreur
    {   
        if(dp.compareTo(new Date())<0)
                throw new Erreur ("date ne devant pas être inférieure à la date du jour");
        numeven=numeve;
        type=t;
        titre=ti;
        detail=d;
        VilleConcerne=vilcon;
        NombreSpectateursPotentiels=nbs;
        DatePrévue=dp;
        etat=et;
        realise=rea;
        valide=vali;
        organ=orga;
       
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

    public void setVilleConcerne(String VilleConcerne) {
        this.VilleConcerne = VilleConcerne;
    }
    

    public void setNombreSpectateursPotentiels(int NombreSpectateursPotentiels) {
        this.NombreSpectateursPotentiels = NombreSpectateursPotentiels;
    }

    public void setDatePrévue(Date dp) throws Erreur{
        if (dp.compareTo(new Date())<0)
            throw new Erreur ("Date ne devant pas être inférieure à la date du jour");
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

    public String getVilleConcerne() {
        return VilleConcerne;
    }
    

    public int getNombreSpectateursPotentiels() {
        return NombreSpectateursPotentiels;
    }

    public Date getDatePrévue() {
        return DatePrévue;
    }

    public String getEtat() {
        return etat;
    }

    public Salle getRealise() {
        return realise;
    }

    public void setRealise(Salle realise) {
        this.realise = realise;
    }

    public Membre getValide() {
        return valide;
    }

    public void setValide(Membre valide) {
        this.valide = valide;
    }

    public void setNumeven(String numeven) {
        this.numeven = numeven;
    }

    public void setOrgan(Organisateur organ) {
        this.organ = organ;
    }

    public String getNumeven() {
        return numeven;
    }

    public Organisateur getOrgan() {
        return organ;
    }
    public String getInfos(){
        return ("Référence :" +getNumeven()+ "titre :" +getTitre() + "détail :" +getDetail()+"Type :" +getType() +"Ville concernée :" +getVilleConcerne() + "Date prévue : " +getDatePrévue() +" Etat :" +getEtat()+ "Nombre spectateurs " +getNombreSpectateursPotentiels());
    }  
}
