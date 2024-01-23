package pack;

public class Employe extends Personne{
    private String fonction;
    private Date date_dembauche;
    private String situation;
    private static double salaire;
    private Date dateact;
public void affiche(){
    super.affiche();
    System.out.println("\nla fonction :"+fonction+"\n le date dembauche :"+date_dembauche+"\n la situation :"+Situation()+"\n salaire :"+salaire+"\n date actuelle : "+dateact);
}
    public  int calculerAnciennete() {
       
        int diffAnnees = dateact.getYear() - date_dembauche.getYear();

        
        int diffMois = dateact.getMonth() - date_dembauche.getMonth();

       
        int diffJours = dateact.getDay() - date_dembauche.getDay();

      
        if (diffJours < 0) {
            diffMois = diffMois - 1;
            diffJours = joursDansMois(date_dembauche.getMonth(), date_dembauche.getYear()) - date_dembauche.getDay() + dateact.getDay();
        }

        
        if (diffMois < 0) {
            diffAnnees = diffAnnees - 1;
            diffMois = 12 + diffMois;
        }

        // Affichage ou utilisation de l'ancienneté
        // System.out.println("Ancienneté en années: " + diffAnnees);
        // System.out.println("Ancienneté en mois: " + diffMois);
        // System.out.println("Ancienneté en jours: " + diffJours);
        return diffAnnees;
    }
    private static int joursDansMois(int mois, int annee) {
        switch (mois) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return (estAnneeBissextile(annee)) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Mois invalide : " + mois);
        }
    }
    private static boolean estAnneeBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }
    public Employe(){
        super();
        fonction="";
        date_dembauche=new Date();
        situation=Situation();
        salaire=0;
        dateact=new Date();
        }
    public Employe(String fonction,Date date_dembauche,double salaire,String nom,String prenom,int cin,Date date_nissance){
        super(nom,prenom,cin,date_nissance);
        this.fonction = fonction;
        this.date_dembauche = date_dembauche;
        Employe.salaire = salaire;
    }
    public Employe(String fonction,Date date_dembauche,String situation,double salaire,String nom,String prenom,int cin,Date date_nissance ){
        super(nom,prenom,cin,date_nissance);
        this.fonction = fonction;
        this.date_dembauche = date_dembauche;
        this.situation = Situation();
        Employe.salaire = salaire;
    
    } 
    public Employe(String fonction,Date date_dembauche,String situation,double salaire,Personne p ){
        super();
        nom=p.nom;
        prenom=p.prenom;
        this.date_nissance=p.date_nissance;
        this.fonction = fonction;
        this.date_dembauche = date_dembauche;
        this.situation = Situation();
        Employe.salaire = salaire;
    }
        public Employe(String fonction,Date date_dembauche,double salaire,Personne p ){
        super();
        nom=p.nom;
        prenom=p.prenom;
        cin=p.cin;
        this.date_nissance=p.date_nissance;
        this.fonction = fonction;
        this.date_dembauche = date_dembauche;
        Employe.salaire = salaire;
    
    }
    public Employe(String fonction,Date dateact,Date date_dembauche,double salaire,Personne p ){
        super();
        nom=p.nom;
        prenom=p.prenom;
        cin=p.cin;
        this.date_nissance=p.date_nissance;
        this.fonction = fonction;
        this.date_dembauche = date_dembauche;
        Employe.salaire = salaire;
        this.dateact=dateact;
    
    }
    public  String Situation(){
         if (calculerAnciennete()>=4){
         situation="titulaire";
         return situation;}
         else {situation="contractuelle";
         return situation;
         }
     }
     public String getSituation(){
        return situation;
    }
    public void setSituation(String situation){
        this.situation=situation;
    }
    public static double getSalaire(){
        return salaire;
    }
    public  void setSalaire(double salaire){
        Employe.salaire=salaire;
    }
    public Date getDate_dembauche(){
        return date_dembauche;
    }
    public void setDate_dembauche(int day,int month,int year){
        date_dembauche.setDay(day);
        date_dembauche.setMonth(month);
        date_dembauche.setYear(year);
    }
    public void setDate_dembauche(Date d){
        date_dembauche=d;
    }
    public void Salaire(){
        if (calculerAnciennete()>=5){
            if (dateact.getMonth() % 4 == 0) {
                salaire += salaire;
                }
       }
   }
   public String getrtsituation(){
    return Situation();
   }

   public int calculerAge() {
    int age = 0;

    if (dateact.getMonth() > date_nissance.getMonth() || (dateact.getMonth() == date_nissance.getMonth()&& dateact.getDay() >= date_nissance.getDay())) {
        age = dateact.getYear() -date_nissance.getYear();
    } else {
        age = dateact.getYear() - date_nissance.getYear() - 1;
    }

    return age;
}
public String toString(){
    return "\nla fonction :"+fonction+"\n le date dembauche :"+date_dembauche.toString()+"\n la situation :"+Situation()+"\n salaire :"+salaire+"\n date actuelle : "+dateact.toString() ;
}
}




