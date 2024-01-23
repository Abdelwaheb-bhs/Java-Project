package pack;

public class Personne {
    protected String nom;
    protected String prenom ;
    protected int cin;
    protected  Date date_nissance;
    
    


public Personne(){
    nom="";
    prenom="";
    cin=0;
    date_nissance=new Date();
    
   }
public Personne(String nom,String prenom,int cin,Date date_nissance){
    this.nom=nom;
    this.prenom=prenom;
    this.cin=cin;
    this.date_nissance=date_nissance;
}
public Personne(String nom,String prenom,int cin,int day,int month,int year){
    this.nom=nom;
    this.prenom=prenom;
    this.cin=cin;
date_nissance=new Date(day,month,year);

}
public void affiche(){
    System.out.println("nom :"+nom+" prenom :"+prenom+" cin :"+cin+" date de nissance "+date_nissance.toString());
}
public String toString(){
    return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", date de naissance=" + date_nissance.toString() + "}";
}
   
    

public String getNom(){
    return nom;
}
public String getPrenom(){
    return prenom;
}
public int getCin(){
    return cin;
}
public Date getDate_nissancDate(){
    return date_nissance;
};
public void setNom(String nom){
    this.nom=nom;

}
    
}
