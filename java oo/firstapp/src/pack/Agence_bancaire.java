package pack;

public class Agence_bancaire {
    private int code;
    private String nom_banque;
    private String adresse;
    private Date date_lancement;
public Agence_bancaire(){
    this.code=0;
    this.nom_banque="NoName";
    this.adresse="NoAdresse";
    this.date_lancement=new Date();

     }
public Agence_bancaire(int code,String nom_banque,String adresse,int day,int month,int year){
    this.code=code;
    this.nom_banque=nom_banque;
    this.adresse=adresse;
    this.date_lancement=new Date(day,month,year);

     }
     public String toString(){
        return "\n code agence :"+code+"\nnom agence :"+nom_banque+"\naddresse :"+adresse+"\ndate lancement :"+date_lancement.toString();
     }
     public void affiche(){
        System.out.println(this.toString());
     }
     public String getNom_banque(){
        return nom_banque;
     }
     public void setNom_agence(String agence_nom){
        this.nom_banque=agence_nom;
     }
     public String getAddresee(){
      return adresse;
     }
     }




